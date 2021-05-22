package intities;

public class Individual extends TaxPay {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anaualcome, Double healthExpenditures) {
		super(name, anaualcome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double imp = 0.0;
		if (getAnaualcome() < 20000.00) {
			imp += (getAnaualcome() * 0.15) - (healthExpenditures * 0.50);
		} else {
			imp += (getAnaualcome() * 0.25) - (healthExpenditures * 0.50);
		}
		return imp;
	}

	@Override
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", tax());
	}

}

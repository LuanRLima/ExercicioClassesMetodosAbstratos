package intities;

public class Company extends TaxPay {
	private Integer numberOfEmployees;

	@Override
	public Double tax() {
		Double imp = 0.0;
		if (numberOfEmployees <= 10) {
			imp += getAnaualcome() * 0.16;
		} else {
			imp += getAnaualcome() * 0.14;
		}
		return imp;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company() {
		super();
	}

	public Company(String name, Double anaualcome, Integer numberOfEmployees) {
		super(name, anaualcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", tax());
	}

}

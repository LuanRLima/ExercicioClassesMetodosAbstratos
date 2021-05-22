package intities;

public abstract class TaxPay {
	private String name;
	private Double anaualcome;

	public abstract Double tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnaualcome() {
		return anaualcome;
	}

	public void setAnaualcome(Double anaualcome) {
		this.anaualcome = anaualcome;
	}

	public TaxPay() {

	}

	public TaxPay(String name, Double anaualcome) {

		this.name = name;
		this.anaualcome = anaualcome;
	}

	@Override
	public String toString() {
		return name + ": $ " + tax();
	}

}

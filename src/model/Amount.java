package model;

public class Amount {
	private double value;
	final private String currency = "€";
	
	public Amount(double value) {
		super();
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getCurreny() {
		return currency;
	}
	
	public int getAmount() {
		return (int) value;
	}
	
	@Override
	public String toString() {
		return value + currency;
	}
	
	
}



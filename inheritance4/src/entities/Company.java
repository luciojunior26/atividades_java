package entities;

import entities.abstracts.Payer;

public class Company extends Payer {
	
	private Integer numberEmployees;
	private final double TAX_LESS_EMPLOYESS = 0.16;
	private final double TAX_MORE_EMPLOYESS = 0.14;
	
	public Company() {
	}
		
	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}
		
	@Override
	public double tax() {
		// return this.numberEmployees > 10 ? getAnualIncome() - (getAnualIncome()/TAX_MORE_EMPLOYESS) : getAnualIncome() - (getAnualIncome()/TAX_LESS_EMPLOYESS);
		double tax = getAnualIncome();
		if (numberEmployees > 10) {
			return tax * TAX_MORE_EMPLOYESS;
		} 
		return tax * TAX_LESS_EMPLOYESS;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	

}

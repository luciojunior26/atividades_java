package entities;

import entities.abstracts.Payer;

public class Individual extends Payer{

		private Double healthValue;
		
		public Individual() {
		}
				
		public Individual(String name, Double anualIncome, Double healthValue) {
			super(name, anualIncome);
			this.healthValue = healthValue;
		}

		@Override
		public double tax() {
			double healthTax = healthValue/2;
			if (getAnualIncome() < 20000.0) {
				return getAnualIncome()/0.15 - healthTax; 
			} 
			return getAnualIncome()/0.25 - healthTax; 
		}

		public Double getHealthValue() {
			return healthValue;
		}

		public void setHealthValue(Double healthValue) {
			this.healthValue = healthValue;
		}
		
		
}

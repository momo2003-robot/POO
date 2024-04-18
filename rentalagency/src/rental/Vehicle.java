package rental;

public class Vehicle {

	private String brand;
	private String model;
	private int productionYear;
	private double dailyRentalPrice;

	/**
	 * creates a vehivle with given informations
	 * 
	 * @param brand the vehicle's brand
	 * @param model the vehicle's model
	 * @param productionYear the vehicle's production year
	 * @param dailyRentalPrice the daily rental price
	 */
	public Vehicle(String brand, String model, int productionYear, double dailyRentalPrice) {
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
		this.dailyRentalPrice = dailyRentalPrice;
	}

	/**
	 * @return the brand for this vehicle
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * @return the modelfor this vehicle
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the production year for this vehicle
	 */
	public int getProductionYear() {
		return this.productionYear;
	}

	/**
	 * @return this vehicle daily price
	 */
	public double getDailyPrice() {
		return this.dailyRentalPrice;
	}

	/**
	 * this vehicle is equals to another if they have same brand, model,
	 * production year and daily rental price
	 * 
    * @param o the object to test equality with
    * @return true if o is a vehicle with same feature values
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		if (o instanceof Vehicle) {
			Vehicle theOther = ((Vehicle) o);
			return this.brand.equals(theOther.brand) 
					&& this.model.equals(theOther.model)
					&& this.productionYear == theOther.productionYear
					&& this.dailyRentalPrice == theOther.dailyRentalPrice;
		} else {
			return false;
		}
	}
    /**
     * Returns a string representation of the Car object, including details inherited from the Vehicle class
     * and information about the number of passengers.
     * @return a string representation of the Vehicle object
     */
	public String toString() {
		return this.productionYear + " " + this.brand + " " + this.dailyRentalPrice+" €";
	}
}

package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxservice;

	public RentalService() {
		super();
	}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxservice) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxservice = taxservice;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getDateStart().getTime();
		long t2 = carRental.getDateFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicService;
		if (hours <= 12) {
			basicService = Math.ceil(hours) *  pricePerHour;
		}else {
			basicService = Math.ceil(hours / 24) * pricePerDay;
		}
		
		double tax = taxservice.tax(basicService);
		
		carRental.setInvoice(new Invoice( basicService, tax));
	}

}

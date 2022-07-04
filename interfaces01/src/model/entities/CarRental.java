package model.entities;

import java.util.Date;

public class CarRental {

	private Date dateStart;
	private Date dateFinish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental() {

	}

	public CarRental(Date dateStart, Date dateFinish, Vehicle vehicle) {

		this.dateStart = dateStart;
		this.dateFinish = dateFinish;
		this.vehicle = vehicle;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateFinish() {
		return dateFinish;
	}

	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
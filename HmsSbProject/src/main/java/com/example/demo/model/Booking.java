package com.example.demo.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private int bookingId;
	private int cusId;
	private int venId;
	private int roomId;
	private String walSource;
	private Date bookingDate;
	private int bookingQuantity;
	private double bookingBillamount;
	private String bookingStatus;
	private String bookingComments;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getWalSource() {
		return walSource;
	}

	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getBookingQuantity() {
		return bookingQuantity;
	}

	public void setBookingQuantity(int bookingQuantity) {
		this.bookingQuantity = bookingQuantity;
	}

	public double getBookingBillamount() {
		return bookingBillamount;
	}

	public void setBookingBillamount(double bookingBillamount) {
		this.bookingBillamount = bookingBillamount;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getBookingComments() {
		return bookingComments;
	}

	public void setBookingComments(String bookingComments) {
		this.bookingComments = bookingComments;
	}

}

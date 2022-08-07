package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {

	@Id
	private int roomId;
	private String roomItem;
	private double roomPrice;
	private double roomBeds;
	private String roomSpeciality;
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomItem() {
		return roomItem;
	}
	public void setRoomItem(String roomItem) {
		this.roomItem = roomItem;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public double getRoomBeds() {
		return roomBeds;
	}
	public void setRoomBeds(double roomBeds) {
		this.roomBeds = roomBeds;
	}
	public String getRoomSpeciality() {
		return roomSpeciality;
	}
	public void setRoomSpeciality(String roomSpeciality) {
		this.roomSpeciality = roomSpeciality;
	}
	
	
}

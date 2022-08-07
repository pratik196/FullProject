package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookingDAO;
import com.example.demo.dao.RoomDAO;
import com.example.demo.dao.WalletDAO;
import com.example.demo.model.Booking;
import com.example.demo.model.Room;
import com.example.demo.model.Wallet;
import com.example.demo.repository.BookingRepository;

@Service
@Transactional
public class BookingService {
	@Autowired
    private BookingRepository repo;
	@Autowired
	private BookingDAO dao;
	@Autowired 
	private RoomDAO mdao;
	@Autowired 
	private WalletDAO wdao;
	@Autowired
	private BookingDAO odao;

	
	public String acceptOrRejectBooking(int bookingId, int venId, String status) {
		Booking booking = odao.searchByBookingId(bookingId);
		int vid = booking.getVenId();
		int cid = booking.getCusId();
		String walType = booking.getWalSource();
		double billAmount = booking.getBookingBillamount();
		if (vid!=venId) {
			return "You are unauthorized vendor...";
		} 
		if (status.toUpperCase().equals("YES")) {
			return odao.updateStatus(bookingId,"ACCEPTED");
		} else {
			odao.updateStatus(bookingId, "DENIED");
			wdao.refundWallet(cid, walType, billAmount);
			return "Booking Rejected and Amount Refunded...";
		}
	}
	public String placeBooking(Booking book) {
		Room room = mdao.searchRoom(book.getRoomId());
		Wallet wallet = wdao.showCustomerWallet(book.getCusId(), book.getWalSource());
		double balance = wallet.getWalAmount();
		double billAmount = book.getBookingQuantity()*room.getRoomPrice();
		System.out.println(balance);
		System.out.println(billAmount);
		if (balance-billAmount > 0) {
			book.setBookingStatus("PENDING");
			book.setBookingBillamount(book.getBookingQuantity()*room.getRoomPrice());
			repo.save(book);
			wdao.updateWallet(book.getCusId(), book.getWalSource(), billAmount);
			return "Room Booking Successfully...and Amount Debited";
		}
		return "Insufficient Funds...";
	}
	
	public List<Booking> showVendorPendingBooking(int venId) {
		return dao.showVendorPendingBooking(venId);
	}
	public List<Booking> showVendorBooking(int venId) {
		return dao.showVendorBooking(venId);
	}
	public List<Booking> showCustomerBooking(int custId) {
		return dao.showCustomerBooking(custId);
	}
	public List<Booking> showCustomerPendingBooking(int custId) {
		return dao.showCustomerPendingBooking(custId);
	}
	public Booking search(int bookingId) {
		return repo.findById(bookingId).get();
	}
	public List<Booking> showBooking() {
		return repo.findAll();
	}

}

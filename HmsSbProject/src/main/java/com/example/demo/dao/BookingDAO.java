package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Booking;

@Repository
public class BookingDAO {
	
	@Autowired  
    JdbcTemplate jdbc;  
	
	public Booking searchByBookingId(int bookingId) {
		String cmd = "select * from Booking where booking_id=?";
		List<Booking> bookingList=null;
		bookingList=jdbc.query(cmd,new Object[] {bookingId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BOOKING_ID"));
				booking.setCusId(rs.getInt("CUS_ID"));
				booking.setVenId(rs.getInt("VEN_ID"));
				booking.setWalSource(rs.getString("WAL_SOURCE"));
				booking.setRoomId(rs.getInt("ROOM_ID"));
				booking.setBookingDate(rs.getDate("BOOKING_DATE"));
				booking.setBookingBillamount(rs.getDouble("BOOKING_BILLAMOUNT"));
				booking.setBookingStatus(rs.getString("BOOKING_STATUS"));
				booking.setBookingComments(rs.getString("BOOKING_COMMENTS"));
				return booking;
			}
			
		});
		return bookingList.get(0);
	}
	
	public String updateStatus(int bookingId,String bookingStatus) {
		String cmd = "Update Booking set BOOKING_STATUS=? WHERE booking_Id=?";
		jdbc.update(cmd, new Object[] {bookingStatus,bookingId});
		return "Booking Accepted...";
	}
	
	
	public List<Booking> showVendorPendingBooking(int venId) {
		String cmd = "select * from Booking where BOOKING_STATUS='PENDING' AND ven_id=?";
		List<Booking> bookingList=null;
		bookingList=jdbc.query(cmd,new Object[] {venId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BOOKING_ID"));
				booking.setCusId(rs.getInt("CUS_ID"));
				booking.setVenId(rs.getInt("VEN_ID"));
				booking.setWalSource(rs.getString("WAL_SOURCE"));
				booking.setBookingQuantity(rs.getInt("BOOKING_QUANTITY"));
				booking.setRoomId(rs.getInt("ROOM_ID"));
				booking.setBookingDate(rs.getDate("BOOKING_DATE"));
				booking.setBookingBillamount(rs.getDouble("BOOKING_BILLAMOUNT"));
				booking.setBookingStatus(rs.getString("BOOKING_STATUS"));
				booking.setBookingComments(rs.getString("BOOKING_COMMENTS"));
				return booking;
			}
			
		});
		return bookingList;
	}
	
	public List<Booking> showVendorBooking(int venId) {
		String cmd = "select * from Booking where ven_id=?";
		List<Booking> bookingList=null;
		bookingList=jdbc.query(cmd,new Object[] {venId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BOOKING_ID"));
				booking.setCusId(rs.getInt("CUS_ID"));
				booking.setVenId(rs.getInt("VEN_ID"));
				booking.setWalSource(rs.getString("WAL_SOURCE"));
				booking.setBookingQuantity(rs.getInt("BOOKING_QUANTITY"));
				booking.setRoomId(rs.getInt("ROOM_ID"));
				booking.setBookingDate(rs.getDate("BOOKING_DATE"));
				booking.setBookingBillamount(rs.getDouble("BOOKING_BILLAMOUNT"));
				booking.setBookingStatus(rs.getString("BOOKING_STATUS"));
				booking.setBookingComments(rs.getString("BOOKING_COMMENTS"));
				return booking;
			}
			
		});
		return bookingList;
	}
	
	public List<Booking> showCustomerPendingBooking(int custId) {
		String cmd = "select * from Booking where  cus_id=?";
		List<Booking> bookingList=null;
		bookingList=jdbc.query(cmd,new Object[] {custId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BOOKING_ID"));
				booking.setCusId(rs.getInt("CUS_ID"));
				booking.setVenId(rs.getInt("VEN_ID"));
				booking.setWalSource(rs.getString("WAL_SOURCE"));
				booking.setBookingQuantity(rs.getInt("BOOKING_QUANTITY"));
				booking.setRoomId(rs.getInt("ROOM_ID"));
				booking.setBookingDate(rs.getDate("BOOKING_DATE"));
				booking.setBookingBillamount(rs.getDouble("BOOKING_BILLAMOUNT"));
				booking.setBookingStatus(rs.getString("BOOKING_STATUS"));
				booking.setBookingComments(rs.getString("BOOKING_COMMENTS"));
				return booking;
			}
			
		});
		return bookingList;
	}
	public List<Booking> showCustomerBooking(int custId) {
		String cmd = "select * from Booking where BOOKING_STATUS='PENDING' AND cus_id=?";
		List<Booking> bookingList=null;
		bookingList=jdbc.query(cmd,new Object[] {custId}, new RowMapper<Booking>() {

			@Override
			public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
				Booking booking = new Booking();
				booking.setBookingId(rs.getInt("BOOKING_ID"));
				booking.setCusId(rs.getInt("CUS_ID"));
				booking.setVenId(rs.getInt("VEN_ID"));
				booking.setWalSource(rs.getString("WAL_SOURCE"));
				booking.setBookingQuantity(rs.getInt("BOOKING_QUANTITY"));
				booking.setRoomId(rs.getInt("ROOM_ID"));
				booking.setBookingDate(rs.getDate("BOOKING_DATE"));
				booking.setBookingBillamount(rs.getDouble("BOOKING_BILLAMOUNT"));
				booking.setBookingStatus(rs.getString("BOOKING_STATUS"));
				booking.setBookingComments(rs.getString("BOOKING_COMMENTS"));
				return booking;
			}
			
		});
		return bookingList;
	}

}

package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Room;

@Repository
public class RoomDAO {
	@Autowired
	JdbcTemplate jdbc;

	public Room searchRoom(int roomId) {
		String cmd = "select * from Room where room_id=?";
		List<Room> roomList = jdbc.query(cmd, new Object[] { roomId }, new RowMapper<Room>() {

			@Override
			public Room mapRow(ResultSet rs, int arg1) throws SQLException {
				Room room = new Room();
				room.setRoomId(rs.getInt("ROOM_ID"));
				room.setRoomItem(rs.getString("ROOM_ITEM"));
				room.setRoomPrice(rs.getDouble("ROOM_PRICE"));
				room.setRoomBeds(rs.getInt("ROOM_BEDS"));
				room.setRoomSpeciality(rs.getString("ROOM_SPECIALITY"));
				return room;
			}

		});
		return roomList.get(0);
	}
}

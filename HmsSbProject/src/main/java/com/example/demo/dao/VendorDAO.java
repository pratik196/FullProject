package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Vendor;

@Repository
public class VendorDAO {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from Vendor where Ven_UserName=? "
				+ " AND Ven_Password=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
	
	public Vendor searchByVendorName(String userName) {
		String cmd = "select * from Vendor where Ven_UserName=?";
		List<Vendor> venList = jdbc.query(cmd, new Object[] {userName}, new RowMapper<Vendor>() {

			@Override
			public Vendor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Vendor vendor = new Vendor();
				vendor.setVenId(rs.getInt("VEN_ID"));
				vendor.setVenName(rs.getString("VEN_NAME"));
				vendor.setVenPhnNo(rs.getString("VEN_PHN_NO"));
				vendor.setVenUsername(rs.getString("VEN_USERNAME"));
				vendor.setVenPassword(rs.getString("VEN_PASSWORD"));
				vendor.setVenEmail(rs.getString("VEN_EMAIL"));
				return vendor;
			}
			
		});
		return venList.get(0);
	}
}

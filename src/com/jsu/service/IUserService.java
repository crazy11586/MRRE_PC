package com.jsu.service;

import java.sql.SQLException;
import java.util.List;

import com.jsu.po.Users;

public interface IUserService {
	
	public void saveUser(Users user) throws SQLException;  
	  
    public void delUser(Users user) throws SQLException;  
  
    public void editUsre(Users user) throws SQLException;  

    public List getUserByname(String username) throws SQLException;  
    
}

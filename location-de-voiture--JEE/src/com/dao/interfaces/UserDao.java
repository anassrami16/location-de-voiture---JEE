package com.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.moduls.User;

public interface UserDao {
	
    public Boolean findSpecificByEmail(String email) throws SQLException;
//    public List<User> findAllUsers() throws SQLException;
    public int insertUser(User user) throws SQLException;
//    public boolean updateUser(User user) throws SQLException;
//    public boolean deleteUser(User user) throws SQLException;
//    public String getImageProfile(User user) throws SQLException;
//    public void setImageProfile(User user) throws  SQLException;
	int UpdateUser(User user) throws SQLException;
	User findSpecificUserByEmail(String email) throws SQLException;
	void DeleteUser(String email) throws SQLException;
}

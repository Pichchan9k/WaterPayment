package th.co.aware.dao;

import th.co.aware.bean.User;

public interface UserDao {
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public User getUser(String id);
	
	public User validateLogin(String username,String password);
}

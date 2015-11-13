package th.co.aware.services;

import th.co.aware.bean.User;

public interface UserService {
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public User getUser(String username,String password,Integer id);
	
	public User validateLogin(String username,String password,Integer id);
	
}

package th.co.aware.services;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.User;
import th.co.aware.dao.UserDao;

public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userdao;
	
	@Override
	public void insertUser(User user) {
		userdao.insertUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(String username,String password,Integer id) {
		return userdao.validateLogin(username, password);
	}

	@Override
	public User validateLogin(String username,String password,Integer id) {
		User login = userdao.validateLogin(username, password);
		if( login != null){
			return login;
		} else {
			return null;
		}
	}

}

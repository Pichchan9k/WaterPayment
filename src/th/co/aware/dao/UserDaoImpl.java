package th.co.aware.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import th.co.aware.bean.User;

public class UserDaoImpl implements UserDao{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public void insertUser(User user) {
		String sql = "INSERT INTO user "
				+ "(username,password) VALUES (?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(
				sql,new Object[] { user.getUser(),user.getPassword()});
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}

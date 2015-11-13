package th.co.aware.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import th.co.aware.bean.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;

	@Override
	public void insertUser(User user) {
		String sql = "INSERT INTO user(c_username,c_password) VALUES(?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[] { user.getC_username(), user.getC_password() });
	}

	@Override
	public User getUser(String id) {
		String sql = "SELECT * FROM user where c_id like '"+id+"'";
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		List<User> obj = jdbc.query(sql,new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setC_id(rs.getInt("c_id"));
				return user;
			}
		});
		if(obj!=null&&obj.size()>0){
			return obj.get(0);
		}else{
			return null;
		}
		
	}

	@Override
	public User validateLogin(String username, String password) {
		String sql = "SELECT * FROM user where c_username like '"+username + "' and c_password like '" +password +"'";
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		List<User> obj = jdbc.query(sql,new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user = new User();
				user.setC_id(rs.getInt("c_id"));
				user.setC_username(rs.getString("c_username"));
				user.setC_username(rs.getString("c_password"));
				user.setW_id(rs.getInt("w_id"));
				return user;
			}
		});
		if(obj!=null&&obj.size()>0){
			return obj.get(0);
		}else{
			return null;
		}
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
}

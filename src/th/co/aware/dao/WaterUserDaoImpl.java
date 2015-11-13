package th.co.aware.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import th.co.aware.bean.User;
import th.co.aware.bean.WaterInformation;

public class WaterUserDaoImpl implements WaterUserDao{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public void insertWaterUser(WaterInformation wateruser,User user) {
		String sql = "UPDATE user SET w_id = ? where c_id = ?"  ;
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[] { wateruser.getW_id(), user.getC_id() });
	}



	@Override
	public WaterInformation checkUser(Integer branchno,Integer areano,Integer registrationno) {
		String sql = "SELECT * from wateruser where w_branchno = " + branchno 
					+ " and w_areano = " + areano +" and w_registrationno = " + registrationno;
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		List<WaterInformation> obj = jdbc.query(sql, new RowMapper<WaterInformation>(){

			@Override
			public WaterInformation mapRow(ResultSet rs, int arg1) throws SQLException {
				WaterInformation wif = new WaterInformation();
				wif.setW_id(rs.getInt("w_id"));
				wif.setW_branchno(rs.getInt("w_branchno"));
				wif.setW_areano(rs.getInt("w_areano"));
				wif.setW_registrationno(rs.getInt("w_registrationno"));
				return wif;
			}
		});
		if(obj.size()>0){
			System.out.println("dao not null");
			return obj.get(0);
		}else{
			System.out.println("dao null");
			return null;
		}
	}
	@Override
	public WaterInformation getWaterByid(WaterInformation waterInformation) {
		String sql = "SELECT * from wateruser where w_id = " +waterInformation.getW_id() ;
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		List<WaterInformation> obj = jdbc.query(sql, new RowMapper<WaterInformation>(){

			@Override
			public WaterInformation mapRow(ResultSet rs, int arg1) throws SQLException {
				WaterInformation wif = new WaterInformation();
				wif.setW_id(rs.getInt("w_id"));
				wif.setW_branchno(rs.getInt("w_branchno"));
				wif.setW_areano(rs.getInt("w_areano"));
				wif.setW_registrationno(rs.getInt("w_registrationno"));
				wif.setW_address(rs.getString("w_address"));
				wif.setW_name(rs.getString("w_name"));
				return wif;
			}
		});
		if(obj.size()>0){
			System.out.println("dao not null");
			return obj.get(0);
		}else{
			System.out.println("dao null");
			return null;
		}
	}

	@Override
	public WaterInformation getWaterUser(Integer branchno, Integer areano, Integer registrationno) {
		String sql = "SELECT * from wateruser where w_branchno like '" + branchno 
				+ "' and w_areano like '" + areano + "' and w_registrationno like '" + registrationno +"'";
	JdbcTemplate jdbc = new JdbcTemplate(dataSource);
	List<WaterInformation> obj = jdbc.query(sql, new RowMapper<WaterInformation>(){

		@Override
		public WaterInformation mapRow(ResultSet rs, int arg1) throws SQLException {
			WaterInformation wif = new WaterInformation();
			wif.setW_id(rs.getInt("w_id"));
			wif.setW_branchno(rs.getInt("w_branchno"));
			wif.setW_areano(rs.getInt("w_areano"));
			wif.setW_registrationno(rs.getInt("w_registrationno"));
			wif.setW_address(rs.getString("w_address"));
			wif.setW_name(rs.getString("w_name"));
			return wif;
		}
	});
	if(obj!=null&&obj.size()>0){
		return obj.get(0);
	}else{
		return null;
	}
	}

}

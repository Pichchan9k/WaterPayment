package th.co.aware.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import th.co.aware.bean.History;

public class HistoryDaoImpl implements HistoryDao{
	
	@Autowired
	DataSource dataSource;
	
	@Override
	public List<History> getHistory(History history) {
		String sql = "SELECT * FROM usehistory where c_id = "+ history.getC_id();
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		List<History> obj = jdbc.query(sql, new RowMapper<History>(){
			
			@Override
			public History mapRow(ResultSet rs, int arg1) throws SQLException {
				History history = new History();
				history.setH_id(rs.getInt("h_id"));
				history.setH_unit(rs.getInt("h_unit"));
				history.setH_total(rs.getInt("h_total"));
				history.setH_status(rs.getString("h_status"));
				history.setH_date(rs.getNString("h_date"));
				return history;
			}
			
		});
		if(obj.size()>0){
			System.out.println("dao not null");
			return obj;
		}else{
			System.out.println("dao null");
			return null;
		}
	}
}

package th.co.aware.dao;

import th.co.aware.bean.User;
import th.co.aware.bean.WaterInformation;;

public interface WaterUserDao {
	
	public void insertWaterUser(WaterInformation wateruser,User user);
	
	public WaterInformation checkUser(Integer branchno,Integer areano,Integer registrationno);
	
	public WaterInformation getWaterUser(Integer branchno,Integer areano,Integer registrationno); 
	public WaterInformation getWaterByid(WaterInformation waterInformation) ;
}

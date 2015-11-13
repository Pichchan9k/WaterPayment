package th.co.aware.services;

import th.co.aware.bean.User;
import th.co.aware.bean.WaterInformation;

public interface WaterUserService {
	
	public void insertWaterUser(WaterInformation waterinformation);
	
	public boolean validateWaterUser(Integer branchno,Integer areano,Integer registrationno,User user);
	
	public WaterInformation get(Integer branchno,Integer areano,Integer registrationno);
	public WaterInformation getWaterByid(WaterInformation waterInformation) ;
}	

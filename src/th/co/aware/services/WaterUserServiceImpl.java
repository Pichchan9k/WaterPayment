package th.co.aware.services;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.User;
import th.co.aware.bean.WaterInformation;
import th.co.aware.dao.UserDao;
import th.co.aware.dao.WaterUserDao;

public class WaterUserServiceImpl implements WaterUserService{

	@Autowired
	WaterUserDao wateruserdao;
	@Autowired
	UserDao userdao;

	@Override
	public void insertWaterUser(WaterInformation waterinformation) {
		
	}

	@Override
	public boolean validateWaterUser(Integer branchno, Integer areano, Integer registrationno,User user) {
		System.out.println(branchno + " " + areano + " " + registrationno);
		WaterInformation wif = wateruserdao.checkUser(branchno,areano,registrationno);
		//wif.setW_id(1);
	///	System.out.println(wif.getW_id());
		if( wif != null){
			System.out.println("in service true");
			
			wateruserdao.insertWaterUser(wif,user);
			return true;
		} else {
			System.out.println("in service false");
			return false;
		}
		
	}

	@Override
	public WaterInformation get(Integer branchno, Integer areano, Integer registrationno) {
		// TODO Auto-generated method stub
		return wateruserdao.getWaterUser(branchno, areano, registrationno);
	}

	@Override
	public WaterInformation getWaterByid(WaterInformation waterInformation) {
		// TODO Auto-generated method stub
		return wateruserdao.getWaterByid(waterInformation);
	}
	
}

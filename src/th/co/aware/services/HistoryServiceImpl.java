package th.co.aware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import th.co.aware.bean.History;
import th.co.aware.dao.HistoryDao;

public class HistoryServiceImpl implements HistoryService{
	
	@Autowired
	HistoryDao historydao;
	
	@Override
	public  List<History> getHistory(History history) {
		return historydao.getHistory(history);
	}
}

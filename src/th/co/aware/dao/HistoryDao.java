package th.co.aware.dao;

import java.util.List;

import th.co.aware.bean.History;

public interface HistoryDao {
	public List<History> getHistory(History history);
}

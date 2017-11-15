package top.starrysea.dao;

import top.starrysea.common.Condition;
import top.starrysea.common.DaoResult;
import top.starrysea.entity.Work;

public interface IWorkDao {
	DaoResult getAllWorkDao(Condition condition,Work work);
	
	DaoResult getWorkCountDao(Condition condition,Work work);
	
	DaoResult getWorkDao(Work work);
	
	DaoResult saveWorkDao(Work work);
	
	DaoResult updateWorkStockDao(int stock);
	
	DaoResult deleteWorkDao(Work work);
	
}

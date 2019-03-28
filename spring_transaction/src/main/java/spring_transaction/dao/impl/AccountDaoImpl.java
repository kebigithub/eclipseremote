package spring_transaction.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import spring_transaction.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	public void out(String outname, Double money) {
		String sql="update t_account set money=? where name=?";
		super.getJdbcTemplate().update(sql, money,outname);
		
		
	}

	public void in(String inname, Double money) {
		String sql="update t_account set money=? where name=?";
		super.getJdbcTemplate().update(sql, money,inname);
		
	}

}

package spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import spring.transaction.service.Account;
import spring_transaction.dao.AccountDao;

public class AccountSevice implements Account{

	
	private AccountDao accountDao;
	
	
	public AccountDao getAccountDao() {
		return accountDao;
	}


	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public void transfer(String outName, String inName, Double money) {
		accountDao.out(outName, money);
		
		accountDao.in(inName, money);
		
		
	}

}

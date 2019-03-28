package spring_transaction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.transaction.service.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestDemo {
	
	
	@Autowired
	private Account account;
	
	@Test
	public void test() {
		account.transfer("tom", "jack", 1000.0);
	}

}

package spring_transaction.dao;

public interface AccountDao {
	
	//111111
	public void out(String outname,Double money);
	public void in(String inname,Double money);

}

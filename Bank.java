import java.util.LinkedList;
public class Bank {
	
	LinkedList<Account> accounts=new LinkedList<>();
	public String createAccount(int accNo,int amt)
	{
		Account account=new Account(accNo,amt);
		accounts.add(account);
		return "Account created succesfully";
	}
	private Account searchAccount(int accNO) throws InvalidAccountNoException
	{
		for(Account account:accounts)
		{
			if(account.getAccNo()==accNO)
			{
				return account;
			}
		}
		throw new  InvalidAccountNoException();
	}
	
	public int withDrawAmount(int accNo,int amount) throws InsufficientBalance, InvalidAccountNoException
	{
		Account account=searchAccount(accNo);
		if((account.getAmt()-amount)>=0)
		{
			account.setAmt(account.getAmt()-amount);
			return account.getAmt();
		}
		
		throw new InsufficientBalance();
	
}
	public int deposite(int accNo,int amount) throws InvalidAccountNoException
	{
		Account account=searchAccount(accNo);
		
		for(Account acc:accounts)
		{
			if(account.getAccNo()==accNo)
			{
		account.setAmt(account.getAmt()+amount);
		return account.getAmt();
	}
		
		
	}
		throw new  InvalidAccountNoException();
	}
	public int[] fundTransfer(int accNo1,int accNo2,int amount) throws InvalidAccountNoException,InsufficientBalance
	{
		int a[]=new int[2];
		Account account1=searchAccount(accNo1);
		Account account2=searchAccount(accNo2);
		for(Account acc:accounts)
		{
			if(account1.getAccNo()==accNo1&&account2.getAccNo()==accNo2)
			{
				if((account1.getAmt()-amount)>=0)
				{
					account1.setAmt(account1.getAmt()-amount);
					account2.setAmt(account2.getAmt()+amount);
					a[0]=account1.getAmt();
					a[1]=account2.getAmt();
					return a;
				}
				
				throw new InsufficientBalance();
			}
		
}
		throw new  InvalidAccountNoException();
}
}

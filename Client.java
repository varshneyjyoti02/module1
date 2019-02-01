
public class Client {

	public static void main(String[] args)
	{
		Bank bank=new Bank();
		System.out.println(bank.createAccount(101, 3000));
		System.out.println(bank.createAccount(102, 3000));
		try
		{
			System.out.println("Balance = "+bank.withDrawAmount(101, 2000));
			
		
		}catch(InvalidAccountNoException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalance ibe){
			System.out.println("insufficient balance");
		}
		try
		{
			System.out.println("Balance = "+bank.deposite(101, 2000));
			
		
		}catch(InvalidAccountNoException i)
		{
			System.out.println("Invalid account number ");
		}
		try
		{
			int a[]=new int[2];
			System.arraycopy(bank.fundTransfer(101,102, 2000),0,a,0,2);
			System.out.println("Balance1 = "+a[0]);
			System.out.println("Balance2 = "+a[1]);
			
		
		}catch(InvalidAccountNoException i)
		{
			System.out.println("Invalid account number ");
		}
		catch(InsufficientBalance ibe){
			System.out.println("insufficient balance");
		}
		
		

	}

}
	
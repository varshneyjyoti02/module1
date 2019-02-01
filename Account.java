
public class Account {
	private int accNo;
	private int amt;
	public Account(int accNo, int amt) {
		super();
		this.accNo = accNo;
		this.amt = amt;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", amt=" + amt + "]";
	}
	

}

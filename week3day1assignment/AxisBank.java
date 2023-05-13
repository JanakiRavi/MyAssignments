package week3day1assignment;

public class AxisBank extends BankInfo{

	@Override   //example for method overriding
	public void deposit() {
		
		System.out.println("Deposited amount 5000-->Axis");
	}
	
	
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();
	}

}

package NganHang;

import java.util.Scanner;

public class Account {
	private long AccNumber;
	private String AccName;
	private double AccAmount;
	public Account()
	{
		this.AccAmount = 50000;
	}
	public Account(long accNumber, String accName,double Amount) {
		AccNumber = accNumber;
		AccName = accName;
		AccAmount = Amount;
	}
	public long getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(long accNumber) {
		AccNumber = accNumber;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getAccAmount() {
		return AccAmount;
	}
	public void setAccAmount(double accAmount) {
		AccAmount = accAmount;
	}
	public double AddAmount(double Amount_add)
	{
		return AccAmount + Amount_add;
	}
	public void ReAmount( double Amount_Re)
	{
		
		if(AccAmount - 10000 < Amount_Re)
		{
			System.out.println("Tai khoan khong du ");
		}
		else
		{
		        AccAmount = AccAmount - (Amount_Re + 10000);
		        System.out.println("Da rut thanh cong "+Amount_Re+" so tien trong tk con "+AccAmount);
		}
	  
	}
	public void TRANSFER(Account acc2,double Amount_Transfer)
	{
		if(AccAmount < Amount_Transfer)
		{
			System.out.println("Tien trong tai khoan khong du ");
		}
		else
		{
			acc2.AccAmount = acc2.AccAmount + Amount_Transfer;
			AccAmount = AccAmount - Amount_Transfer;
			System.out.println("Chuyen thanh cong "+Amount_Transfer+" tu account_number :" + AccNumber +" to account_number :"+ acc2.AccNumber);
			System.out.println("so tien trong account number" + acc2.AccNumber + " = " +acc2.AccAmount);
			
		}
		
	}
	public double DaoHan()
	{
		AccAmount = + (AccAmount * 0.035);
		return AccAmount;
	}

	public void xuat()
	{
		System.out.print("Account Number\t Account Name \t Account Amount\n");
		System.out.print( ""+(long)AccNumber +"\t\t"+AccName+"\t\t"+AccAmount+"\n");
		
	}
	

}

package bai1;

import java.util.Scanner;

public class CongNhan  extends CanBo{
	private int capbac;

	public CongNhan(int capbac) {
		super();
		this.capbac = capbac;
	}

	public CongNhan() {
		super();
	}

	public int getCapbac() {
		return capbac;
	}

	public void setCapbac(int capbac) {
		this.capbac = capbac;
	}
	@Override
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap vao cap bac :");
		setCapbac(sc.nextInt());
	}
	@Override 
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Cap Bac : "+getCapbac());
	}

}

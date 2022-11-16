package bai1;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhdt;

	public KySu(String nganhdt) {
		super();
		this.nganhdt = nganhdt;
	}
	public KySu()
	{
		super();
	}
	public String getNganhdt() {
		return nganhdt;
	}
	public void setNganhdt(String nganhdt) {
		this.nganhdt = nganhdt;
	}
	@Override 
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap vao nganh dao tao :");
		setNganhdt(sc.nextLine());
	}
	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Nganh dao tao : "+getNganhdt());
	}
}

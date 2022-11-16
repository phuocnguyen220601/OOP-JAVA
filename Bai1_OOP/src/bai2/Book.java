package bai2;

import java.util.Scanner;
public class Book extends Document{
	private String Ten_tg;
	private int sotrang;
	public Book(String ma, String ten_nxb, int sobanph, String ten_tg, int sotrang) {
		super(ma, ten_nxb, sobanph);
		Ten_tg = ten_tg;
		this.sotrang = sotrang;
	}
	public Book() {
		super();
	}
	public String getTen_tg() {
		return Ten_tg;
	}
	public void setTen_tg(String ten_tg) {
		Ten_tg = ten_tg;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	@Override 
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap vao ten tac gia : ");
		setTen_tg(sc.nextLine());
		System.out.println("Nhap vao so trang : ");
		setSotrang(sc.nextInt());
	}
	@Override
	public void Xuat(int i)
	{
		super.Xuat(i);
		System.out.println("Ten tac gia : " + getTen_tg());
		System.out.println("So trang : " + getSotrang());
		System.out.println("=========================================");
	}

}

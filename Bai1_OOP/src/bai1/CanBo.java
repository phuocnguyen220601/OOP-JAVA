package bai1;

import java.util.Scanner;

public class CanBo {
	public String Ho_Ten;
	public String Gioi_Tinh;
	public int tuoi;
	public String Dia_Chi;
	
	public CanBo() {
		
		// TODO Auto-generated constructor stub
	}
	
	public CanBo(String ho_Ten, String gioi_Tinh, int tuoi, String dia_Chi) {
		Ho_Ten = ho_Ten;
		Gioi_Tinh = gioi_Tinh;
		this.tuoi = tuoi;
		Dia_Chi = dia_Chi;
	}
	public String getHo_Ten() {
		return Ho_Ten;
	}
	public void setHo_Ten(String ho_Ten) {
		Ho_Ten = ho_Ten;
	}
	public String getGioi_Tinh() {
		return Gioi_Tinh;
	}
	public void setGioi_Tinh(String gioi_Tinh) {
		Gioi_Tinh = gioi_Tinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDia_Chi() {
		return Dia_Chi;
	}
	public void setDia_Chi(String dia_Chi) {
		Dia_Chi = dia_Chi;
	}
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vaoo ho ten : ");
		setHo_Ten(sc.nextLine());
		System.out.println("Nhap vao tuoi :");
		setTuoi(sc.nextInt());
		System.out.println("Nhap vao gioi tinh (Nam/Nu/Khac) : ");
		setGioi_Tinh(sc.nextLine());
		setGioi_Tinh(sc.nextLine());
		System.out.println("Nhap vao dia chi :");
		setDia_Chi(sc.nextLine());
	}
	public void Xuat()
	{
		System.out.println("Ho Ten : " +getHo_Ten() );
		System.out.println("Tuoi : " + getTuoi());
		System.out.println("Gioi Tinh : "+getGioi_Tinh());
		System.out.println("Dia Chi : "+getDia_Chi());
	}
	
}

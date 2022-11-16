package bai2;

import java.util.Scanner;

public class Document {
 public String Ma;
 public String Ten_nxb;
 public int sobanph;
public Document(String ma, String ten_nxb, int sobanph) {
	super();
	Ma = ma;
	Ten_nxb = ten_nxb;
	this.sobanph = sobanph;
}
public Document() {
	super();
}
public String getMa() {
	return Ma;
}
public void setMa(String ma) {
	Ma = ma;
}
public String getTen_nxb() {
	return Ten_nxb;
}
public void setTen_nxb(String ten_nxb) {
	Ten_nxb = ten_nxb;
}
public int getSobanph() {
	return sobanph;
}
public void setSobanph(int sobanph) {
	this.sobanph = sobanph;
}
 public void Nhap()
 {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Nhap vao ma tai lieu :");
	 setMa(sc.nextLine());
	 System.out.println("Nhap ten nha xuat ban :");
	 setTen_nxb(sc.nextLine());
	 System.out.println("Nhap vao so ban phat hanh :");
	 setSobanph(sc.nextInt());
	
 }
 public void Xuat(int i)
 {
	 System.out.println("============DOCUMENT"+ (i++) +"========");
	 System.out.println("Ma : " + getMa());
	 System.out.println("Ten NXB : "+getTen_nxb());
	 System.out.println("So ban phat hanh : "+getSobanph());
 }
}

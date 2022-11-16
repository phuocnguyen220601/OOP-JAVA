package bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class News  extends Document{
	private Date Ngayph;

	public News(String ma, String ten_nxb, int sobanph, Date ngayph) {
		super(ma, ten_nxb, sobanph);
		Ngayph = ngayph;
	}

	public News() {
		super();
	}

	public Date getNgayph() {
		return Ngayph;
	}

	public void setNgayph(Date ngayph) {
		Ngayph = ngayph;
	}
	@Override
	public void Nhap()
	{
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap vao ngay phat hanh (dd-MM-yyyy :");
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Ngayph = df.parse(sc.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override 
	public void Xuat(int i)
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		super.Xuat(i);
		System.out.println("Ngay phat hanh  : "+ df.format(Ngayph) );
		System.out.println("===================================================");
	}

}

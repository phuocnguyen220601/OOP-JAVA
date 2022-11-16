package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_bai2 {
 public static void Menu()
 {
	 
	 System.out.println("============================Menu====================");
	 System.out.println("1.Nhap vao thong tin sach ");
	 System.out.println("2.Nhap vao thong tin bao");
	 System.out.println("3.In ra thong tin tat ca sach");
	 System.out.println("4.In ra thong tin tat ca bao");
	 System.out.println("5.Thoat");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Document> doclist = new ArrayList<>();
		int luachon;
		do {
			Menu();
			System.out.println("Nhap vao lua chon cua ban :");
			luachon = sc.nextInt();
			switch(luachon)
			{
			case 1:
				int n;
				System.out.println("Nhap vao so quyen sach ");
				n = sc.nextInt();
				Document[] book = new Book[n];
				for(int i = 0;i<n;i++)
				{
					book[i] = new Book();
					System.out.println("Nhap vao thong tin sach thu " +(i+1));
					book[i].Nhap();
					doclist.add(book[i]);
				}
				break;
			case 2:
				int m;
				System.out.println("Nhap vao so bao ");
				m = sc.nextInt();
				Document[] news = new News[m];
				for(int i = 0;i<m;i++)
				{
					news[i] = new News();
					System.out.println("Nhap vao thong tin bao thu " +(i+1));
					news[i].Nhap();
					doclist.add(news[i]);
				}
				break;
			case 3:
				System.out.println("====================THONG TIN TAT CA SACH ==========");
				int i =1;
				doclist.stream().filter(doc -> doc instanceof Book).forEach(doc -> doc.Xuat(i));
				break;
			case 4:
				int i2 = 1;
				System.out.println("==================THONG TIN TAT CA CA BAO ============");
				doclist.stream().filter(doc -> doc instanceof News).forEach(doc -> doc.Xuat(i2));
				break;
			}
			
		} while (luachon < 5);
	
	//lay ra tat ca thong tin class Book.
	  
	
	}
}

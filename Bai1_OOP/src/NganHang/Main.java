package NganHang;

import java.util.Scanner;

public class Main {
 public static void  Menu()
 {
	 System.out.println("====================LUA CHON=================");
	 System.out.println("1.Nhap thong tin cac tai khoan .");
	 System.out.println("2.Xuat thong tin cac tai khoan.");
	 System.out.println("3.Chuyen tien ");
	 System.out.println("4.Rut tien");
	 System.out.println("5.Dao han");
	 System.out.println("6.Thoat");
 }
	public static void nhap(Account acc)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ten tai khoan ");
		acc.setAccName(sc.nextLine());
		System.out.print("Nhap so tai khoan :");
		acc.setAccNumber(sc.nextLong());
		System.out.print("Nhap vao so tien ");
		acc.setAccAmount(sc.nextDouble());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1[] = null;
		int luachon;
		Scanner sc = new Scanner(System.in);
		do
		{
			Menu();
			System.out.println("Nhap vao lua chon cua ban :");
			luachon = sc.nextInt();
			switch(luachon)
			{
			     case 1:
			     
				      int n;
				      System.out.println("Nhap vao so luong tai khoan :");
				      n=sc.nextInt();
				      System.out.println("============================NHAP=============");
				      acc1 = new Account[n];
				      for(int i =0;i< n;i++)
				      {
				    	     System.out.println("=======ACCOUNT thu " + (i+1)+"=======");
				    	     acc1[i] = new Account();
				    	     nhap(acc1[i]);
				      }
				  
			     break;
			     case 2:
			         System.out.println("============================XUAT=====================");
			         for(int i =0;i<acc1.length;i++)
			         {
			        	 System.out.println("ACOUNT "+(i+1)+" : ");
			        	 acc1[i].xuat();
			         }
			         break;
			     case 3:
			    	 long stkchuyen,stknhan;
			    	 System.out.println("Nhap vao so tai khoan chuyen tien :");
			    	 stkchuyen = sc.nextLong();
			    	 System.out.println("Nhap vao so tai khoan nhan tien :");
			    	 stknhan = sc.nextLong();
			    	 double sotienchuyen;
			    	 System.out.println("Nhap vao so  tien can chuyen :");
			    	 sotienchuyen = sc.nextDouble();
			    	 Boolean check = true;
			    	 for(int i =0;i<acc1.length;i++)
			    	 {  
			    		 for(int j =0;j<acc1.length;j++)
			    		 {
			    		  if(acc1[i].getAccNumber()  == stkchuyen  && acc1[j].getAccNumber() == stknhan)
			    		    {
			    			    acc1[i].TRANSFER(acc1[j], sotienchuyen);
			    		    }
			    		   else
			    		    {
			    			  check = false;
			    		    }
			    		 }
			    		  
			    	 }
			    	 if(check == false)
			    	 {
			    		 System.out.println("Khong tim thay stk ");
			    	 }
			    	 break;
			     case 4:
			    	 long stkruttien;
			    	 System.out.println("Nhap vao so tai khoan rut tien :");
			    	 stkruttien = sc.nextLong();
			    	 double sotienrut;
			    	 Boolean check1 = false;
			    	 System.out.println("Nhap vao so  tien can chuyen :");
			    	 sotienrut = sc.nextDouble();
			    	 for(int i=0;i<acc1.length;i++)
			    	 {
			    		 if(acc1[i].getAccNumber() == stkruttien)
			    		 {
			    			 acc1[i].ReAmount(sotienrut);
			    		 }
			    		 else
			    		 {
			    			 check1 = true;
			    		 }
			    	 }
			    	 if(check1 == true)
			    	 {
			    		 System.out.println("Khong tim thay stk ");
			    	 }
			}
			
			
;		}while(luachon < 6);
		

	}

}

package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_Main {

	public static void Menu() {
		System.out.println("==========================Menu=========================");
		System.out.println("1.Them moi can bo .");
		System.out.println("2.Tim kiem theo ten.");
		System.out.println("3.Hien thi thong tin danh sach can bo.");
		System.out.println("4.Thoat.");
		System.out.println("========================================================");
	}

	public static void Menu2() {
		System.out.println("=============Ban muon them moi can bo================ ");
		System.out.println("1.Cong Nhan");
		System.out.println("2.Ky Su");
		System.out.println("3.Thoat");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luachon;
		Scanner sc = new Scanner(System.in);
		ArrayList<CanBo> listcb = new ArrayList<>();
		do {
			Menu();
			System.out.println("Nhap vao lua chon cua ban :");
			luachon = sc.nextInt();
			switch (luachon) {
			    case 1:
				  Menu2();
				  int luachon2;
				  System.out.println("Ban muon them can bo loai nao ??");
				  luachon2 = sc.nextInt();
				 switch (luachon2) {
				    case 1:
					CanBo cb1 = new CongNhan();
					cb1.Nhap();
					listcb.add(cb1);
					break;
				case 2:
					CanBo cb2 = new KySu();
					cb2.Nhap();
					listcb.add(cb2);
					break;
				case 3:
					break;
				   }
				 break;
			 case 2:
		
					String name;
					System.out.println("Nhap vao ten can bo can tim :");
					name = sc.nextLine();
					name = sc.nextLine();
					System.out.println("==========Can bo can tim la ==================");
					boolean check = true;
					for (CanBo canBo : listcb) {
						if (canBo.getHo_Ten().equals(name) == true) {
							canBo.Xuat();
						} else {
							check = false;
						}

					}
					if (check == false) {
						System.out.println("Khong tim thay can bo !!!!!!");
					}
				break;
			case 3:
					System.out.println("=========DANH SACH CAN BO ===================");
					int i = 1;
					for (CanBo canBo : listcb) {
						System.out.println("===============Thong tin can bo " + (i++));
						canBo.Xuat();
					}
					break;
				}
				
			
		} while (luachon < 4);

	}

}

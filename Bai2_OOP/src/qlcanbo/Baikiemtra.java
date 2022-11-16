/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcanbo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Baikiemtra {

    /**
     * @param args the command line arguments
     */
    public static void  Menu()
{
          System.out.println("1.Nhap thong tin nhan vien hanh chinh");
          System.out.println("2.Nhap thong tin giang vien co huu");
          System.out.println("3.Nhap thong tin giang vien thinh giang");
          System.out.println("4.Tinh tong so tien luong ma trung tam phai tra cho nhan vien");
           System.out.println("5.Xuat ra thong tin nhan vien co luong cao nhat");
           System.out.println("6.Tim loai nhan vien co tong luong cao nhat");
                System.out.println("7.Thoat");
          
}
    public static void main(String[] args) {
        // TODO code application logic here
         Nhanvien nv[] = null;
         double tienluonghc =0;
         double tienluongch = 0;
         double tienluongtg =0;
        Scanner sc = new Scanner(System.in);
        int luachon;
        do
        {
            Menu();
            System.out.println("Nhap vao lua chon cua ban :");
            luachon = sc.nextInt();
            switch(luachon)
            {
                case 1:
                   
                    int n;
                    System.out.println("Nhap vao so nhan vien hanh chinh :");
                    n = sc.nextInt();
                     nv = new nhanvienhanhchinh[n];
                    for(int i =0;i<n;i++)
                    {
                        nv[i] = new nhanvienhanhchinh();
                          System.out.println("Nhap vao  nhan vien hanh chinh thu :"+(i+1));
                        nv[i].nhap();
                    }
                    for(int i=0;i<n;i++)
                    {
                        tienluonghc = tienluonghc + nv[i].Tinhluong();
                    }
                    break;
                case 2:
                       int m;
                    System.out.println("Nhap vao so giang vien co huu :");
                    m = sc.nextInt();
                     nv = new Giangviencohuu[m];
                    for(int i =0;i<m;i++)
                    {
                        nv[i] = new Giangviencohuu();
                          System.out.println("Nhap vao  giang vien co huu  thu :"+(i+1));
                          nv[i].nhap();
                    }  
                     for(int i =0;i<m;i++)
                    {
                        tienluongch = tienluongch + nv[i].Tinhluong();
                    }
                    
                    break;
                case 3:
                       int x;
                    System.out.println("Nhap vao so giang vien thinh gia :");
                    x = sc.nextInt();
                     nv = new Giangvienthinhgiang[x];
                    for(int i =0;i<x;i++)
                    {
                        nv[i] = new Giangvienthinhgiang();
                          System.out.println("Nhap vao  giang vien thinh gia :"+(i+1));
                        nv[i].nhap();
                    }     for(int i =0;i<x;i++)
                    {
                        tienluongtg = tienluongtg + nv[i].Tinhluong();
                    }
                    
                    break;
                case 4:
                    double s = 0;
                     if(nv == null)
                     {
                          System.out.println("Khong co nhan vien nao");
                     }
                     else
                     {
                    for(int i =0;i<nv.length;i++)
                    {
                        s = s + nv[i].Tinhluong();
                    }
                    System.out.println("Tong so luong ma trung tam phai tra la : " + s);
                     }
                    break;
                case 5 :
                    double max = 0;
                    int k = 0;
                     System.out.println("====================THONG TIN NHAN VIEN CO LUONG CAO NHAT ==========================");
                     if(nv == null)
                     {
                          System.out.println("Khong co nhan vien nao");
                     }
                     else
                     {
                     for(int i =0;i<nv.length;i++)
                    {
                        if(max < nv[i].Tinhluong())
                        {
                            max = nv[i].Tinhluong();
                            k = i;
                        }
                    }
                     nv[k].xuat();
                     }
                    break;
                case 6:
                   if(tienluonghc >= tienluongch && tienluonghc >= tienluongtg)
                   {
                         System.out.println("LOAI NHAN VIEN HANH CHINH CO LUONG CAO NHATt");
                   }
                    if(tienluongch >= tienluonghc&& tienluongch >= tienluongtg)
                   {
                        System.out.println("LOAI GIANG VIEN CO HUU CO LUONG CAO NHATt");
                   } 
                    if(tienluongtg >= tienluonghc&& tienluongtg >= tienluongch)
                   {
                        System.out.println("LOAI GIANG VIEN THINH GIA CO LUONG CAO NHATt");
                   }
                    
                    break;
//                      System.out.println("=========================XUAT=============================");
//                    for(int i =0;i<nv.length;i++)
//                    {
//                        nv[i].xuat();
//                    }
                    
//                      System.out.println("=========================XUAT=============================");
//                    for(int i =0;i<nv.length;i++)
//                    {
//                        nv[i].xuat();
//                    }
            }
        }while(luachon < 7);
        
    }
}

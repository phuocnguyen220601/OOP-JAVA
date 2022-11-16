/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcanbo;

/**
 *
 * @author HP
 */
public class Giangvienthinhgiang extends Giangvien {

    public Giangvienthinhgiang(int sogio) {
        super(sogio);
    }

    public Giangvienthinhgiang() {
    }
     @Override
    public void nhap()
    {
        super.nhap();
    }
    @Override
    public double Tinhluong() {
         double luong = 0;
       return   luong = sogio*80000;
         
    }
     @Override
    public void xuat() {
        super.xuat();
      System.out.println("Luong cua nhan vien la :" + Tinhluong());
        
    }

    
}

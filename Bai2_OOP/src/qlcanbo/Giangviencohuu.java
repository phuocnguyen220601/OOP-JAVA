/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qlcanbo;

/**
 *
 * @author HP
 */
public class Giangviencohuu extends Giangvien{

    public Giangviencohuu(int sogio) {
        super(sogio);
    }

    public Giangviencohuu() {
    }

    @Override
    public void nhap()
    {
        super.nhap();
    }
    @Override
    public double Tinhluong() {
         double luong = 0;
         return  luong = 5000000 + sogio*80000;
         
    }

    @Override
    public void xuat() {
        super.xuat();
       System.out.println("Luong cua nhan vien la :" + Tinhluong());
        
    }
    
}

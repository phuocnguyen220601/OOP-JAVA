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
public abstract class Giangvien extends Nhanvien{
protected  int sogio;

    public Giangvien() {
    }

    public Giangvien(int sogio) {
        this.sogio = sogio;
    }

    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }

    public String getTennhavien() {
        return tennhavien;
    }

    public void setTennhavien(String tennhavien) {
        this.tennhavien = tennhavien;
    }

@Override
public void nhap()
{
    super.nhap();
    System.out.println("Nhap vao so gio lam viec cua  nhan vien ");
        Scanner sc = new Scanner(System.in);
        sogio= sc.nextInt();
}
@Override
public void xuat()
{
    super.xuat();
}
    @Override
    public double Tinhluong() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

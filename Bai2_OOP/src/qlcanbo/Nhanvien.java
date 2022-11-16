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
public abstract  class Nhanvien {
    protected String tennhavien;
    public void nhap()
    {
        System.out.println("Nhap vao ten nhan vien ");
        Scanner sc = new Scanner(System.in);
        tennhavien= sc.nextLine();
    }
    public abstract double Tinhluong();
  public   void xuat()
  {
         System.out.println("Ten nhan vien " + tennhavien);
         
  }
}

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
public class nhanvienhanhchinh extends Nhanvien  {
    private int songaycong;

    public nhanvienhanhchinh(int songaycong) {
        this.songaycong = songaycong;
    }

    public nhanvienhanhchinh() {
    }

    public int getSongaycong() {
        return songaycong;
    }

    public void setSongaycong(int songaycong) {
        this.songaycong = songaycong;
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
         System.out.println("Nhap vao so ngay cong cua  nhan vien ");
        Scanner sc = new Scanner(System.in);
        songaycong= sc.nextInt();
  }
    @Override
    public double Tinhluong() {
        double luong = 0;
        if(songaycong  == 26)
        {
                return    luong = 5000000;
        }
        else if(songaycong < 26)
        {
            return luong = songaycong * 150000;
        }
        else
        {
            return (songaycong - 26)*180000 + 5000000;
        }
          
    }

@Override
        public void xuat()
{
    super.xuat();
    System.out.println("Luong cua  nhan vien "+Tinhluong());
    
}
    
}

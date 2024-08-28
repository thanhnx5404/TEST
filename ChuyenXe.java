package quanlybktravel;

import java.util.Scanner;
public class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected int soXe;
    protected double doanhThu;

    public String getMaSoChuyen(){
        return maSoChuyen;
    }
    public void setMaSoChuyen(String maSoChuyen){
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe(){
        return hoTenTaiXe;
    }
    public void setHoTenTaiXe(String hoTenTaiXe){
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe(){
        return soXe;
    }
    public void setSoXe(int soXe){
        this.soXe = soXe;
    }

    public double getDoanhThu(){
        return doanhThu;
    }
    public void setDoanhThu(double doanhThu){
        this.doanhThu = doanhThu;
    }

    public ChuyenXe(){
        this.maSoChuyen ="";
        this.hoTenTaiXe="";
        this.soXe= 0;
        this.doanhThu= 0.0;
    }
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe= hoTenTaiXe;
        this.soXe= soXe;
        this.doanhThu= doanhThu;
    }

    //Các phương thức nhập thông tin và in thông tin
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma so chuyen xe:");
        this.maSoChuyen = s.nextLine();
        System.out.println("Nhap ho ten tai xe:");
        this.hoTenTaiXe = s.nextLine();
        System.out.println("Nhap so xe:");
        this.soXe = s.nextInt();
        System.out.println("Nhap doanh thu:");
        this.doanhThu = s.nextDouble();
    }
    public void inThongTin(){
        System.out.println("------Thong tin chuyen xe------");
        System.out.println("Ma chuyen xe: " + this.maSoChuyen);
        System.out.println("Tai xe: " + this.hoTenTaiXe);
        System.out.println("So xe: " + this.soXe);
        System.out.println("Doanh thu: " + this.doanhThu);
    }
}

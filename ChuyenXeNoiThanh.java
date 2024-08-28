package quanlybktravel;
import java.util.Scanner;
public class ChuyenXeNoiThanh extends ChuyenXe {
    protected int soTuyen;
    protected long soKm;

    public int getSoTuyen(int soTuyen){
        return soTuyen;
    }
    public void setSoTuyen(){
        this.soTuyen = soTuyen;
    }
    public long getSoKm(long soKm){
        return soKm;
    }
    public void setSoKm(){
        this.soKm = soKm;
    }

    public ChuyenXeNoiThanh(){
        super();
        this.soTuyen = 0;
        this.soKm = 0;
    }
    public ChuyenXeNoiThanh(int soTuyen, long soKm){
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu, int soTuyen, long soKm){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nhap so tuyen:");
        this.soTuyen = s1.nextInt();
        System.out.println("Nhap so KM da di duoc:");
        this.soKm = s1.nextLong();
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("So tuyen: " + this.soTuyen);
        System.out.println("So KM da di duoc: " + this.soKm);
    }
}

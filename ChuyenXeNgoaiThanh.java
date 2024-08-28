package quanlybktravel;
import java.util.Scanner;
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    protected String noiDen;
    protected int soNgayDi;

    public String getNoiDen(String noiDen){
        return noiDen;
    }
    public void setNoiDen(){
        this.noiDen = noiDen;
    }
    public int getSoNgayDi(int soNgayDi){
        return soNgayDi;
    }
    public void setSoNgayDi(){
        this.soNgayDi = soNgayDi;
    }

    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDi = 0;
    }
    public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi){
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu, String noiDen, int soNgayDi){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Nhap noi den:");
        this.noiDen = s2.nextLine();
        System.out.println("Nhap so ngay di:");
        this.soNgayDi = s2.nextInt();
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Noi den: " + this.noiDen);
        System.out.println("So ngay di: " + this.soNgayDi);
    }
}

package quanlybktravel;

public class DanhSachChuyenXe {
    protected ChuyenXe danhsachCX[] = new ChuyenXe[100];
    protected int soLuongCX;

    public DanhSachChuyenXe(){
        this.soLuongCX = 0;
    }
    public void themChuyenXe(int loaiXe){
        if(this.soLuongCX >= 100){
            System.out.println("Dat gioi han, khong them duoc");
        } else {
            if(loaiXe == 1){
                ChuyenXeNoiThanh t = new ChuyenXeNoiThanh();
                t.nhapThongTin();
                this.danhsachCX[this.soLuongCX] = t;
                this.soLuongCX++;
            } else if(loaiXe ==2){
                ChuyenXeNgoaiThanh t = new ChuyenXeNgoaiThanh();
                t.nhapThongTin();
                this.danhsachCX[this.soLuongCX] = t;
                this.soLuongCX++;
            }
        }
    }
    public void inDanhSachChuyenXe(){
        double tongDoanhThu = 0.0;
        System.out.println("---DANH SACH CHUYEN XE---");
        for(int i=0; i<this.soLuongCX;i++){
            this.danhsachCX[i].inThongTin();
            tongDoanhThu += this.danhsachCX[i].getDoanhThu();
        }
        System.out.println("----/----/----");
        System.out.println("Tong doanh thu: " + tongDoanhThu);
    }
}

package quanlybktravel;
import java.util.Scanner;
public class QuanLyBKTravel {
    public static void main(String[] args) {
        Scanner s3 = new Scanner(System.in);
        DanhSachChuyenXe ds = new DanhSachChuyenXe();

        int luaChon = 0;

        do{
            System.out.println("---CHUONG TRINH QUAN LY CHUYEN XE---");
            System.out.println("\t1.Them chuyen xe noi thanh");
            System.out.println("\t2.Them chuyen xe ngoai thanh");
            System.out.println("\t3.Hien thi danh sach chuyen xe");
            System.out.println("\t4.Thoat chuong trinh");
            System.out.print("Nhap lua chon [1-4]: ");
            luaChon = s3.nextInt();

            switch(luaChon){
                case 1:
                    ds.themChuyenXe(luaChon);
                    break;
                case 2:
                    ds.themChuyenXe(luaChon);
                    break;
                case 3:
                    ds.inDanhSachChuyenXe();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai lua chon, hay nhap lai!");
            }
        } while(luaChon != 4);
    }
}

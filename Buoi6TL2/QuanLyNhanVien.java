import java.util.ArrayList;
import java.util.Scanner;
public class QuanLyNhanVien {
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public void hienThiTatCa() {
        for (NhanVien nv :danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tong += nv.tinhLuong();
        }
        return tong;
    }

}

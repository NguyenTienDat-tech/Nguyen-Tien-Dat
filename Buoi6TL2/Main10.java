public class Main10 {
    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();

        ql.themNhanVien(new NhanVienFullTime("FT01", "Nguyen Van A", 18, "hihi@gmail.com", "0123456789", 10000000, 2000000));
        ql.themNhanVien(new NhanVienFullTime("FT02", "Tran Thi B", 26, "haha@gmail.com", "0987654321", 9000000, 1500000));
        ql.themNhanVien(new NhanVienPartTime("PT01", "Le Van C", 21, "hoho@gmail.com", "0112233445", 80, 50000));
        ql.themNhanVien(new NhanVienPartTime("PT02", "Pham Thi D", 24, "huhu@gmail.com", "0667788990", 60, 55000));

        System.out.println("----- Danh sách nhân viên ------");
        ql.hienThiTatCa();

        System.out.println("Tổng quỹ lương: " + ql.tinhTongLuong());
    }
}

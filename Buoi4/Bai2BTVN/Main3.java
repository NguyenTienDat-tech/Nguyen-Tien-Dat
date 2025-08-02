package Bai2BTVN;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-------- Quản lý sinh viên --------");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên khỏi danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.themsinhvien();
                    break;
                case 2:
                    manager.SuaThongTin();
                    break;
                case 3:
                    manager.sapXepTheoTuoi();
                    manager.HienThiDanhSach();
                    break;
                case 4:
                    manager.sapXepTheoGPA();
                    manager.HienThiDanhSach();
                    break;
                case 5:
                    manager.sapXepTheoSoTietNghi();
                    manager.HienThiDanhSach();
                    break;
                case 6:
                    manager.xoaSinhVien();
                    break;
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 0);
    }
}

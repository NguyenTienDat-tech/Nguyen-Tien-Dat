package Bai2BTVN;
import Bai1BTVN.Student1;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
    private ArrayList<Student1> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void themsinhvien() {
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namsinh = sc.nextInt();
        System.out.print("Nhap dia chi: ");
        String diachi = sc.nextLine();
        System.out.print("Nhap diem tx1: ");
        int tx1 = sc.nextInt();
        System.out.print("Nhap diem tx2: ");
        int tx2 = sc.nextInt();
        System.out.print("Nhap diem KTHP: ");
        int kthp = sc.nextInt();
        System.out.print("Nhap so tiet nghi: ");
        int sotietnghi = sc.nextInt();

        Student1 sv = new Student1(ten, namsinh, diachi, tx1, tx2, kthp, sotietnghi);
        danhSach.add(sv);
        System.out.println("Thêm thành công");
    }

    public void SuaThongTin() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String ten = sc.nextLine();
        for (Student1 sv : danhSach) {
            if (sv.getten().equalsIgnoreCase(ten)) {
                System.out.print("Nhap dia chi moi: ");
                String diachi = sc.nextLine();
                System.out.print("Nhap diem tx1 moi: ");
                int tx1 = sc.nextInt();
                System.out.print("Nhap diem tx2 moi: ");
                int tx2 = sc.nextInt();
                System.out.print("Nhap diem KTHP moi: ");
                int kthp = sc.nextInt();
                System.out.print("Nhap so tiet nghi moi: ");
                int sotietnghi = sc.nextInt();
                System.out.println("Da cap nhat");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    public void sapXepTheoTuoi() {
        danhSach.sort(Comparator.comparing(Student1::gettuoi));
        System.out.println("Đã sắp xếp theo tuổi.");
    }

    public void sapXepTheoGPA() {
        danhSach.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA()));
        System.out.println("Đã sắp xếp theo GPA.");
    }

    public void sapXepTheoSoTietNghi() {
        danhSach.sort(Comparator.comparingInt(Student1::getsotietnghi));
        System.out.println("Đã sắp xếp theo số tiết nghỉ.");
    }

    public void xoaSinhVien() {
        System.out.print("Nhập tên sinh viên cần xoá: ");
        String ten = sc.nextLine();
        danhSach.removeIf(sv -> sv.getten().equalsIgnoreCase(ten));
        System.out.println("Xoá thành công nếu sinh viên tồn tại.");
    }

    public void HienThiDanhSach() {
        System.out.println();
        for (Student1 s : danhSach) {
            s.hienthi();
        }
    }
}

import java.util.Scanner;
public class SinhVien {
    private static String maSV;
    private static String hoTen;
    private static double diemTB;
    private static LopHoc lop;

    public SinhVien() {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public static void inthongtin() {
        System.out.println("ma sv: " + maSV);
        System.out.println("ho ten: " + hoTen);
        System.out.println("diem TB: " + diemTB);
        System.out.println("thong tin lop hoc");
        lop.inthongtin();
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Diem trung binh sinh vien: ");
        diemTB = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap thong tin lop hoc");
        System.out.println("Nhap ma lop: ");
        String malop = sc.nextLine();
        System.out.println("Ten lop: ");
        String tenlop = sc.nextLine();
        lop = new LopHoc(malop, tenlop);
    }
}

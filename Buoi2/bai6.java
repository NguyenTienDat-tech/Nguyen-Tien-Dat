import java.util.Scanner;
public class bai6 {
    String ten;
    int tuoi;
    double diemtb;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.print("ten: ");
        this.ten = sc.nextLine();
        System.out.print("tuoi: ");
        this.tuoi = sc.nextInt();
        System.out.print("diemtb: ");
        this.diemtb = sc.nextDouble();
    }


    public static void nhapthongtin(bai6 []a, int sv) {

        for (int i = 0; i < sv; i++) {
           System.out.println("nhap thong tin sinh vien thu " + (i + 1) + " la: ");
           a[i] = new bai6();
           a[i].nhap();
        }
    }

    public static void indanhsach(bai6 []a, int sv) {
        System.out.print("danh sach sinh vien la: ");
        for (int i = 0; i < sv; i++) {
            System.out.println("sinh vien thu " + (i + 1) + " ten: " + a[i].ten + " || tuoi: " + a[i].tuoi + " || diemtb: " + a[i].diemtb);
        }
    }

    //tinh diem tb ca lop
    public static void tinhtbfull(bai6 []a, int sv) {
        double tong = 0;
        double maxdiemtb = a[0].diemtb;

        for (int i = 0; i < sv; i++) {
            tong += a[i].diemtb;
            if (a[i].diemtb > maxdiemtb) {
                maxdiemtb = a[i].diemtb;
            }
        }
        System.out.println("Diem trung binh ca lop: " + tong/sv);
        System.out.println("Diem cao nhat la: " + maxdiemtb);
    }


    public static void main(String[] args) {
        int sv;

        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong sinh vien: ");
        sv = sc.nextInt();

        bai6 []a = new bai6[sv];
        nhapthongtin(a, sv);
        indanhsach(a, sv);
        tinhtbfull(a, sv);
    }
}

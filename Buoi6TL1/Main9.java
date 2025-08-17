import java.util.ArrayList;
import java.util.Scanner;
public class Main9 {
    ArrayList<SinhVien> danhsach = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SinhVien sv = new SinhVien();

    public void addsinhvien() {
        System.out.println("nhap so luong sinh vien: ");
        int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("nhap thong tin sinh vien thu " + (i + 1) + " la: ");
                sv.nhapThongTin();
                danhsach.add(sv);
            }
    }

    public void inThongTin() {
        for (SinhVien sv : danhsach) {
            sv.inthongtin();
        }
    }

    public void Menu() {
        int chon;
        do {
            System.out.println("--------Menu--------");
            System.out.println("1.Add sinh vien");
            System.out.println("2.In thong tin sinh vien");
            System.out.println("3.Tim sinh vien max");
            System.out.println("Nhap lua chon cua ban");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    addsinhvien();
                    break;
                case 2:
                    inThongTin();
                    break;
                default:
                    System.out.println("khong ton tai");
            }
        }
        while(chon != 0);
    }



    public static void main(String[] args) {
        Main9 m = new Main9();
        m.Menu();
    }

}

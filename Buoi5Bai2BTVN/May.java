import java.util.Scanner;
    public class May {
        String MaMay, TenMay, TinhTrang;
        public void Nhap(){
            Scanner in = new Scanner(System.in);
            System.out.println("Nhap ma may: ");
            MaMay = in.nextLine();
            System.out.println("Nhap ten may: ");
            TenMay = in.nextLine();
            System.out.println("Nhap tinh trang may: ");
            TinhTrang = in.nextLine();
        }
        public void Xuat(){
            System.out.println("Ma may: " + MaMay);
            System.out.println("Ten may: " + TenMay);
            System.out.println("Tinh trang may: " + TinhTrang);
        }
}

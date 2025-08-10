import java.util.Scanner;
public class QuanLy {
    String maql, hoten;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma QL: ");
        maql = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma QL: " + maql);
        System.out.println("ho ten: " + hoten);
    }

}

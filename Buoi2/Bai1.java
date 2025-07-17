import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap tuoi: ");
        int tuoi = sc.nextInt();
        System.out.print("nhap chieu cao: ");
        double chieucao = sc.nextDouble();

        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("chieu cao: " + chieucao);
    }
}

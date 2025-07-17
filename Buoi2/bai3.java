import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.print("cap thu " + i + " la: ");
            System.out.print("nhap so nguyen n = ");
            int n = sc.nextInt();
            System.out.print("nhap so nguyen x = ");
            int x = sc.nextInt();

            System.out.println("phep cong = " + (n + x));
            System.out.println("phep tru = " + (n - x));
            System.out.println("phep nhan = " + (n * x));

            if (x != 0) {
                System.out.println("phep chia = " + (n / x));
                System.out.println("phep chia du = " + (n % x));
            }
            else {
                System.out.println("khong ton tai phep chia");
            }

            if (n == x) {
                System.out.println("hai so nguyen da nhap bang nhau");
            }
            else {
                System.out.println("hai so nguyen da nhap khac nhau");
            }

        }
    }
}

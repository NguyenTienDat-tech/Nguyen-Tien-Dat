
import java.util.Scanner;
public class bai4 {
    public static void nhapmang(int []a, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatmang(int []a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void tinhtong(int []a, int n) {
        int t = 0;
        for (int i = 0; i < n; i++) {
            t += a[i];
        }
        System.out.println("\n tong = " + t);
    }

    public static void tinhmax(int []a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(" gia tri lon nhat trong mang la: " + max);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen n = ");
        n = sc.nextInt();
        int []a = new int[n];
        nhapmang(a, n, sc);
        xuatmang(a, n);
        tinhtong(a, n);
        tinhmax(a, n);
    }
}

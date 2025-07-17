import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {

        // tinh bang cuu chuong 5
        System.out.println("bang cuu chuong cua so 5 la: ");
        for (int i = 1; i <= 10; i++) {
                System.out.print("5 nhan " + i + " = ");
                System.out.println(5 * i);
        }

        //tinh tong for
        System.out.println("tinh tong cac so chan theo ham for la:");
        int tong = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        System.out.println("   tong cac so chan tu 1 den 100 la: " + tong);

        //tinh tong while
        System.out.println("tinh tong cac so chan theo ham while la:");
        int tong1 = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                tong1 += i;
            }
            i++;
        }
        System.out.println("   tong cac so chan tu 1 den 100 la: " + tong1);
    }
}



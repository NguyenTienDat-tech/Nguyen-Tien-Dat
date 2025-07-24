import java.util.Scanner;
import java.util.Random;
public class Bai3buoi3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(200);

        System.out.println("phep toan cua ban la: ");
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("Du doan ket qua cua phep toan (dung/sai): ");
        String nhap = sc.nextLine();

        boolean ketquadung = (a + b == c);

        if (ketquadung && nhap.equals("phep tinh dung") || !ketquadung && nhap.equals("phep tinh sai")) {
            System.out.println("ban tra loi dung");
        }
        else {
            System.out.println("ban tra loi sai");
        }




    }
}

import java.util.Scanner;
public class Bai2buoi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String chuoi = sc.nextLine();

        String daochuoi = new StringBuilder(chuoi).reverse().toString();

        if (chuoi.equals(daochuoi)) {
            System.out.println(chuoi.toUpperCase() + " - chuoi nay doi xung");
        }
        else {
            System.out.println(chuoi.toLowerCase() + " - chuoi nay khong doi xung");
        }
    }
}
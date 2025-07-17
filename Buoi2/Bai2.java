import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhapten: ");
        String ten = sc.nextLine();
        System.out.print("nhaptuoi: ");
        int tuoi = sc.nextInt();
        System.out.print("nhaplop: ");
        sc.nextLine();
        String lop = sc.nextLine();
        System.out.print("GPA: ");
        double GPA = sc.nextDouble();

        System.out.println("ten: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("lop: " + lop);
        System.out.println("GPA: " + GPA);
    }
}

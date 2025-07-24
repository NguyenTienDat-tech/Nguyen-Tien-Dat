import java.util.Scanner;
public class Bai1buoi3 {
    public static final String Square = "Square";
    public static final String Triangle = "Triangle";
    public static final String Circle = "Circle";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap hinh dang(Square, Triangle, Circle): ");
        String hinh = sc.nextLine();

        switch(hinh) {
            case Square:
                System.out.print("nhap canh hinh vuong: ");
                double canh = sc.nextDouble();
                System.out.println("dien tich vien gach theo hinh vuong la: " + (canh * canh));
                break;

            case Triangle:
                System.out.print("nhap chieu cao hinh tam giac: ");
                Double chieucao = sc.nextDouble();
                System.out.print("nhap day hinh tam giac: ");
                Double day = sc.nextDouble();
                System.out.println("dien tich vien gach theo hinh tam giac la: " + (1/2 * chieucao * day));

            case Circle:
                System.out.print("Nhap ban kinh: ");
                Double bankinh = sc.nextDouble();
                System.out.println("dien tich vien gach theo hinh tron la: " + (Math.PI * bankinh * bankinh ));

            default:
                System.out.println("hinh dang khong hop le!");
        }
    }
}

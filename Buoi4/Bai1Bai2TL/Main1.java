package Bai1Bai2TL;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student ten = new Student(18, "Dat");
        System.out.println("xin chao, tui ten la: " + ten.getName() + " nam nay " + ten.getAge());
        System.out.print("nhap ten moi: ");
        String name = sc.nextLine();
        System.out.print("nhap tuoi moi: ");
        int age = sc.nextInt();
        System.out.print("ten moi: ");
        ten.setName(name);
        System.out.print("tuoi moi: ");
        ten.setAge(age);
        System.out.println("xin chao, toi ten la: " + ten.getName() + " nam nay " + ten.getAge());
    }
}

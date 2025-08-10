import java.util.Scanner;
import java.util.ArrayList;
public class PhongMay {
    String maPhong, tenPhong;
    double dienTich;
    QuanLy x;
    ArrayList<May> y;
    int n;

    public PhongMay() {
        x = new QuanLy();
        y = new ArrayList<>();
    }

    public void ThemMay(May t){
        t.Nhap();
        y.add(t);
    }
    public void XuatMay(){
        for(May a: y){
            a.Xuat();
        }
    }
    public void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = in.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = in.nextLine();
        System.out.println("Nhap dien tich phong: ");
        dienTich = Double.parseDouble(in.nextLine());
        x.Nhap();
        System.out.println("So may trong phong: ");
        n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++)
        {
            May temp = new May();
            ThemMay(temp);
        }
    }
    public void xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich phong: " +dienTich);
        System.out.println("So may tinh trong phong: " + n);
        x.Xuat();
        System.out.println("Danh sach may trong phong " + tenPhong);
        XuatMay();
    }
}

package Bai1BTVN;
public class Student1 {
    private String ten;
    private int namsinh;
    private String diachi;
    private int tx1;
    private int tx2;
    private int kthp;
    private int sotietnghi;

    public Student1(String ten, int namsinh, String diachi, int tx1, int tx2, int kthp, int sotietnghi) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.sotietnghi = sotietnghi;
    }

    public String getten() {
        return this.ten;
    }
    public int getsotietnghi() {
        return this.sotietnghi;
    }
    public int gettuoi() {
        return (2025 - namsinh);
    }

    public double getGPA() {
        return (tx1*0.2 + tx2*0.3 + kthp*0.5);
    }

    public void hienthi() {
        System.out.println("ten: " + ten + " tuoi: " + gettuoi() + " dia chi: " + diachi + " tx1: " + tx1 + " tx2: " + tx2 + " kthp: " + kthp + " GPA: " + getGPA() + " so tiet nghi: " + sotietnghi);
    }
}

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String tenLop, int tuoi, String email, String sodienthoai, int soGioLam, double luongTheoGio) {
        super(maNV, tenLop, tuoi, email, sodienthoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public double tinhLuong() {
      return  soGioLam * luongTheoGio;
    }

    public void hienthiThongTin() {
        System.out.println("Loai: Part Time");
        super.hienThiThongTin();
    }
}

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String tenLop, int tuoi, String email, String sodienthoai, double luongCoBan, double tienThuong) {
        super(maNV, tenLop, tuoi, email, sodienthoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

     public double tinhLuong() {
       return luongCoBan = tienThuong;
     }

     public void hienthiThongTin() {
        System.out.println("Loai: Full Time");
        super.hienThiThongTin();
     }


}

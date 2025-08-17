public class NhanVien {
     protected String maNV;
     protected String tenLop;
     protected int tuoi;
     protected String email;
     protected String sodienthoai;

     public NhanVien(String maNV, String tenLop, int tuoi, String email, String sodienthoai) {
          this.maNV = maNV;
          this.tenLop = tenLop;
          this.tuoi = tuoi;
          this.email = email;
          this.sodienthoai = sodienthoai;
     }

     public double tinhLuong() {
          return 0;
     }

     public void hienThiThongTin() {
          System.out.println("ma nhan vien: " + maNV);
          System.out.println("ten lop: " + tenLop);
          System.out.println("tuoi: " + tuoi);
          System.out.println("email: " + email);
          System.out.println("so dien thoai: " + sodienthoai);
          System.out.println("tinh luong: " + tinhLuong());
     }
}

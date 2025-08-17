public class LopHoc {
    private String malop;
    private String tenlop;

    public LopHoc(String malop, String tenlop) {
        this.malop = malop;
        this.tenlop = tenlop;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void inthongtin() {
        System.out.print("nhap ma lop: " + malop);
        System.out.print("nhap ten lop: " + tenlop);
    }
}

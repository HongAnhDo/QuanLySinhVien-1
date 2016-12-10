package sinhvien;


public class SVTinChi extends SV {

    private int tinChiTichLuy;

    public SVTinChi() {
        super();
    }

    public int getTinChiTichLuy() {
        return tinChiTichLuy;
    }

    public void setTinChiTichLuy(int tinChiTichLuy) {
        this.tinChiTichLuy = tinChiTichLuy;
    }

    @Override
    public String getLoaiSinhVien() {
        return "Sinh Viên Tín Chỉ";
    }

    @Override
    public boolean xetTotNghiep() {
        return tinChiTichLuy >= 150 && getCPA() >= 1.5;
    }

}

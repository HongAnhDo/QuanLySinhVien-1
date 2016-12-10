package sinhvien;


public class SVNienChe extends SV {
    
    private boolean hocHetMonHoc;

    public SVNienChe() {
        super();
    }

    public boolean isHocHetMonHoc() {
        return hocHetMonHoc;
    }

    public void setHocHetMonHoc(boolean hocHetMonHoc) {
        this.hocHetMonHoc = hocHetMonHoc;
        
    }

    @Override
    public String getLoaiSinhVien() {
        return "Sinh Viên Niên Chế";
    }

    @Override
    public boolean xetTotNghiep() {
        return hocHetMonHoc;
    }

}

package giaovien;

import chung.User;
import java.util.ArrayList;
import monhoc.MonHoc;


public class GiaoVien extends User {

    private int soDienThoai;
    private String khoaVien;
    private ArrayList<MonHoc> monDay;

    public GiaoVien() {

    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getKhoaVien() {
        return khoaVien;
    }

    public void setKhoaVien(String khoaVien) {
        this.khoaVien = khoaVien;
    }

    public ArrayList<MonHoc> getMonDay() {
        return monDay;
    }

    public void setMonDay(ArrayList<MonHoc> monDay) {
        this.monDay = monDay;
    }

}

package sinhvien;

import chung.IThaoTac;
import java.util.ArrayList;


public class ThaoTacSinhVien implements IThaoTac {

    @Override
    public ArrayList<SV> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <SV> SV addNew(SV eletment) {
        System.out.println("Add element successfully");
        return eletment;
    }

    @Override
    public Object update(Object eletment) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <SV> SV delete(SV eletment) {
        System.out.println("Delete successfully");
        return eletment;
    }

    @Override
    public ArrayList<? extends Object> searchByID(String ID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<SV> searchByClass(String maLop) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

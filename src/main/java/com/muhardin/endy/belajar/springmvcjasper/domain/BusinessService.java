package com.muhardin.endy.belajar.springmvcjasper.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessService {
    public List<Anggota> semuaAnggota(){
        List<Anggota> hasil = new ArrayList<Anggota>();
        
        Anggota a = new Anggota();
        a.setNama("Endy Muhardin");
        a.setEmail("endy.muhardin@gmail.com");
        a.setHandphone("081234567890");
        a.setTanggalLahir(new Date());
        hasil.add(a);
        
        Anggota a1 = new Anggota();
        a1.setNama("Lukman Hakim");
        a1.setEmail("lukman@gmail.com");
        a1.setHandphone("085678909876");
        a1.setTanggalLahir(new Date());
        hasil.add(a1);
        
        return hasil;
    }
    
    public List<Kantor> semuaKantor(){
        List<Kantor> hasil = new ArrayList<Kantor>();
        
        Kantor k = new Kantor();
        k.setNama("Kantor Jakarta");
        k.setAlamat("Jakarta");
        k.setTelepon("021-987654321");
        hasil.add(k);
        
        Kantor k1 = new Kantor();
        k1.setNama("Kantor Bogor");
        k1.setAlamat("Bogor");
        k1.setTelepon("0251-987654321");
        hasil.add(k1);
        
        return hasil;
    }
}

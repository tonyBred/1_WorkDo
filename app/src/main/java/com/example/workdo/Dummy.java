package com.example.workdo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Dummy {

    private LinkedList<Tugas> listTugas = new LinkedList<Tugas>();

    Dummy() {
        listTugas = new LinkedList<Tugas>();
        listTugas.add(new Tugas("Membuat view template", "Pengembangan Perangkat Lunak 1 Teori", new GregorianCalendar(2021, 3-1, 25, 17, 00, 00), "Buat view tabel mahasiswa di template"));
        listTugas.add(new Tugas("Pelajari Fragment", "Pemrograman Perangkat Begerak Praktek", new GregorianCalendar(2021, 3-1, 26, 18, 00, 00) , "Pelajari pragement dan implementasikan bersama recycler activity"));
        listTugas.add(new Tugas("Membuat artikel perjuangan", "Pancasilla", new GregorianCalendar(2021, 3-1, 27, 19, 00, 00), "Buat artikel tentang ancaman bangsa"));
        listTugas.add(new Tugas("Perbaiki ppt topik besar", "Proyek Perangkat Lunak 4", new GregorianCalendar(2021, 5-1, 4, 20, 00, 00), "Perbaiki ppt dengan tambahakn hardware detail"));
        listTugas.add(new Tugas("Buat Login session pada template", "Pengembangan Perangkat Lunak 1 Praktek", new GregorianCalendar(2021, 5-1, 25, 7, 00, 00), "Tambah SESSION dan masukan username pada template"));
    }

    public LinkedList<Tugas> getListTugas(){
        return listTugas;
    }

    public void setListTugas(LinkedList<Tugas> list){
        this.listTugas = list;
    }

}

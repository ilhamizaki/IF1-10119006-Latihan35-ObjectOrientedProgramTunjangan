/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Tunjangan karyawan
 */
public class Tunjangan {
    public double gajiPokok;
    public double tunjangan;
    public String status;

    public double statusTunjangan() {
        if ("Menikah".equals(status)) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
    }
    
    public double hitungGaji() {
        return tunjangan + gajiPokok;
    }
}

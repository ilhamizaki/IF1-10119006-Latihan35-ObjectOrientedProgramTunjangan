/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Gaji Karyawan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tunjangan gajiKaryawan = new Tunjangan();
        
        System.out.println("===========Program Tunjangan============");
        System.out.print("Berapa Gaji Pokok anda perbulan ?: Rp. ");
        gajiKaryawan.gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        gajiKaryawan.status = scanner.next();
        
        System.out.println();

        System.out.println("======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok \t: Rp " + gajiKaryawan.gajiPokok);
        System.out.println("Tunjangan \t: Rp " + gajiKaryawan.statusTunjangan());
        System.out.println("Total Gaji \t: Rp " + gajiKaryawan.hitungGaji());
        System.out.println("(Developed by : Ilham Zaki)"); 
    }
}

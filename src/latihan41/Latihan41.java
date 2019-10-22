/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan41;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus k = new Kubus();
        Scanner sc = new Scanner(System.in);
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi  : ");
        int sisi = sc.nextInt();
        System.out.print("Massa : ");
        int massa = sc.nextInt();
        System.out.println("\n======Hasil Perhitungan======");
        int volume = k.hitungVolume(sisi);
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : "+k.hitungMassaJenis(massa, volume));
    }

}

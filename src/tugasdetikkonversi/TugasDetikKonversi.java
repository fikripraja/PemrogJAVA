/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdetikkonversi;

/**
 *
 * @author Lk09Nu7Uty
 */
public class TugasDetikKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int detik, menit;
        int jam, sisa1, sisa2;

        detik = 3600;

        jam = detik / 3600;
        sisa1 = detik % 3600;

        menit = (int) sisa1 / 60;
        sisa2 = sisa1 % 60;

        System.out.println("Detiknya : " + detik);
        System.out.println(+jam + " jam " + menit + " menit " + sisa2 + " detik ");

    }

}

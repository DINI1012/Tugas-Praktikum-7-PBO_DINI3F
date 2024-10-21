/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author DINI
 */
public class TokoSerbaAda {
    // Daftar dari barang dengan kode, nama, dan harga
    String[] kodeBarang = {"001", "002", "003", "004", "005"};
    String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
    int[] hargaBarang = {3000, 4000, 2000, 8000, 10000};
    
    // Method untuk pencetakan nota
    public void cetakNota(String[] kodePembelian, int[] jumlahBeli, int jumlahItem) {
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");

        int totalBayar = 0;

        // Langkah untuk memproses dan mencetak item nya
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kodePembelian[i])) {
                    int jumlahBayar = jumlahBeli[i] * hargaBarang[j];
                    // Digunakan untuk mengatur jarak/space dari antar teksnya
                    System.out.printf("%-4d%-13s%-12s%-8d%-13d%-12d\n",
                            (i + 1), kodePembelian[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar);
                    totalBayar += jumlahBayar;
                }
            }
        }

        System.out.println("*************************************************************");
        // Digunakan untuk mengatur jarak/space dari antar teksnya
        System.out.printf("%-54s%-15d\n", "Total Bayar:", totalBayar);
    }
}

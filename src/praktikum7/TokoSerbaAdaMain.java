/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum7;

/**
 *
 * @author DINI
 */
import java.util.Scanner;

public class TokoSerbaAdaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek TokoSerbaAda
        TokoSerbaAda toko = new TokoSerbaAda();

        // Menginput jumlah dari item
        System.out.print("Masukkan jumlah item yang akan dibeli: ");
        int jumlahItem = scanner.nextInt();

        // Arrays untuk menyimpan detail  dari pembelian pembelian
        String[] kodePembelian = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];

        // Menginputkan data dari pembelian
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan kode barang: ");
            kodePembelian[i] = scanner.next();
            
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = scanner.nextInt();
        }

        // Cetak hasil pembelian menggunakan objek toko
        toko.cetakNota(kodePembelian, jumlahBeli, jumlahItem);
    }
}

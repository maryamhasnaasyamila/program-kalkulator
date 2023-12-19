package project_pdpl;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("=== Kalkulator ===");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Akar");
        System.out.println("6. Kuadrat");
        System.out.print("Pilih operasi: ");
        int pilihan = sc.nextInt();

        if (pilihan != 5 && pilihan != 6) {
            // Jika bukan akar atau kuadrat, minta dua angka
            System.out.print("Masukkan angka pertama: ");
            double angka1 = sc.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = sc.nextDouble();

            // Membuat objek operasi
            OperationFactory factory = new OperationFactory();
            Operation operation = factory.createOperation(pilihan);

            // Melakukan operasi
            double hasil = operation.hitung(angka1, angka2);

            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
        } else {
            // Jika operasi adalah akar atau kuadrat, minta satu angka saja
            System.out.print("Masukkan angka: ");
            double angka1 = sc.nextDouble();

            // Membuat objek operasi
            OperationFactory factory = new OperationFactory();
            Operation operation = factory.createOperation(pilihan);

            // Melakukan operasi
            double hasil = operation.hitung(angka1, angka1);

            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
        }
    }
}
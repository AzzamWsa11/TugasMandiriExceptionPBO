package PercobaanException;

import java.util.Scanner;

public class InputNamaUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int umur;

        // Input nama, hanya boleh huruf
        System.out.print("Masukkan nama (hanya huruf): ");
        while (true) {
            nama = scanner.nextLine();
            // Cek apakah input hanya mengandung huruf
            if (nama.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.print("Nama hanya boleh mengandung huruf dan spasi! Silakan coba lagi: ");
            }
        }

        // Input umur, hanya boleh angka positif
        System.out.print("Masukkan umur (hanya angka positif): ");
        while (true) {
            try {
                umur = Integer.parseInt(scanner.nextLine());
                // Cek apakah umur bernilai positif
                if (umur > 0) {
                    break;
                } else {
                    System.out.print("Umur harus bernilai positif! Silakan coba lagi: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Input tidak valid! Silakan masukkan angka: ");
            }
        }

        // Tampilkan hasil input
        System.out.println("\nData yang diinput:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);

        scanner.close(); // Menutup scanner setelah digunakan
    }
}


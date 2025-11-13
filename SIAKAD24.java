import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMatkul];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            double rataSiswa = totalPerSiswa / jumlahMatkul;
            System.out.println("Nilai rata-rata ke-" + (i + 1) + ": " + rataSiswa);
        }

        System.out.println("\n===========================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < 3; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul / jumlahMahasiswa;
            System.out.println("Mata kuliah " + (j + 1) + ": " + rataMatkul);
        }
    }
}

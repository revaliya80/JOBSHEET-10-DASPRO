import java.util.Scanner;

public class TugasArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int responden = 10;
        int pertanyaan = 6;
        int nilai[][] = new int[responden][pertanyaan];

        for (int i = 0; i < responden; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < pertanyaan; j++) {
                System.out.print("Nilai Pertanyaan ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rata-rata tiap responden: ");
        for (int i = 0; i < responden; i++) {
            double total = 0;
            for (int j = 0; j < pertanyaan; j++) {
                total += nilai[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total / pertanyaan));
        }
        double tottalSemua = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan;) {
                tottalSemua += nilai[i][j];
            }
        }
        System.out.println("\nRata-rata keseluruhan: " + (tottalSemua / (responden * pertanyaan)));

        sc.close();
    }
}

import java.util.Scanner;

public class ModifikasiPemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.println("Nilai uas : ");
        float uas = input23.nextFloat();
        System.out.println("Nilai uts : ");
        float uts = input23.nextFloat();
        System.out.println("Niali kuis : ");
        float kuis = input23.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input23.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        System.out.print("Nilai anda dirapot adalah ");
        if (total > 80) {
            System.out.print("A");
        } else if (total > 73) {
            System.out.print("B+");
        } else if (total > 65) {
            System.out.print("B");
        } else if (total > 60) {
            System.out.print("C+");
        } else if (total > 50) {
            System.out.print("C");
        } else if (total > 39) {
            System.out.print("D");
        } else {
            System.out.print("E");
        }
    }
}

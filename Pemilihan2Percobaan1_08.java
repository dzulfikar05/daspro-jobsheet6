import java.util.Scanner;

public class Pemilihan2Percobaan1_08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input08.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun tahun Kabisat");
            } else {
                System.out.println("Bukan tahun Kabisat");
            }
        }

    }
}
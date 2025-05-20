import java.util.Scanner;

public class SequentialSearch {
    /*
    Buatlah sebuah program searching (algoritma sequential search) dengan menggunakan bahasa Java. Adapun data yang dimasukkan yaitu (a1, a2, a3, a4, a5) silahkan tentukan sendiri nilai dari a1 sampai a5, lakukan pencarian angka n (tentukan sendiri) pada data tersebut.

    Berikan penjelasan tahap demi tahap proses searching tersebut, gambarkan dengan rinci prosesnya.
  */
    public static void main(String[] args) {
       
        int[] data = {15, 23, 7, 9, 42};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == n) {
                System.out.println("Angka " + n + " ditemukan pada index ke-" + i);
                found = true;
                break;
            }   
        }
        if (!found) {
            System.out.println("Angka " + n + " tidak ditemukan.");
        }
    }   
}
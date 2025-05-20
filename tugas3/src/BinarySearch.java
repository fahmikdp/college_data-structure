import java.util.Scanner;

public class BinarySearch {
    /*
   Buatlah sebuah program searching (algoritma binary search) dengan menggunakan bahasa Java. Adapun data yang dimasukkan yaitu (a1, a2, a3, a4, a5) silahkan tentukan sendiri nilai dari a1 sampai a5, lakukan pencarian angka n (tentukan sendiri) pada data tersebut.

    Berikan penjelasan tahap demi tahap proses searching tersebut, gambarkan dengan rinci prosesnya.
    */
    public static void main(String[] args) {

        int[] data = {7, 9, 15, 23, 42};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin dicari: ");
        int n = scanner.nextInt();
        boolean found = false;
        
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(low +", "+ mid + ", "+high);

            if (data[mid] == n) {
                System.out.println("Angka " + n + " ditemukan pada index ke-" + mid);
                found = true;
                break;
            } else if (data[mid] < n){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Angka " + n + " tidak ditemukan.");
        }
            

    }
}

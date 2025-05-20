
public class NomorDua {

    /*
     * Buatlah coding pengurutan data dari terkecil hingga terbesar dari data berikut (a1, a2, a3, a4, a5, a6) tentukan sendiri nilai a1 sampai a6. Urutkan dengan menggunakan algoritma Counting-sort? Kemudian anda analisa kinerja algoritma tersebut? 
     */

    public static void countingSort(int[] arr) {
        
        int max = arr[0];
        int min = arr[0];

        // cari nilai max & min
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        int range = max - min + 1;
        int[] count = new int[range];

        for (int num : arr) {
            count[num - min]++;
        }
        // printArray(count);

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }

    }
    
    public static void printArray(int[] arr){
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11};
        System.out.println("Array sebelum diurutkan:");
        printArray(data);
        
        long startTime = System.nanoTime();

        countingSort(data);

        long endTime = System.nanoTime();

        System.out.println("Array sebelum diurutkan:");
        printArray(data);

        // menghitung waktu eksekusi
        long duration = (endTime - startTime);
        System.out.println("Waktu Eksekusi: "+ duration + " nanoseconds");
        
    }
}


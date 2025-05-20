import java.util.Arrays;
public class NomorSatu {
    /*
        Buatlah coding pengurutan data dari terkecil hingga terbesar dari data berikut (a1, a2, a3, a4, a5, a6) tentukan sendiri nilai a1 sampai a6. Urutkan dengan menggunakan algoritma Merge-sort? Kemudian anda analisa kinerja algoritma tersebut?
        */ 

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // memisahkan array jadi 2 bagian
        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        // buat rekursif untuk membagi sisi kiri dan sisi kanan
        mergeSort(left);
        mergeSort(right);

        
        merge(arr, left, right);
        // System.out.println(Arrays.toString(arr) + " "+ Arrays.toString(left)+ " "+Arrays.toString(right));


    }

     public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0,
            j = 0,
            k = 0;

        while (i < left.length && j < right.length) {
            
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }

        }

        while (i < left.length){
            arr[k++] = left[i++];
        }

        while (j < right.length){
            arr[k++] = right[j++];
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
        
        mergeSort(data);
        
        long endTime = System.nanoTime();
        System.out.println("Array sesudah diurutkan:");
        printArray(data);
        
        long duration = (endTime - startTime);
        System.out.println("Waktu Eksekusi: "+ duration + " nanoseconds");
        
        
    }
    
}






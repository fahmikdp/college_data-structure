/** 
 * 
 * 1.  Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘nilai’?
   2.  Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kata’ yang berisi kata ‘struktur’? 
   3.  Buatlah pendeklarasian array satu dimensi dengan nama array adalah ‘arraySatu’, tipe data integer, yang berisi angka (12, 10, 40)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 
   4.  Buatlah pendeklarasian array dua dimensi dengan nama array adalah ‘arrayDua’, tipe data integer, yang terdiri dari dua baris dan tiga kolom, seperti pada matrik berikut: 
          12   10   40 

           13  11   41 

           14  12   42 

        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 

    5. Buatlah deklarasi linked list yang memiliki list (10, 20, 30, 40, 50)? 

        Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 
 * 
 * 
 * 
    Nama : Fahmi Kurnia Dwiputra
    NIM : 051075227
    UPBJJ : Jakarta

 * */

 import java.util.LinkedList;

public class Index {
    public static void main(String[] args) {
        
        // no 1
        int nilai = 10;
        System.out.println(nilai);

        // no 2
        String kata = "struktur";
        System.out.println(kata);

        // no 3
        int[] arraySatu = {12, 10, 40};
        System.out.println(arraySatu[0]);
        for (int i : arraySatu) {
            System.out.println(i);
        }
        
        // no 4
        int[][] arrayDua = {
            {12, 10, 40},
            {13, 11, 41},
            {14, 12, 42} 
        };
        System.out.println(arrayDua[1][2]);
        for (int[] val : arrayDua) {
            System.out.println(val[0]);
            System.out.println(val[1]);
        }

        // no 5 
        LinkedList<Integer> LinkedList = new LinkedList<>();
        // (10, 20, 30, 40, 50)
        LinkedList.add(10);
        LinkedList.add(20);
        LinkedList.add(30);
        LinkedList.add(40);
        LinkedList.add(50);

        System.out.println(LinkedList.get(0));

        for (Integer integer : LinkedList) {
            System.out.println(integer);
        }

        
    }
}

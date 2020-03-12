//2201819841 - EKA CINDI FEBRU ANITA SUGIYANTO
package forumbad2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForumBAD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] array = { -4, -6, -1, 0, 7, 4, -2, 1, -5, 3, -3, 2, 5, -7, 6};
                
        System.out.println("Menu Array:");
        System.out.println("1. Mencari Elemen Minimum dan Maximum\n" +
                           "2. Menggabungkan Dua Array\n" +
                           "3. Mengisi Sekaligus Inisialisasi Array\n" +
                           "4. Extend Array Setelah Inisialisasi\n" +
                           "5. Mengurutkan dan Mencari Elemen Array");
        System.out.print("Masukkan Pilihan : ");
        int choose = input.nextInt();
        
        if(choose == 1){
            int min = (int) Collections.min(Arrays.asList(array));
            int max = (int) Collections.max(Arrays.asList(array));
            System.out.println("Min number: " + min);
            System.out.println("Max number: " + max);
        }
        else if(choose == 2){
            String a[] = { "Song", "Min-Ho"};
            String b[] = { "30", "03" };
            List list = new ArrayList(Arrays.asList(a));
            list.addAll(Arrays.asList(b));
            Object[] c = list.toArray();
            System.out.println(Arrays.toString(c));
        }
        else if(choose == 3){
            int arrays[] = new int[3];
            Arrays.fill(arrays, 5);
                for (int i=0, n=arrays.length; i < n; i++) {
                    System.out.println(arrays[i]);
                }
            System.out.println();
            Arrays.fill(arrays, 2, 3, 20);
                for (int i=0, n=arrays.length; i< n; i++) {
                    System.out.println(arrays[i]);
                }
        }
        else if(choose == 4){
            String[] names = new String[] { "C", "I", "N" };
            String[] extended = new String[5];
            extended[3] = "D";
            extended[4] = "I";
            System.arraycopy(names, 0, extended, 0, names.length);
                for (String str : extended){
                    System.out.println(str);
                }
        }
        else if(choose == 5){
            Arrays.sort(array);
            printArray("Sorted array", array);
            int index = Arrays.binarySearch(array, 5);
            System.out.println("\nFound 5 @ " + index);
        }
    }

    private static void printArray(String sorted_array, Integer[] array) {
        System.out.println(sorted_array
        + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
        System.out.print(array[i]); 
        }
    }
}

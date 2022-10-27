package SearchInJava;

import java.util.Arrays;

public class SearchInJava {


           /*
            0. Först behöver listan sorteras. Vi gör det med Bubble sort

    1.1. Skriv bubble sort-algoritmen steg för steg på svenska

    1.2. Rita ett flödesdiagram/flow chart av bubble sort-algoritmen

    1.3. Implementera flödesdiagrammet i Java
    ----
    2.1  Skriv binary search-algoritmen steg för steg på svenska

    2.2  Rita ett flödesdiagram/flow chart av binary seach-algoritmen

    2.3  Implementera flödesdiagrammet i Java
     */
    //Vår gemensamma osorterade lista av heltal: int[] list = {12, 27, 8, 11, 91, 2, 9, 57, 33, 41, 6, 100, 64};
    public static void main(String[] args) {
        int[] arr = {12, 27, 8, 11, 91, 2, 9, 57};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.print("Array After Bubble Sort ");
        for (int i = 0; i < arr.length; i++) {
           // System.out.print(arr[i] + " ");

        }System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("BinarySearch result is this:");
        binarySearch(arr,57);

    }
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void binarySearch (int [] arr, int searchElement) {
        int  startIndex = 0;
        int  endIndex = arr.length - 1;
        int midIndex;

        while (startIndex <= endIndex) {

            midIndex =(int) Math.floor(startIndex + endIndex)/2;

            if (arr[midIndex] == searchElement) {
                midIndex=midIndex;
                System.out.println("searchElement is " +arr[midIndex]+ " and index of searchElement is "+midIndex);
                break;
            }
            if (searchElement < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
    }
}

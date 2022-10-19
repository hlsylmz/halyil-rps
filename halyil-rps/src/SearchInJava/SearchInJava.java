package SearchInJava;

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
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean switched = false;

        int temp = 0;
        boolean sorted = false;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

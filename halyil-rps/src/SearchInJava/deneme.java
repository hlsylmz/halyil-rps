package SearchInJava;

public class deneme {
    public static void main(String[] args) {
        int[] arr = {12, 27, 8, 11, 91, 2, 9, 57};
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}

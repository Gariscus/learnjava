package basics;

import java.util.Arrays;

public class Sort {
    public static int[] bubbleSort(int[] arr){
        boolean sorted = false;

        if (arr.length == 1 || arr.length == 0){
            return arr;
        }

        do {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        } while (!sorted);
        return arr;
    }
}

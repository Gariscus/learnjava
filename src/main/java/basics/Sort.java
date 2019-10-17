package basics;

import java.util.Arrays;

public class Sort {
    public static int[] bubbleSort(int[] arr){
        boolean sorted = false;

        if (arr.length < 2){
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
public static int[] bogoSort(int[] arr){
        while (!isSorted(arr)){
            for(int i = 0; i < arr.length -1; i++){
                int rndArrIdx1 = (int)(Math.random() * arr.length);
                int rndArrIdx2 = (int)(Math.random() * arr.length);
                int temp = arr[rndArrIdx1];
                arr[rndArrIdx1] = arr[rndArrIdx2];
                arr[rndArrIdx2] = temp;
            }
        }
        return arr;
    }

     public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] > arr[i+1])
            return false;
        }
        return true;
    }
}

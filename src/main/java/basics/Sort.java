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
        do{
            System.out.println("and another one");
            for(int i = 0; i < arr.length -1; i++){
                int random1 = (int)(Math.random() * arr.length);
                int random2 = (int)(Math.random() * arr.length);
                int temp = arr[random1];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }while (!isSorted(arr));
        return arr;
    }
    
    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            if(i != arr.length -1 && arr[i] > arr[i+1]) 
            return false;
        }
        return true;
    }
}

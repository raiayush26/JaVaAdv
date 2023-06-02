package COM.AYUSH;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int [] arr={ 1,3,22,9,18};
        // swap(arr, 0, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start ++;
            end --;

        }
    }
    static void swap(int[] arr ,int i, int i2){
        int temp = arr[i];
        arr[i] = arr[i2];
        arr[i2] = temp;
    }
}

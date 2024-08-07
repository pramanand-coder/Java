import java.util.*;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String...args){
        int a[]={66,33,17,99,54,32,55,11,23};
        System.out.println("Before Sorting: "+Arrays.toString(a));
        bubbleSort(a);
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}

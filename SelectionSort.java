import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[mini]>arr[j]){
                mini=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
    }
    public static void main(String...args){
        int a[]={66,33,17,99,54,32,55,11,23};
        System.out.println("Before Sorting: "+Arrays.toString(a));
        selectionSort(a);
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}

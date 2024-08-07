import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j=j-1;
            }
        }
    }
    public static void main(String...args){
        int a[]={66,33,17,99,54,32,55,11,23,17};
        System.out.println("Before Sorting: "+Arrays.toString(a));
        insertionSort(a);
        System.out.println("After Sorting: "+Arrays.toString(a));
    }
}

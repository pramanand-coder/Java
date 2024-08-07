import java.util.*;
public class MergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        int left=low,right=mid+1,i=0;
        int temp[]=new int[high-low+1];
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
            }
            else{
                temp[i]=arr[right];
                right++;
            }
            i++;
        }
        while(left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args){
       int[] a={77,22,45,11,89,40,99};
       System.out.println("Before Sorting: "+Arrays.toString(a));
       mergeSort(a,0,a.length-1);
       System.out.println("After Sorting: "+Arrays.toString(a));

    }
}

import java.util.*;
public class QuickSort {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int fun(int[] arr, int low, int high) {
        int i = low, j = high;
        int pivot = arr[low];
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j>=low) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public static void QS(int[] arr, int low, int high) {
        if (low < high) {
            int part = fun(arr, low, high);
            QS(arr, low, part - 1);
            QS(arr, part + 1, high);
        }
    }
    public static void main(String[] args) {
        int a[] = {11, 9, 13, 99, 76, 44, 80, 6, 60};
        int n = a.length;
        System.out.println("Before Sorting Array is: " + Arrays.toString(a));
        QS(a, 0, n - 1);
        System.out.println("After Sorting array is: " + Arrays.toString(a));
    }
}

package algorithm;

import java.util.Arrays;
public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        int length = list.length;
        for (int i = 1; i < length; ++i) {
            int valueAtI = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > valueAtI) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = valueAtI;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;

        int length = list.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] mergeSort(int [] array, int beginning, int end){
        int [] list = array;

        if(beginning < end){
            int mid = (beginning+end)/2;
            mergeSort(list,beginning,mid);
            mergeSort(list,mid+1,end);
            mergeArray(list,beginning,mid,end);
        }

        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] quickSort(int [] array, int start, int end){
        int [] list = array;

        if (start < end) {
            int i = arrayPartition(list, start, end);
            quickSort(list, start, i-1);
            quickSort(list, i+1, end);
        }

        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] heapSort(int [] array){
        int [] list = array;

        int length = list.length;

        for (int i = length / 2 - 1; i >= 0; i--){
            heapifyArray(list, length, i);
        }

        for (int i=length-1; i>=0; i--) {
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            heapifyArray(list, i, 0);
        }

        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;

        int noOfBuckets = list.length;
        int max = (Arrays.stream(list).max().getAsInt());
        int[] bucket = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            bucket[i] = 0;
        }
        for (int i = 0; i < noOfBuckets; i++) {
            bucket[list[i]]++;
        }
        for (int i = 0, j = 0; i <= max; i++) {
            while (bucket[i] > 0) {
                list[j++] = i;
                bucket[i]--;
            }
        }

        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;

        int length = list.length;
        for (int i = length / 2; i > 0; i /= 2) {
            for (int j = i; j < length; j += 1) {
                int temp = list[j];
                int k;
                for (k = j; k >= i && list[k - i] > temp; k -= i)
                    list[k] = list[k - i];
                list[k] = temp;
            }
        }

        final long endTime = System.currentTimeMillis();
        long startTime = 0;
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void heapifyArray(int arr[], int length, int index) {
        int largest = index;
        int l = 2 * index + 1;
        int r = 2 * index + 2;

        if (l < length && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < length && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            heapifyArray(arr, length, largest);
        }
    }

    private void mergeArray(int[] list, int beginning, int mid, int end) {
        int n1 = mid - beginning + 1;
        int n2 = end - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = list[beginning + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = list[mid + 1 + j];
        }
        int i = 0, j = 0;

        int k = beginning;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            list[k] = R[j];
            j++;
            k++;
        }

    }

    private int arrayPartition(int list[], int start, int end){
        int pivot = list[end];
        int i = (start-1);
        for (int j=start; j<end; j++) {
            if (list[j] < pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        int temp = list[i+1];
        list[i+1] = list[end];
        list[end] = temp;

        return i+1;
    }

}

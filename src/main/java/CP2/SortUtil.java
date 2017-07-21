package CP2;

/**
 * Created by Mazexal on 2017/7/18.
 */
public class SortUtil {


    //冒泡 时间复杂度O(n^2) 空间 O(1)
    public static void bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
            for (int j = 1; j < len; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //选择排序
    public static void selectionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }

    }

    public static void inserionSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int index = i, array_i = array[i];
            while (index > 0 && array[index - 1] > array_i) {
                array[index] = array[index - 1];
                index -= 1;
            }
            array[index] = array_i;
            for (int item : array) {
                System.out.print(item + " ");
            }
            System.out.println();
        }


    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] helper = new int[array.length];
        for (int k = low; k <= high; k++) {
            helper[k] = array[k];
        }
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
        // k means current location
            if (i > mid) {
        // no item in left part
                array[k] = helper[j];
                j++;
            } else if (j > high) {
        // no item in right part
                array[k] = helper[i];
                i++;
            } else if (helper[i] > helper[j]) {
        // get smaller item in the right side
                array[k] = helper[j];
                j++;
            } else {
        // get smaller item in the left side
                array[k] = helper[i];
                i++;
            }
        }
    }



    public static void sort(int[] array, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


    public static void mergeSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array){
        if(array != null){
            quickSort(array, 0, array.length-1);
        }
    }

    private static void quickSort(int[] array,int beg,int end){
        if(beg >= end || array == null)
            return;
        int p = partition(array, beg, end);
        quickSort(array, beg, p-1);
        quickSort(array, p+1, end);
    }

    private static int partition(int[] array, int beg, int end) {
        int first = array[beg];
        int i = beg, j = end;
        while (i < j) {
            while (array[i] <= first && i < end) {
                i++;
            }
            while (array[j] > first && j >= beg) {
                j--;
            }
            if (i < j) {
                array[i] = array[i] ^ array[j];
                array[j] = array[i] ^ array[j];
                array[i] = array[i] ^ array[j];
            }
        }
        if (j != beg) {
            array[j] = array[beg] ^ array[j];
            array[beg] = array[beg] ^ array[j];
            array[j] = array[beg] ^ array[j];
        }
        return j;
    }

}

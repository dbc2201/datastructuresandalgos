/*package whatever //do not write package name here */

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {60, 5, 8, 2, -6, 25};
        mergeSort(array, 0, array.length - 1);
        printArray(array);
    }


    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        } else {
            return;
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        //create an array with low to mid and mid+1 to right
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int i = 0, j = 0, k = low;
        //k should be initialized to low every time
        int[] left = new int[n1];
        int[] right = new int[n2];

        // n1 is up till mid
        while (i < n1) {
            left[i] = array[low + i];
            i++;
        }

        //n2 is up till mid+1
        while (j < n2) {
            right[j] = array[mid + 1 + j];
            j++;
        }

        i = j = 0;

        while (i < n1 && j < n2 && k <= high) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }


    public static void printArray(int[] array) {
        System.out.println("---------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {60, 5, 8, 2, -6, 25};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pointer = low - 1;
        for (int i = low; i <= high - 1; i++) {
            if (array[i] <= pivot) {
                pointer++;
                swap(array, pointer, i);
            }
        }
        swap(array, pointer + 1, high);
        return pointer + 1;
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

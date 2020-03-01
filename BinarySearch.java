public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {60, 5, 8, 2, -6, 25};
        int index = binarySearch(array, 67, 0, array.length - 1);
        System.out.println(index);
        //printArray(array);
    }

    public static int binarySearch(int[] array, int value, int low, int high) {
        while (low <= high) {
            printArray(array);
            int mid = (low + high) / 2;
            if (array[mid] == value)
                return mid;
            else if (array[mid] < value) return binarySearch(array, value, mid + 1, high);
            else return binarySearch(array, value, low, mid - 1);
        }
        return -1;
    }


    public static void printArray(int[] array) {
        System.out.println("---------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

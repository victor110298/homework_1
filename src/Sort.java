
import java.util.Random;

class Sort {
    public static void selectionSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("Selection sorting time: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void bubbleSort(int[] arr) {
        long start = System.currentTimeMillis();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("Bubble sorting time: " + (System.currentTimeMillis() - start) + "ms");
    }

    public static void insertionSort(int[] arr) {
        long start = System.currentTimeMillis();
        int tmp;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < tmp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = tmp;
        }
        System.out.println("Insertion sorting time: " + (System.currentTimeMillis() - start) + "ms");
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        System.out.println("Heap sorting time: " + (System.currentTimeMillis() - start) + "ms");
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(high + low) / 2];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int i = partition(arr, low, high);
            quickSort(arr, low, i - 1);
            quickSort(arr, i + 1, high);
        }
    }

    public static void quickSort(int[] arr) {
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick sorting time: " + (System.currentTimeMillis() - start) + "ms");
    }


    public static void checkSorts() {
        Random r = new Random();
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt() % 10000;
        }
        int[] arr1 = arr;
        quickSort(arr1);
        arr1 = arr;
        heapSort(arr1);
        arr1 = arr;
        selectionSort(arr1);
        arr1 = arr;
        insertionSort(arr1);
        arr1 = arr;
        bubbleSort(arr1);


    }
}
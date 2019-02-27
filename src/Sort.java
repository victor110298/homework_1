

import java.util.Random;

class Sort {
    Sort() {
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            int min = arr[i];
            int min1 = i;

            int swap;
            for(swap = i + 1; swap < arr.length; ++swap) {
                if (arr[swap] < min) {
                    min = arr[swap];
                    min1 = swap;
                }
            }

            if (i != min1) {
                swap = arr[i];
                arr[i] = arr[min1];
                arr[min1] = swap;
            }
        }

    }

    public static void bubble_Sort(int[] numbers) {
        int n = numbers.length;

        for(int i = 0; i < n; ++i) {
            for(int j = 1; j < n - i; ++j) {
                if (numbers[j - 1] > numbers[j]) {
                    int swap = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = swap;
                }
            }
        }

    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; ++i) {
            int tmp = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] < tmp; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = tmp;
        }

    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[i]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }

    }

    public static void heapSort(int[] a) {
        int i;
        for(i = a.length / 2 - 1; i >= 0; --i) {
            shiftDown(a, i, a.length);
        }

        for(i = a.length - 1; i > 0; --i) {
            swap(a, 0, i);
            shiftDown(a, 0, i);
        }

    }

    private static void shiftDown(int[] a, int i, int n) {
        int child;
        int tmp;
        for(tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && a[child] < a[child + 1]) {
                ++child;
            }

            if (tmp >= a[child]) {
                break;
            }

            a[i] = a[child];
        }

        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(high + low) / 2];
        int i = low - 1;

        int j;
        for(j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        j = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = j;
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
        quickSort(arr, 0, arr.length - 1);
    }

    public static void checkSorts() {
        Random r = new Random();
        int[] arr = new int[1000000];

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = r.nextInt() % 10000;
        }

        quickSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        heapSort(arr);
    }
}

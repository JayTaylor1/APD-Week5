package arraySorter;

public class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {
    public T[] sort(T[] array) {
        int low = 0;
        int high = array.length - 1;



        quickSort(array, low, high);

        return array;
    }

    public static  <T extends Comparable<T>> void quickSort(T[] arr, int a, int b) {
        if (a < b) {
            int i = a, j = b;
            T x = arr[(i + j) / 2];

            do {
                while (arr[i].compareTo(x) < 0) i++;
                while (x.compareTo(arr[j]) < 0) j--;

                if ( i <= j) {
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            quickSort(arr, a, j);
            quickSort(arr, i, b);
        }
    }


}

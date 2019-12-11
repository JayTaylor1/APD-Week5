package arraySorter;

public class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {
    public T[] sort(T[] array) {

        for(int i=0; i<array.length -1; i++)
        {
            int iSmallest = i;

            for(int j=i+1; j<array.length; j++)
            {
                if(array[iSmallest].compareTo((array[j])) > 0  )
                {
                    iSmallest = j;
                }
            }
            T iSwap = array[iSmallest];
            array[iSmallest] = array[i];
            array[i] = iSwap;
        }

        return array;
    }




}

package mylibrary;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */



public class QuickSortsGeneric<T extends Comparable<? super T>> {




    public void quickSort(T [] array, int low, int high){
        if(low < high){
            int partitionIndex = partition(array,low,high);

            quickSort(array,low,partitionIndex);

            quickSort(array, partitionIndex +1 ,high);
        }
    }

    private int partition(T[] array, int low, int high){

        int pivotIndex = (low+high) / 2;
        T pivotValue = array[pivotIndex];
        low --;
        high++;
        while(true) {
            do low++; while (array[low].compareTo(pivotValue) < 0);

            do high--; while (array[high].compareTo(pivotValue) > 0);

            if (low >= high)
                return high;

            swap(array,low,high);
        }
    }

    public void swap(T[] array, int i, int j){
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}

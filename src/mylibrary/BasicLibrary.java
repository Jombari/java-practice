package mylibrary;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */


public class BasicLibrary {


    /**
     * Binary Searh O(logn) array must be sorted
     * @param arr the sorted array
     * @param l left most index
     * @param r right most index
     * @param x number searching for
     * @return index of the number or -1 if not found
     */
    public static int binarySearch(int arr[],int l, int r, int x){
        if(r>=l){
            int mid = l + (r-l)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[mid]> x)
                return binarySearch(arr,l,mid - 1,x);

            return  binarySearch(arr,mid+1,r,x);
        }

        return -1;
    }

    /**
     * Linear search. O(n)
     * @param arr the array
     * @param x the number being searched for
     * @return index of the number or -1 if not found.
     */
    public static int linearSearch(int[] arr, int x){
        for(int i = 0; i< arr.length;i++ )
            if(arr[i] == x)
                return i;

        return -1;
    }

}

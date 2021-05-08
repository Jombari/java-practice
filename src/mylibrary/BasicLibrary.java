package mylibrary;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */


public class BasicLibrary {

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

}

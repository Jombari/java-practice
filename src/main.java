/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */
import mylibrary.QuickSortsGeneric;

import java.util.Arrays;

public class main {

    public static void main(String [] args){

        Integer[] arg = {3,4,2,7,1,5,7,2,6,34,7};
        System.out.println(arg.toString());
        new QuickSortsGeneric<Integer>().quickSort(arg,0,10);

        System.out.println(Arrays.toString(arg));


    }
}

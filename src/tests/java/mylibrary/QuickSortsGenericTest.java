package mylibrary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */


class QuickSortsGenericTest {

    @Test
    void quickSortIntegerTest() {
        Integer[] tmp = {85,23,5,1,34,75,9934,4};
        Integer[] answer = {1,4,5,23,34,75,85,9934};

        new QuickSortsGeneric<Integer>().quickSort(tmp,0,7);
        assertTrue(Arrays.equals(tmp,answer));
    }

    @Test
    void quickSortStringTest(){
        String[] tmp = {"Dog","Poop","Egg","Apple"};
        String[] answer = {"Apple","Dog","Egg","Poop"};

        new QuickSortsGeneric<String>().quickSort(tmp,0,3);
        assertTrue(Arrays.equals(tmp,answer));



    }
}
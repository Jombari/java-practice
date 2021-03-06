package mylibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



/*
   Describe here known bugs or issues in this file. If your issue spans multiple
   files, or you are not sure about details, add comments to the README.txt file.
 */


class BasicLibraryTest {

    @Test
    void binarySearchExist() {
        int [] tmp = {1,6,9,10,25,45};
        assertEquals(1, BasicLibrary.binarySearch(tmp,0,5,6));
    }

    @Test
    void binarySearchNotExist() {
        int[] tmp = {1,6,9,10,25,45};
        assertEquals(-1, BasicLibrary.binarySearch(tmp,0,5,100));
    }

    @Test
    void linearSearchTestExist() {
        int [] tmp = {1,6,9,10,25,45};
        assertEquals(1, BasicLibrary.linearSearch(tmp,6));
    }

    @Test
    void linearSearchTestNotExist() {
        int [] tmp = {1,6,9,10,25,45};
        assertEquals(-1, BasicLibrary.linearSearch(tmp,44));
    }

}
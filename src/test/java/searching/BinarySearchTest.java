package searching;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest{

    int[] myIntArraySorted = {0,1,21,33,45,45,61,71,72,73};
    int[] myIntArrayUnSorted = {45,61,33,73,45,71,0,1,21,72};

    @Test
    public void testSearchValueSorted(){
        BinarySearch bs = new BinarySearch();
        Assert.assertEquals(3,  bs.binarySearch(myIntArraySorted, 33));
        Assert.assertEquals(4,  bs.binarySearch(myIntArraySorted, 45));
    }

    @Test
    public void testSearchValueUnsorted(){
        BinarySearch bs = new BinarySearch();
        Arrays.sort(myIntArrayUnSorted);
        Assert.assertEquals(3,  bs.binarySearch(myIntArrayUnSorted, 33));
        Assert.assertEquals(4,  bs.binarySearch(myIntArrayUnSorted, 45));
    }


}
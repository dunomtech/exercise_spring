package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    public static final int[] array = {9, 4, 0, 8, 1, 6, 3, 7, 5, 2};
    public static final int[] arrayAsc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static final int[] arrayDesc = {9,8,7,6,5,4,3,2,1,0};

    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sort() {
        bubbleSort.sorting(array);
        assertEquals(Arrays.toString(array), Arrays.toString(arrayAsc));
    }

    @Test
    public void sortFail() {
        bubbleSort.sorting(array);
        assertEquals(Arrays.toString(array), Arrays.toString(arrayDesc));
    }

}
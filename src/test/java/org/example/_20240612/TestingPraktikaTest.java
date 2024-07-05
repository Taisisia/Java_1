package org.example._20240612;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.example._20240612.TestingPraktika.*;
import static org.junit.jupiter.api.Assertions.*;

class TestingPraktikaTest {
    @Test
    void arrReturnCorrectLengthTest(){
        assertTrue(getNumber().length == 3);
    }
    @Test
    void arrContainCorrectNumsTest(){
        int[] arr1= getNumber();
        for (int val:arr1){
            assertTrue(val>=1 && val <100);
        }
    }
    @Test
    void getNumbersCorrectNumsTest(){
        int[] array={1,2,3};
        assertArrayEquals(array, getNumbers());
    }
    @BeforeEach
//    void beforeInit() {
//        int[] array = new int[]{1, 2, 3};
//    }
    @Test
    void checkCorrectMaxValTest(){
        assertTrue(3 == findMax(array1));
    }
    @Test
    void checkIsArrayEmptyTest(){
        Integer[] arr=new Integer[0];
        assertNull(findMax(arr));
    }
    int[] array;
    Integer[] array1;
    @Test
    void checkIsArrayNotEmptyTest(){
        Integer[] array1 = new Integer[0];
        assertNotNull(findMax(array1));
    }

    @BeforeEach
    void beforeInit() {
        array=new int[]{1,2,3};
        array1=new Integer[]{1,2,3};

    }
}
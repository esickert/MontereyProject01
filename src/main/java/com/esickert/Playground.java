package com.esickert;

import org.junit.Test;
//********************************************************************
public class Playground {

@Test
public void sortedArray()   {
    int[] a = {1,4,2,5,9,3,8,7};
    int temp = a[0];  //not used!!

    display(a, "BEFORE");
    selectionSort(a);
    display(a, "AFTER");
}

@Test
public static void display (int[] array, String when) {
    System.out.print("Array values " + when + " sorting: ");
    for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + " ");
    System.out.println();
}

public static void selectionSort(int[] anArray)  {

    for(int index= 0; index < anArray.length-1; index++)    {
        int indexOfNextSmallest = getIndexOfSmallest(index, anArray);

       interchange(index, indexOfNextSmallest, anArray);
    }
}

static int getIndexOfSmallest(int startIndex, int[]a)   {

    int min = a[startIndex];
    int indexOfMin = startIndex;
    for(int index = startIndex + 1; index < a.length; index++) {
        if (a[index] < min) {
            min = a[index];
            indexOfMin = index;
        }
    }
    return indexOfMin;
}

static void interchange(int i, int j, int[] a) {

    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}

}













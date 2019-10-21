package com.spartaglobal.engineering_43.bubble.sort.project;

public class BubbleSorting {

    public void bubbleSort(int[] numSort){

        int arr = numSort.length;
        for (int i = 0; i < arr-1; i++)
            for (int j = 0; j < arr-i-1; j++)
                if (numSort[j] > numSort[j+1]){
                    int temp = numSort[j];
                    numSort[j] = numSort[j+1];
                    numSort[j+1] = temp;
                }

        }

}

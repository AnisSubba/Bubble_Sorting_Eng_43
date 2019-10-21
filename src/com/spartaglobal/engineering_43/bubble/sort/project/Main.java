package com.spartaglobal.engineering_43.bubble.sort.project;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        int numSort[] = {8,4,7,9,5};

        System.out.println("Before Bubble Sort: ");
        for (int i = 0; i < numSort.length; i++){
            System.out.println(numSort[i] + " ");
        }
        System.out.println();

        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.bubbleSort(numSort);

        System.out.println("After bubble Sort: ");
        for (int i = 0; i < numSort.length; i++){
            System.out.println(numSort[i] + " ");
        }

    }
}

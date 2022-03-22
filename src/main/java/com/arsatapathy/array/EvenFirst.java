package com.arsatapathy.array;

public class EvenFirst {
    public static int[] evenFirst(int[] array) {
        int even = 0;
        int odd = array.length - 1;

        while (even <= odd) {
            if (array[even] %2 == 0)
                even ++;
            else {
                int temp = array[even];
                array[even] = array[odd];
                array[odd--] = temp;
            }
        }

        return array;
    }
}

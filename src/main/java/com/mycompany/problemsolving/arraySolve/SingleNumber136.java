package com.mycompany.problemsolving.arraySolve;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int val = 0;

        for (int num : nums) {
            val ^= num;
        }
        System.out.println(val);

    }

}

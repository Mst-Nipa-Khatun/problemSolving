package com.mycompany.problemsolving.arraySolve;

public class PivotIndex724 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int rightsum = 0;
        int leftsum = 0;


        for (int i = 0; i < nums.length; i++) {
            int currentLeft = nums[i];
            leftsum += currentLeft;
            rightsum += nums[(nums.length-1) - i];
            if (currentLeft == rightsum) {

            }
        }


        for (int i = 0; i < nums.length; i++) {
            rightsum = rightsum + nums[i];
        }

        for (int j = nums.length - 1; j > 0; j--) {
            leftsum = leftsum + nums[j];
            rightsum = rightsum - nums[j];

            if (leftsum == rightsum) {
                System.out.println(nums[j]);
            } else {
                //how to return
                System.out.println(-1);
            }
        }
        System.out.println(rightsum);
    }
}
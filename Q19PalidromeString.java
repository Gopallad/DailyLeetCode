//leetcode Q125

import java.util.Arrays;

class Solution {

    public void rev(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Solution a = new Solution();

        a.rev(arr);

        System.out.println(Arrays.toString(arr));
    }
}
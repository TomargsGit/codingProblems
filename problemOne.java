/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
 */


import java.util.Arrays;

public class ProblemOne {

    public static Boolean addNumbers(int[] numberList, int sum) {
        /* Sort the elements */
        Arrays.sort(numberList);

        int left = 0;
        int right = numberList.length-1;

        /* Now look for the two candidates
        in the sorted array*/

        while (left < right)
        {
            if(numberList[left] + numberList[right] == sum)
                return true;
            else if(numberList[left] + numberList[right] < sum)
                left++;
            else // numberList[left] + numberList[right] > sum
                right--;
        }
        return false;
    }

    public static Boolean addUpToKOnePass(int[] numberList, int sum) {
        return false;
    }

}

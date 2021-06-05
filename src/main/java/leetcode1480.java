import java.util.ArrayList;

//1480. Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
public class leetcode1480 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(RunningSum(nums).toString());

    }
// my solution
    static ArrayList<Integer> RunningSum(int[] array){
        int sum = 0;
        ArrayList<Integer> runningSum = new ArrayList<Integer>() ;
        for (int i: array) {
            System.out.println(i);
            sum = sum +i;
            runningSum.add(sum);
        }
        return runningSum;
    }

// preferred solution

    public int[] runningSum(int[] nums) {
        // modify the input array, adding n[i] with n[i-1]
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        // return the modified array
        return nums;
    }
}

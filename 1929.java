import java.util.*;
class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for (int i=0; i<nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] result = getConcatenation(arr);
        for (int i=0; i<n; i++)
        {
            System.out.println(result[i]);
        } 
    }
}

/* A number n can be broken into three parts n/2, n/3, and n/4 (consider only the integer part). Each number obtained in this process can be divided further recursively. Find the maximum sum that can be obtained by summing up the divided parts together.
Note: It is possible that we don't divide the number at all.*/
/* Input:
n = 12
Output: 
13
Explanation: 
Break n = 12 in three parts {12/2, 12/3, 12/4} = {6, 4, 3}, now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively.*/



import java.util.*;
class MaximumSumProblem
{
    public int maxSum(int n){ 
        if (n == 0 || n == 1){
            return n;
        }
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=n; i++){
            dp[i] = Math.max(dp[i/2] + dp[i/3] + dp[i/4], i);
        }
        return dp[n];
    } 
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MaximumSumProblem msp = new MaximumSumProblem();
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(msp.maxSum(n));
    }
    
}   


















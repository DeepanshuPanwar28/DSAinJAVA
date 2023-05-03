# 1. Two Sum :
  1. Difficulty - Easy
  2. [Question Link](https://leetcode.com/problems/two-sum/)
  3. Language - Java

***Solution***
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int idx1 = 0;
		int idx2 = 0; 
        int [] arr = new int [2]; 
        int s = 0;
        for (int i = s; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    arr[0] = i; 
                    arr[1] = j; 
                }
            }
        }
        return arr; 
    }
}
```

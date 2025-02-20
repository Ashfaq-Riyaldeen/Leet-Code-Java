package Two_Sum;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target)
        {
          int[] a={i,j};
          return a;
        }
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {2, 7, 8, 15};
    int target = 10;
    int[] result = s.twoSum(nums, target);
    System.out.println(result[0] + " " + result[1]);
  }

}

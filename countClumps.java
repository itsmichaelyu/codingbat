// https://codingbat.com/prob/p193817

public int countClumps(int[] nums) {
  int clumps = 0;
  for (int i = 2; i < nums.length; i++) {
    nums[i-2] = nums[i-2] == nums[i-1] && nums[i-2] == nums[i] ? 9999+i : nums[i-2]; 
  } 
  for (int i = 1; i < nums.length; i++) {
    clumps+= nums[i-1] == nums[i] ? 1 : 0;
  }
  return clumps;
}
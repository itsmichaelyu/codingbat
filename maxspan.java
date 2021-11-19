// https://codingbat.com/prob/p189576

public int maxSpan(int[] nums) {
  int maxNum = 0;
  for (int i : nums) {
    int left = 0;
    int right = 0;
    for (int z = 0; z < nums.length; z++) {
      if (nums[z] == i) break;
      left++;
    }
    for (int b = nums.length-1; b >= 0 ; b--) {
      if (nums[b] == i) break;
      right++;
    }
    maxNum = nums.length-right-left > maxNum ? nums.length-right-left : maxNum;
  }
  return maxNum;
}

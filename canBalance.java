// https://codingbat.com/prob/p158767

public boolean canBalance(int[] nums) {
  boolean canBalance = false;
  for (int i = 0; i < nums.length; i++) {
    int left = 0;
    int right = 0;
    for (int z = 0; z < i; z++) {
      left += nums[z];
    }
    for (int b = nums.length-1; b >= i; b--) {
      right += nums[b];
    }
    if (left == right && left != 0) {
      canBalance = true;
      break;
    }
  }
  return canBalance;
}
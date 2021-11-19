// https://codingbat.com/prob/p159339

public int[] fix34(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 3) {
      int temp = nums[i+1];
      nums[i+1] = 4;
      boolean found = false;
      for (int z = i+2; z < nums.length; z++) {
        if(nums[z] == 4) {
          nums[z] = temp;
          found = true;
          break;
        }
      }
      if (found == false) {
        for (int z = i; z > 0; z--) {
          if(nums[z] == 4 && nums[z-1] != 3) {
            nums[z] = temp;
            found = true;
            break;
          }
        }
      }
    }
  }
  return nums;
}

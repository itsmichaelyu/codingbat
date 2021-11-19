// https://codingbat.com/prob/p125819

public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      int temp = nums[i+1];
      nums[i+1] = 5;
      boolean found = temp == 5 ? true : false;
      if (found == false){
        for (int z = i+2; z < nums.length; z++) {
          if(nums[z] == 5) {
            nums[z] = temp;
            found = true;
            break;
          }
        }
      }
      if (found == false) {
        for (int z = i; z > 0; z--) {
          if(nums[z] == 5 && nums[z-1] != 4) {
            nums[z] = temp;
            found = true;
            break;
          }
        }
        if (found == false) nums[0] = temp;
      }
    }
  }
  return nums;
}

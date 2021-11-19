// https://codingbat.com/prob/p196409

public int maxMirror(int[] nums) {
  int temp = 0;
  int max = 0;
  int[] rev = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    rev[nums.length-1-i] = nums[i];
  }
  for (int i = 0; i < nums.length; i++) {
    for (int z = 0; z < nums.length-i; z++) {
      if (nums[z] == rev[z+i]) {
        temp++;
      } 
      else {
        max = temp > max ? temp : max;
        temp = 0;
      }
    }
    max = temp > max ? temp : max;
    temp = 0;
    for (int z = 0; z < nums.length-i; z++) {
      if (nums[z+i] == rev[z]) {
        temp++;
      } 
      else {
        max = temp > max ? temp : max;
        temp = 0;
      }
    }
    max = temp > max ? temp : max;
    temp = 0;
  }
  max = temp > max ? temp : max;
  return max;
}

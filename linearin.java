// https://codingbat.com/prob/p134022

public boolean linearIn(int[] outer, int[] inner) {
  int counter = 0;
  for (int i = 1; i < outer.length; i++) {
    outer[i-1] = outer[i] == outer[i-1] ? 9999 : outer[i-1]; 
  } 
  for (int i : outer) {
    for (int z : inner) {
      if (i == z) {
        counter++;
      }
    }
  }
  return counter >= inner.length;
}

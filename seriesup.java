// https://codingbat.com/prob/p104090

public int[] seriesUp(int n) {
  int[] a = new int[n * (n+1)/2];
  int counter = 0;
  for (int i = 0; i < n; i++) {
    for (int z = 0; z <= i; z++) {
      a[counter] = z+1;
      counter++;
    }
  }
  return a;
}
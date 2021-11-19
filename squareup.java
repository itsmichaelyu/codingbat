// https://codingbat.com/prob/p155405

public int[] squareUp(int n) {
  int[] a = new int[n*n];
  for (int i = 0; i < n; i++)
    for (int z = n; z >=n-i; z--)
      for (int b = 0; b < n; b++) 
        if (z % n == b) a[i*n+z-1]= n - z + 1;
  return a;
}
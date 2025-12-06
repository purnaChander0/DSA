package src.Recursion;

import java.util.Arrays;

public class InsSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1 };
    int[] sorted = sort(arr);
    System.out.println(Arrays.toString(sorted));
  }

  static int[] sort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int start = 0;
    int end = arr.length;
    int mid = start + (end - start) / 2;
    int[] right = sort(Arrays.copyOfRange(arr, start, mid));
    int[] left = sort(Arrays.copyOfRange(arr, mid, end));
    return merge(right, left);
  }

  private static int[] merge(int[] right, int[] left) {

    int f = 0;
    int s = 0;
    int k = 0;

    int[] merged = new int[right.length + left.length];
    while (f < right.length && s < left.length) {
      if (right[f] <= left[s]) {
        merged[k] = right[f];
        f++;
      } else {
        merged[k] = left[s];
        s++;
      }
      k++;
    }

    while (f < right.length) {
      merged[k] = right[f];
      f++;
      k++;
    }
    while (s < left.length) {

      merged[k] = left[s];
      s++;
      k++;
    }

    return merged;

  }

}

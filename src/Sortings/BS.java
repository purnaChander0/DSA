package src.Sortings;

import java.util.Arrays;

public class BS {
          public static void main(String[] args) {
                    int[] arr = { 3, 1, -22 }; // Try this!

                    sort(arr);
                    System.out.println(Arrays.toString(arr));
          }

          static void sort(int[] arr) {
                    for (int i = 0; i < arr.length; i++) {
                              for (int j = 1; j <= arr.length - i - 1; j++) {
                                        if (arr[j - 1] > arr[j]) {
                                                  swap(arr, j - 1, j);
                                        }

                              }

                    }
          }

          static void swap(int[] arr, int first, int second) {
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
          }
}

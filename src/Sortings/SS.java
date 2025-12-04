package src.Sortings;

import java.util.Arrays;

public class SS {

          public static void main(String[] args) {
                    int[] arr = { 5, 3, 12, 6, 75 };
                    sort(arr);
                    System.out.println(Arrays.toString(arr));
          }

          static void sort(int[] arr) {

                    for (int i = 0; i < arr.length; i++) {
                              int lastIndex = arr.length - 1 - i;
                              int maxElementIndex = fndmax(arr, lastIndex);
                              swap(arr, lastIndex, maxElementIndex);

                    }
          }

          static int fndmax(int[] arr, int end) {
                    int max = 0;
                    for (int i = 1; i <= end; i++) {
                              if (arr[i] > arr[max]) {
                                        max = i;
                              }
                    }
                    return max;
          }

          static void swap(int[] arr, int first, int second) {
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
          }

}

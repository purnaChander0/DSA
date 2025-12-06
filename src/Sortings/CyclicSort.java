package src.Sortings;

public class CyclicSort {
          public static void main(String[] args) {
                    int[] arr = { 3, 0, 1 };
                    // sort(arr);
                    // System.out.println(Arrays.toString(arr));
                    System.out.println(MissingNumber(arr));
          }

          static void sort(int[] arr) {
                    int i = 0;
                    while (i < arr.length) {
                              int correct = arr[i] - 1;
                              if (arr[i] != arr[correct]) {
                                        swap(arr, i, correct);
                              } else {
                                        i++;
                              }
                    }
          }

          static void swap(int[] arr, int first, int second) {
                    int temp = arr[first];
                    arr[first] = arr[second];
                    arr[second] = temp;
          }

          static int MissingNumber(int[] arr) {
                    int i = 0;
                    while (i < arr.length) {
                              int correct = arr[i];
                              if (correct >= 0 && correct < arr.length && arr[i] != arr[correct]) {
                                        swap(arr, i, correct);
                              } else {
                                        i++;
                              }

                    }
                    for (i = 0; i < arr.length; i++) {
                              if (arr[i] != i) {
                                        return i;
                              }
                    }
                    return arr.length - 1;
          }
}

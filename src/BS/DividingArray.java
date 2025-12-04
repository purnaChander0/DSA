package src.BS;

public class DividingArray {
          public static void main(String[] args) {
                    int[] arr = { 7, 2, 5, 8, 10 };
                    int m = 2;
                    int ans = divide(arr, m);
                    System.out.println(ans);
          }

          static int divide(int[] arr, int m) {

                    int start = findMax(arr);

                    int end = findSum(arr);
                    while (start < end) {
                              int pieces = 1;
                              int sum = 0;
                              int mid = start + (end - start) / 2;
                              for (int item : arr) {
                                        if (sum + item > mid) {
                                                  pieces++;
                                                  sum = item;
                                        } else {
                                                  sum += item;
                                        }
                              }

                              if (pieces <= m) {
                                        end = mid;
                              } else {
                                        start = mid + 1;
                              }
                    }
                    return start;
          }

          static int findSum(int[] arr) {
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                              sum += arr[i];
                    }
                    return sum;
          }

          static int findMax(int[] arr) {
                    int max = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                              if (arr[i] > max) {
                                        max = arr[i];
                              }
                    }
                    return max;
          }
}

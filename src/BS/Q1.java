package src.BS;

public class Q1 {
          public static void main(String[] args) {
                    int[] arr = { 1, 2, 3, 4, 5, 6 };
                    int target = 11;
                    int ans = search(arr, target);
                    System.out.println(ans);
          }

          static int search(int[] arr, int target) {
                    if (arr == null) {
                              return -1;
                    }
                    int start = 0;
                    int end = arr.length - 1;

                    while (start <= end) {

                              int mid = start + (end - start) / 2;

                              if (arr[mid] == target) {
                                        return mid;
                              } else if (arr[mid] > target) {
                                        end = mid - 1;
                              } else {
                                        start = mid + 1;
                              }

                    }
                    return -1;
          }

}

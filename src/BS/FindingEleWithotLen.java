package src.BS;

public class FindingEleWithotLen {
          public static void main(String[] args) {
                    int[] arr = { 1, 2, 3, 4, 5 };
                    int target = 1;
                    int ans = Bs(arr, target);
                    System.out.println(ans);
          }

          static int Bs(int[] arr, int target) {

                    int start = 0;
                    int end = 1;
                    while (arr[end] < target) {
                              int temp = end;
                              end = (end - start + 1) * 2;
                              start = temp + 1;
                    }
                    return Search(start, end, target, arr);
          }

          static int Search(int start, int end, int target, int[] arrr) {
                    while (start <= end) {
                              int mid = start + (end - start) / 2;
                              if (arrr[mid] == target) {
                                        return mid;
                              } else if (arrr[mid] > target) {
                                        end = mid - 1;
                              } else {
                                        start = mid + 1;
                              }
                    }
                    return -1;
          }
}

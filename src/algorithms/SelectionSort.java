public class SelectionSort {
public static int[] sort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int minIdx = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[minIdx]) minIdx = j;
}
int temp = arr[minIdx];
arr[minIdx] = arr[i];
arr[i] = temp;
}
return arr;
}
public static void main(String[] args) {
int[] arr = {64, 25, 12, 22, 11};
System.out.println("Before sorting:");
for (int num : arr) System.out.print(num + " ");
sort(arr);
System.out.println("\nAfter sorting:");
for (int num : arr) System.out.print(num + " ");
}
}
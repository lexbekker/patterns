package ru.bekker.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 22};
        int index = runBinarySearchIteratively(arr, 9);
        System.out.println(index);

    }

    public int runBinarySearchRecursively() {
        return 0;
    }

    public static int runBinarySearchIteratively(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length;
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

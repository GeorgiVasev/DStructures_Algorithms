package com.Vasev;

public class SortAlgorithms {

    // Bubble sort
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }

    }

    // Linear search
    static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Binary search
    static int binarySearch(int[] array, int beg, int end, int x) {

        if (end >= beg) {
            int mid = (end + beg) / 2;
            if (array[mid] < x) {
                return binarySearch(array, mid + 1, end, x);
            } else if (array[mid] > x) {
                return binarySearch(array, beg, mid - 1, x);
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Selection sort
    static void selectionSort(int[] array) {

        for (int x = 0; x < array.length; x++) {
            int min = x;
            for (int y = x; y < array.length; y++) {
                if (array[min] > array[y]) {
                    min = y;
                }
            }
            swap(array, x, min);
        }

    }
    // Insertion sort

    static void insertionSort(int[] array) {

        for (int k = 1; k < array.length; k++) {
            int current = array[k];
            int j = k - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }

    }

    // Shell sort
    static void shellSort(int[] arr, int num) {
        int i, j, k, tmp;
        for (i = num / 2; i > 0; i = i / 2) {
            for (j = i; j < num; j++) {
                for (k = j - i; k >= 0; k = k - i) {
                    if (arr[k + i] >= arr[k])
                        break;
                    else {
                        tmp = arr[k];
                        arr[k] = arr[k + i];
                        arr[k + i] = tmp;
                    }
                }
            }
        }
    }

    // Merge sort
    static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    static void merge(int[] array, int left, int mid, int right) {
        // calculating lengths
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // creating temporary subarrays
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    // Quick sort
    static void quickSort(int[] array, int beg, int end) {
        if (end <= beg) return;
        int pivot = partition(array, beg, end);
        quickSort(array, beg, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    static int partition(int[] array, int beg, int end) {
        int pivot = end;

        int counter = beg;
        for (int i = beg; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        swap(array,pivot,counter);

        return counter;

    }

    // Swap method
    static void swap(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}

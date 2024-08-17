package testapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Soluation {
    // merg sort 
    public void mergSort(int[] inputArray){
        
       int  inputLength = inputArray.length;
       
       if(inputLength <2)
           return;
       
       int midIndex = inputLength/2;
       int [] leftArray = new int[midIndex];
       int [] rightArray = new int[inputLength - midIndex];

        for(int index = 0 ; index < midIndex ; index++){
          leftArray[index] = inputArray[index];
        }
         for(int index = midIndex ; index < inputLength ; index++){
          rightArray[index - midIndex] = inputArray[index];
        }
        mergSort(leftArray);
        mergSort(rightArray);
        merg(leftArray, rightArray, inputArray);
    }
    
    public void merg(int[] leftArray,int[] rightArray,int[] inputArray){
    
    int leftSize = leftArray.length;
    int rightSize = rightArray.length;
    int leftIndex = 0 , rightIndex = 0 ,inputIndex = 0;
        while( leftIndex < leftSize && rightIndex < rightSize ){

            if(leftArray[leftIndex] < rightArray[rightIndex]){
              inputArray[inputIndex] = leftArray[leftIndex];
              leftIndex++;
            }else{
               inputArray[inputIndex] = rightArray[rightIndex];
               rightIndex++;
             }
          inputIndex++;
         }
        while(leftIndex < leftSize){
        inputArray[inputIndex] = leftArray[leftIndex];
        leftIndex++;
        inputIndex++;        
        }
        while(rightIndex < rightSize){
        inputArray[inputIndex] = rightArray[rightIndex];
        rightIndex++;
        inputIndex++;        
        }
      
    }    ////////////////////////////////////////////////////////////////////////////
       // quick sort with recursion
    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivot = arr[highIndex];
        int rightPointer = highIndex;
        int leftPinter = lowIndex;

        while (leftPinter < rightPointer) {

            while (arr[leftPinter] <= pivot && leftPinter < rightPointer) {
                leftPinter++;
            }

            while (arr[rightPointer] >= pivot && leftPinter < rightPointer) {
                rightPointer--;
            }

            swap(arr, leftPinter, rightPointer);

        }

        swap(arr, leftPinter, highIndex);

        quickSort(arr, lowIndex, leftPinter - 1);
        quickSort(arr, leftPinter + 1, highIndex);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    ///////////////////////////////////////////////////////////////////////////
    // print int array
    void printArray(int[] arr1) {

        for (int index = 0; index <= arr1.length - 1; index++) {
            System.out.println("Results = " + arr1[index]);
        }
    }
    ///////////////////////////////////////////////////////////////////////////

    //Pascal's triangle.
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowArray = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> colArray = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    // Every Column's First and Last Element are filled with 1
                    colArray.add(1);
                } else {
                    // Addition of previous Row's First two elements then second two elements , and so on 
                    colArray.add(j, rowArray.get(i - 1).get(j - 1) + rowArray.get(i - 1).get(j));
                }
            }

            rowArray.add(colArray);
        }
        return rowArray;
    }

    //////////////////////////////////////////////////////////////////////////////
    // دمج ارقام وجمعها
    long sumNmuber(int[] a) {
        long sum = 0;
        long temp;
        int theDigit;
        int multiNumber = 10;
        int counter = 0;
        for (int index = 0; index < a.length; index++) {
            theDigit = a[index];
            for (int index2 = 0; index2 < a.length; index2++) {

                while (theDigit > 0) {

                    theDigit = theDigit / 10;
                    counter++;
                }

                for (int index3 = 0; index3 < counter - 1; index3++) {
                    multiNumber = (multiNumber * 10);
                }
                counter = 0;
                temp = (a[index2] * multiNumber) + a[index];
                sum += temp;
                // multiNumber = 10 ;
            }
            multiNumber = 10;
        }
        return sum;
    }
    ///////////////////////////////////////////////////////////////////////////

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if (matrix.length == 0) {
            return ans;
        }

        int m = matrix.length, n = matrix[0].length;
        boolean[][] seen = new boolean[m][n];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int x = 0, y = 0, di = 0;

        // Iterate from 0 to R * C - 1
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[x][y]);
            seen[x][y] = true;
            int cr = x + dr[di];
            int cc = y + dc[di];

            if (0 <= cr && cr < m && 0 <= cc && cc < n
                    && !seen[cr][cc]) {
                x = cr;
                y = cc;
            } else {
                di = (di + 1) % 4;
                x += dr[di];
                y += dc[di];
            }
        }
        return ans;
    }

    ///////////////////////////////////////////////////////////////////////////
    int[] solution2222(int[] a) {
        int[] newArray = new int[a.length];
        int arraylength = a.length - 1;
        int sum;
        for (int index = 0; index <= arraylength; index++) {
            if ((index - 1) >= 0 && (index + 1) <= arraylength) {
                sum = a[index - 1] + a[index] + a[index + 1];
                newArray[index] = sum;
            } else if ((index - 1) < 0 || (index + 1) < (a.length - 1)) {
                sum = 0 + a[index] + a[index + 1];
                newArray[index] = sum;
            } else if (a[index + 1] > (a.length - 1)) {
                sum = a[index - 1] + a[index] + 0;
                newArray[index] = sum;
            }

        }
        return newArray;
    }

    ///////////////////////////////////////////////////////////////////////////
    public int[] plusOne(int[] digits) {

        int length = digits.length;

        for (int index = length - 1; index >= 0; index--) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }

        int[] newArray = new int[length + 1];
        newArray[0] = 1;
        return newArray;

    }
    ///////////////////////////////////////////////////////////////////////////

    /*
    Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

 

Example 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
     */
    public int pivotIndex(int[] nums) {
        int pivotIndex = -1;
        int sumBefore = 0;
        int sumAfter = 0;
        int totalSum = 0;
        int pointer;
        for (int index = 0; index < nums.length; index++) {
            totalSum += nums[index];
        }
        for (int index = 0; index < nums.length; index++) {
            pointer = index;
            if (index != 0) {
                sumBefore = sumBefore + nums[--pointer];
            }
            sumAfter = totalSum - sumBefore - nums[index];

            if (sumBefore == sumAfter) {
                pivotIndex = index;
                return pivotIndex;
            }

        }
        return pivotIndex;
    }

    ///////////////////////////////////////////////////////////////////////////

    /*
      Find All Numbers Disappeared in an Array

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        int[] tempZero = new int[nums.length + 1];
        int current;
        for (int index = 0; index < tempZero.length; index++) {
            tempZero[index] = 0;
        }
        int counter = 0;
        for (int index = 1; index < tempZero.length; index++) {
            current = nums[counter];
            tempZero[current]++;
            counter++;
        }

        for (int index = 1; index < tempZero.length; index++) {

            if (tempZero[index] == 0) {
                missing.add(index);
            }
        }

        return missing;
    }

    ///////////////////////////////////////////////////////////////////////////

    /*  Third Maximum Number
      Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
    Input: nums = [3,2,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2.
    The third distinct maximum is 1. */
    public int thirdMax1(int[] nums) {
        boolean isDone = true;
        int[] orderedArr = nums.clone();
        int length = nums.length;
        int indexOfOdreredArr = 0;

        int min;
        int first;
        int second;
        int Theird;
        // order arr
        while (isDone) {
            isDone = false;
            for (int index = 0; index < orderedArr.length - 1; index++) {
                if (orderedArr[index] < orderedArr[index + 1]) {
                    min = orderedArr[index];
                    orderedArr[index] = orderedArr[index + 1];
                    orderedArr[index + 1] = min;
                    isDone = true;
                }

            }

        }

        ///////////////////////////////////////////////////////////////////////////
        // move dublicate element to end
        int slowPointer = 0;
        for (int index = 1; index < orderedArr.length; index++) {
            if (orderedArr[slowPointer] != orderedArr[index]) {
                orderedArr[++slowPointer] = orderedArr[index];
            }

        }
        // add noDoplucation elements to array to fit size
        int[] noDoplucation = new int[slowPointer + 1];
        for (int index = 0; index < noDoplucation.length; index++) {
            noDoplucation[index] = orderedArr[index];
        }
        // check
        if (noDoplucation.length < 3) {
            return first = noDoplucation[0];
        } else {
            return Theird = noDoplucation[2];
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    public int thirdMax(int[] nums) {

        double max = nums[0];
        double second = Double.NEGATIVE_INFINITY;
        double third = Double.NEGATIVE_INFINITY;

        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            if (number > max) {
                third = second;
                second = max;
                max = (double) number;
            } else if (number > second && number < max) {
                third = second;
                second = (double) number;
            } else if (number > third && number < second) {
                third = (double) number;
            }
        }

        if (third == Double.NEGATIVE_INFINITY) {
            return (int) max;
        } else {
            return (int) third;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //ايجاد العناصر المختلفة بعد الترتيب والمقارنة مع العناصر القديمة
    public int heightChecker(int[] heights) {
        boolean isDone = true;
        int tempSmallNumber;
        int indicators = 0;
        int[] expected = heights.clone();

        while (isDone) {
            isDone = false;
            for (int index = 0; index < expected.length - 1; index++) {
                if (expected[index] > expected[index + 1]) {
                    tempSmallNumber = expected[index];
                    expected[index] = expected[index + 1];
                    expected[index + 1] = tempSmallNumber;
                    isDone = true;
                }

            }
        }

        for (int index = 0; index < heights.length; index++) {
            if (heights[index] != expected[index]) {
                indicators++;
            }
        }
        return indicators;
    }

    ///////////////////////////////////////////////////////////////////////////
    public int[] sortArrayByParity(int[] nums) {
        int slowPointer = 0;
        int tempEvenNumber;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {

            if (nums[fastPointer] % 2 == 0) {
                tempEvenNumber = nums[fastPointer];
                nums[fastPointer] = nums[slowPointer];
                nums[slowPointer] = tempEvenNumber;

                slowPointer++;
            }

        }
        return nums;

    }

    ///////////////////////////////////////////////////////////////////////////
    // مضاعفة كل عنصر والبحث عن العنصر المشاب اله 
    public boolean checkIfExist(int[] arr) {
        int resultMul;
        for (int slowPoiinter = 0; slowPoiinter < arr.length - 1; slowPoiinter++) {
            for (int fastPointer = 0; fastPointer < arr.length - 1; fastPointer++) {
                resultMul = 2 * arr[slowPoiinter];
                if (arr[fastPointer] == resultMul && slowPoiinter != fastPointer) {
                    return true;
                }
            }

        }
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        int slowPointer = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[slowPointer] != nums[index]) {
                nums[++slowPointer] = nums[index];

            }
        }
        return slowPointer + 1;

    }

    ///////////////////////////////////////////////////////////////////////////
    public void mergeAndBubbleSort(int[] nums1, int m, int[] nums2, int n) {
        int sizeOfTwoArr;
        boolean isSwapDone = true;
        sizeOfTwoArr = m + n;
        for (int index = 0; index < nums2.length; index++) {
            nums1[sizeOfTwoArr - 1] = nums2[n - 1];
            sizeOfTwoArr--;
            n--;

        }
        // bubble sort which sort two pairs until done 
        while (isSwapDone) {
            isSwapDone = false;
            for (int index2 = 0; index2 < nums1.length - 1; index2++) {
                int temp = nums1[index2];
                if (nums1[index2] > nums1[index2 + 1]) {
                    isSwapDone = true;
                    nums1[index2] = nums1[index2 + 1];
                    nums1[index2 + 1] = temp;

                }
            }
        }
        for (int j = 0; j < nums1.length; j++) {
            // System.out.println(nums1[j]);

        }
    }
    ///////////////////////////////////////////////////////////////////////////

    public void removeElementAtFirst(int[] array) {

        for (int index = 1; index < array.length; index++) {

            array[index - 1] = array[index];
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

    }

    ///////////////////////////////////////////////////////////////////////////
    boolean[] solution1(int[] numbers, int left, int right) {
        float x;
        int length = numbers.length;
        boolean[] booleanArr3 = new boolean[length];

        for (int index = 0; index < numbers.length; index++) {

            x = (float) numbers[index] / (float) (index + 1);

            if (left <= x && x <= right && (x == (int) x)) {
                booleanArr3[index] = true;
            } else {
                booleanArr3[index] = false;

            }
        }
        return booleanArr3;
    }
    ///////////////////////////////////////////////////////////////////////////

    public void deleteElementAt(int[] array, int pointer) {

        for (int index = 0; index < 3; index++) {
            array[pointer] = array[pointer + 1];
            pointer++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    public int[] replaceElements(int[] arr) {
        int bigestRight = -1;
        for (int index = arr.length - 1; index > 1; index--) {

            if (bigestRight > arr[index]) {
                arr[index - 1] = bigestRight;
            } else {
                arr[index - 1] = arr[index];
                bigestRight = arr[index - 1];
            }

        }
        arr[arr.length - 1] = -1;

        return arr;
    }

}

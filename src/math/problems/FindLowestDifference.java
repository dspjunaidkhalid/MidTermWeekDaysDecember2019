package math.problems;

public class FindLowestDifference {

        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
    //int [] array1 = {30,12,5,9,2,20,33,1};
    // int [] array2 = {18,25,41,47,17,36,14,19};


    // Returns minimum difference between any pair
    static int findMinDiff(int[] arr, int n) {
        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Math.abs((arr[i] - arr[j])) < diff)
                    diff = Math.abs((arr[i] - arr[j]));

        // Return min diff
        return diff;
    }

    // Driver method to test the above function
    public static void main(String[] args) {
        int arr[] = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        System.out.println("Minimum difference is " +
                findMinDiff(arr, arr.length));



    }

    }
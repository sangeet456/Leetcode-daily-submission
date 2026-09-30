class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int swapCandidate = findSwapCandidate(nums, pivot);
        swap(nums, pivot, swapCandidate);
        reverse(nums, pivot + 1, nums.length - 1);
    }

    private int findPivot(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    private int findSwapCandidate(int[] nums, int pivot) {
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                return i;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
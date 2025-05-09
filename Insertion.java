public class Insertionindex {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }

        return low; 
    }

    public static void main(String[] args) {
        Insertionindex obj = new Insertionindex();
        int[] nums = {1, 2, 4, 5};
        int val = 3;

        int index = obj.searchInsert(nums, val);
        System.out.println("Target should be inserted at index: " + index);
    }
}

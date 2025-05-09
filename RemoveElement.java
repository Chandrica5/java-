public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to place the next non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = obj.removeElement(nums, val);

        
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

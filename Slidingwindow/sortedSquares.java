import java.util.Arrays;

class SquareSorter {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int index = nums.length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                nums[index--] = leftSquare;
                left++;
            } else {
                nums[index--] = rightSquare;
                right--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        SquareSorter sorter = new SquareSorter();
        int[] nums = {-5, -2, 0, 1, 4};

        sorter.sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(nums));
    }
}

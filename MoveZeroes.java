import java.util.*;

class ArrayUtils {

    public static void moves(int nums[]) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }
}

public class MoveZeroes {

    public static void main(String args[]) {

        int nums[] = {2, 3, 0, 0, 6, 7};

        ArrayUtils.moves(nums);

        for (int num : nums) {
            System.out.println(num + " ");
        }
    }
}
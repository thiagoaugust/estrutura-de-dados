import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        twoSum(new int[]{2, 7, 11, 15}, 9); //[0,1]
        twoSum(new int[]{3,2,4}, 6); //[1,2]
        twoSum(new int[]{3,3}, 6); //[0,1]

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(mapSum.get(nums[i]) != null){
                System.out.println("[" + mapSum.get(nums[i]) +"," + i + "]");
                return new int[]{mapSum.get(nums[i]), i};
            }
            mapSum.put(target - nums[i], i);
        }

        return new int[2];
    }
}

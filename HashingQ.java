
import java.util.*;

class HashingQ {
  // finding majority element given an array of integers in which we have to find element which appears greater than n/3 times

    static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(int Key:map.keySet())
{
  if(map.get(Key)>n/3){
    System.out.println(Key);
  }
}
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 1, 1, 2, 3};
        majorityElement(nums);

    }
}

import java.util.*;
//majority element
// given an integer array of size n, find all elements that appear more than n/3 times

class HashingQ {
  static void majorityElement(int[]nums){
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = nums.length;
    for(int i = 0; i<n;i++){
      // if key exists then updates the frequency value
      if(map.containsKey(nums[i])){
        map.put(nums[i],map.get(nums[i])+1);
      }
      // new pair else
      else{
        map.put(nums[i],1);
      }

    }
    for(int key : map.keySet()){
      if(map.get(key)>n/3){
        System.out.println(key);
      }
    }
  }
  public static void main(String[] args) {
    int nums[]= {1,3};
    majorityElement(nums);
  }
  
}

import java.util.*;
class HashingQ{
  // intersection of two arrays having unique values in new set
  static int intersection(int[]nums1,int[]nums2){
    HashSet<Integer> set = new HashSet<>();
    int count=0;
    for(int i =0;i<nums1.length;i++){
      set.add(nums1[i]);

    }
    for(int j  = 0;j<nums2.length;j++){
      if(set.contains(nums2[j]))
      {
        count++;
        set.remove(nums2[j]);

      }
    }
    return count;

  }

  public static void main(String[] args) {
    int []nums1 ={1,2,3};
    int[]nums2 = {4,5,6,1,2};
    System.out.println(intersection(nums1, nums2));
  }
}
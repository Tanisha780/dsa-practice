import java.util.*;
class HashingQ{
  // union of two arrays having unique values in new set
  static int union(int[]nums1,int[]nums2){
    HashSet<Integer>set = new HashSet<>();
    for(int i =0;i<nums1.length;i++){
      set.add(nums1[i]);
    }
    for(int  j= 0;j<nums2.length;j++){
      set.add(nums2[j]);
    }
    return set.size();

  }

  public static void main(String[] args) {
    int []nums1 ={1,2,3};
    int[]nums2 = {4,5,6,1};
    System.out.println(union(nums1, nums2));
  }
}
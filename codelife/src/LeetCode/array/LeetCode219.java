package LeetCode.array;

import java.util.HashSet;

public class LeetCode219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        int index=0;
//        int target=0;
//        int num=0;
//        for (int i = 0; i <nums.length ; i++) {
//            target=nums[i];
//            for (int j = i+1; j <nums.length ; j++) {
//                num=nums[j];
//                index=j-i;
//                if(num == target&&index<=k)
//                    return true;
//            }
//        }
//        return false;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i <nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5,2 };
       System.out.println(LeetCode219.containsNearbyDuplicate(nums,2));

        }
    }


package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public class Intersection_of_Two_Arrays
{
    //Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
    //Each element in the result must be unique.
    //The result can be in any order.
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        //Add all elements to set from array 1
        for(int i =0; i< nums1.length; i++)
            set.add(nums1[i]);
        for(int j = 0; j < nums2.length; j++) {
            // If present in array 2 then add to res and remove from set
            if(set.contains(nums2[j])) {
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        // Convert ArrayList to array
        int[] arr = new int[res.size()];
        for (int i= 0; i < res.size(); i++)
            arr[i] = res.get(i);
        return arr;
    }
}

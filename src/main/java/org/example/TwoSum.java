package org.example;

import java.util.HashMap;
import java.util.Map;


//leetcode#98
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int[] result=new int[2];
        for(int i:nums){
            if(m.get(target-nums[i])!=null){
                result[0]=i;
                result[1]=m.get(target-nums[i]);
            }else{
                m.put(target-nums[i],i);
            }
        }
        return result;
    }
}

package org.example;

import java.util.HashSet;
import java.util.Set;

//leetcode#3
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        int start=0;
        int end=0;

        Set seenChars= new HashSet();
        while(end<s.length()){
            if(!seenChars.contains(s.charAt(end))){
                seenChars.add(s.charAt(end));
                end++;
            }else{
                seenChars.remove(s.charAt(start));
                start++;
            }
            max=Math.max(max,end-start);
        }

        return max;
    }
}

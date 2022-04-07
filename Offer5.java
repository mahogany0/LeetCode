package com.my.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Offer5 {
    public static void main(String[] args) {
        Offer5 test=new Offer5();
        String[]str={"abcw","baz","foo","bar","xtfn","abcdef"};
        test.maxProduct(str);
    }
    public int maxProduct(String[] words) {
        int maxans=0;

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            int t=0; int m=words[i].length();
            for(int j=0;j<m;j++){
                t=t|(1<<(words[i].charAt(j)-'a'));
            }
            if(!map.containsKey(t)||map.get(t)<m){
                map.put(t,m);
            }
        }
        for(int a:map.keySet()){
            for(int b : map.keySet()){
                if((a&b)==0){
                    maxans=Math.max(maxans,map.get(a)*map.get(b));
                }
            }
        }
        return maxans;
    }
}

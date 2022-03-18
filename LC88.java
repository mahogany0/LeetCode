package com.my.LeetCode;

public class LC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n-1;
        m--;
        n--;

        while(n>=0){
            if(m>=0&&nums1[m]>nums2[n]){
                nums1[l--]=nums1[m--];
            }else{
                nums1[l--]=nums2[n--];
            }
        }
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n){
        int storted[]=new int[m+n];
        int p=0;
        int q=0;
        int l=0;
        while(p<m||q<n){
            if(p>=m){
                storted[l++]=nums2[q++];continue;
            }
            if(q>=n) {
                storted[l++]=nums1[p++];
                continue;
            }
            if(nums1[p]>nums2[q]) {storted[l++]=nums2[q++];continue;}
            if(nums1[p]<=nums2[q]){storted[l++]=nums1[p++];continue;}
        }
        nums1=storted;
    }
    public static void main(String[] args){
        LC88 ex=new LC88();
        int[] nums1={1,2,5,0,0,0};
        int[] nums2={4,5,6};
        ex.merge2(nums1,3,nums2,3);

    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int hi = nums.length-1;
        if(hi==1){
          return (nums[0]>nums[1])? 0:1;
        }
        int lo =0;
        int index =0;
        while(lo<=hi){
          int mid = (lo + hi)/2;
          boolean flag=false,flag1=false,f=true,g=true;
          if(mid==0) flag =true;
          if(mid==nums.length-1) flag1=true;
          if(!flag){
             f = nums[mid]>nums[mid-1];
          }
          if(!flag1){
            g = nums[mid]>nums[mid+1];
          } 
          if((flag || f) && (flag1 || g))
          {index=mid;break;}
          else if(!f) hi = mid-1;
          else lo = mid+1;
        }
        return index;
    }
}
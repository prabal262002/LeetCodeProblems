class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int p=-1;
        for(int i=1;i<n;i++){
            if(p==-1 && arr[i]==arr[i-1]) p = i-1;
            if(p!=-1 && arr[i]!=arr[i-1]) arr[++p] = arr[i];
        }
        System.out.println(p);
        return p==-1?n:p+1;
    }
}
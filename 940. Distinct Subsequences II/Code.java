class Solution {
    public int distinctSubseqII(String s) {
        long mod = (int)1000000007;
        HashMap<Character,Long> m = new HashMap<>();
        long ans = 1;
        for(int i=0;i<s.length();i++){
            long siff=0;
            char c = s.charAt(i);
            if(m.containsKey(c)) siff = m.get(c)%mod;
            m.put(c,ans%mod);
            ans=((2*ans)-siff%mod+mod)%mod;
        }
        return ans==0?(int)(mod-1):(int)(ans-1);
    }
}
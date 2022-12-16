class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int f[]=new int[26];
        int m=-1;
        for(int i=0; i<s.length(); i++){
            if(f[s.charAt(i)-'a']>0){
                m=Math.max(m,i-f[s.charAt(i)-'a']);
            }else{
                f[s.charAt(i)-'a']=i+1;
            }
        }
        return m;
    }
}
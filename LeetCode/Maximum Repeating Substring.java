class Solution {
    public int maxRepeating(String seq, String word) {
        int ans=0;
        String x=word;
        while(seq.contains(word)){
            ans++;
            word=word+x;
        }
        return ans;
    }
}
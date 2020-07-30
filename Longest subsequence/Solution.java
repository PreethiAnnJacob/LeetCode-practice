/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ls=0;
        int i=0;
        while(i+ls+1<=s.length()){
            int rep=0;
            String sub=s.substring(i,i+ls+1);
            for(int j=sub.length()-1;j>=0;j--){
                int k;
                for(k=j-1;k>=0;k--){
                    if(sub.charAt(j)==sub.charAt(k)){
                        rep=1;
                        break;
                    }
                }
                if(rep==1){  i++;break;}
            }
            if(rep==0)  ls++;
        }
        return ls;
    }
}
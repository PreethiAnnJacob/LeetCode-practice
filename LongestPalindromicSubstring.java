/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        int l=0,r=0;
        for(int i=0;i<=s.length()-(r-l+1);i++)
            for(int j=i+(r-l+1);j<=s.length();j++){
                int k,m;
                for(k=i,m=j-1;k<m;k++,m--){
                    if(s.charAt(k)!=s.charAt(m))
                        break;
                }
                if(k>=m){
                    l=i;r=j;
                }
            }
        return s.substring(l,r);
    }
}

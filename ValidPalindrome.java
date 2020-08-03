/*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 

Constraints:

s consists only of printable ASCII characters.*/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=-1,j=s.length();
        while(true){
            while(i<=s.length()-2 && !Character.isLetterOrDigit(s.charAt(++i)));
            while(j>=1 && !Character.isLetterOrDigit(s.charAt(--j)));
            if(i>=j || i<0 || j>=s.length()) break;
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}

class Solution {
    public String breakPalindrome(String palindrome) {
        int n= palindrome.length();
        if (n == 1) return ""; 
        char[] chars = palindrome.toCharArray();//we can also use string builder
        for(int i=0;i<n/2;i++){
            if(chars[i]!= 'a'){
                chars[i]= 'a';
                return new String(chars);
            }
        }
        chars[n-1]='b'; //edge case aaaa
        return new String(chars);
    }
}
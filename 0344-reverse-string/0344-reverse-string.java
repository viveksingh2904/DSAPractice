class Solution {
    public void reverseHelper(char[] s){
        int start=0;
        int end=s.length-1;

        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    public void reverseString(char[] s) {
        reverseHelper(s);
    }
}
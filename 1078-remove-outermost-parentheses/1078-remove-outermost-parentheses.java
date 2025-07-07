class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result= new StringBuilder();
        int open=0;
        for(int i=0; i<s.length();i++){
            char c= s.charAt(i);

            if(c=='('){
                if(open>0){
                    result.append(c);
                }
                open++;
            } else{
                open--;
                if(open>0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
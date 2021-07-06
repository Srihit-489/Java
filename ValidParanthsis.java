class Solution {
    public boolean isValid(String s) {
        Stack<Character> history = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) =='{'){
                history.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(history.empty() ||  history.peek() != '('){
                     return false;
                }else{
                     history.pop();
                    
                }
            }else if(s.charAt(i) == ']'){
                if(history.empty()  || history.peek() != '['){
                    return false;
                }else{
                    history.pop();
                    
                }
            }else if( s.charAt(i) == '}'){
                if( history.empty() || history.peek() != '{'){
                    return false;
                }else{
                    history.pop();
                    
                }
            }
        }
        
        return history.empty();
    }
}

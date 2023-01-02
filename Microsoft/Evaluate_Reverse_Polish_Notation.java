class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for(String t:tokens){
            if("+-*/".contains(t))
                st.push(eval(st.pop(),st.pop(),t));
            else
                st.push(Integer.parseInt(t));    
        }
        return st.pop();
    }
    public int eval(int a,int b,String s){
        int ans = 0;
        if("+".equals(s))
            ans = a+b;
        else if("-".equals(s))    
            ans = b-a;
        else if("*".equals(s))    
            ans = a*b;
        else 
            ans = b/a;     

         return ans;      
    }
}
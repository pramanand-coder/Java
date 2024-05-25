import java.util.Stack;
public class PrefixEval{
    public static void main(String[] args){
        String infix="-9/*+5346";
        Stack<Integer> st=new Stack<>();
        int n=infix.length();
        for(int i=n-1;i>=0;i--){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int val1=st.pop();
                int val2=st.pop();
                if(ch=='+') st.push(val1+val2);
                else if(ch=='-') st.push(val1-val2);
                else if(ch=='*') st.push(val1*val2);
                else if(ch=='/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}
import java.util.Stack;
public class Prefix
{
    public static void main(String[] args){
        String infix="9-(5+3)*4/6";
        Stack<String> st=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String a=""+ch;
                st.push(a);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String val2=st.pop();
                    String val1=st.pop();
                    char o=op.pop();
                    st.push(o+val1+val2);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String val2=st.pop();
                    String val1=st.pop();
                    char o=op.pop();
                    st.push(o+val1+val2);
                    op.push(ch);
                }
                else{
                    if(op.peek()=='*' || op.peek()=='/'){
                    String val2=st.pop();
                    String val1=st.pop();
                    char o=op.pop();
                    st.push(o+val1+val2);
                    op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        while(st.size()>1){
        String val2=st.pop();
        String val1=st.pop();
        char o=op.pop();
        st.push(o+val1+val2);
        }
        System.out.println(st.peek());
    
    }
}
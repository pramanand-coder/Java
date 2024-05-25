import java.util.Stack;
public class PrefixToPost{
    public static void main(String args[]){
        String prefix="-9/*+5346";
        Stack<String> st=new Stack<>();
        int n=prefix.length();
        for(int i=n-1;i>=0;i--){
            char ch=prefix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String a=""+ch;
                st.push(a);
            }
            else{
                String val1=st.pop();
                String val2=st.pop();
                st.push(val1+val2+ch);
            }
        }
        System.out.println("Postfix:"+st.peek());
    }
}
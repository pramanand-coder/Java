import java.util.Stack;
public class PostfixToPref{
    public static void main(String args[]){
    String postfix="953+4*6/-";
    Stack<String> st=new Stack<>();
    int n=postfix.length();
    for(int i=0;i<n;i++){
        char ch=postfix.charAt(i);
        int ascii=(int)ch;
        if(ascii>=48 && ascii<=57){
            String a=""+ch;
            st.push(a);
        }
        else{
            String val2=st.pop();
            String val1=st.pop();
            st.push(ch+val1+val2);
        }
    }
        System.out.println("Pefix:"+st.pop());
    }
}
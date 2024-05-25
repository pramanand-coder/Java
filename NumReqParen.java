import java.util.*;
public class NumReqParen{
    public static int RequiredParen(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int req=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    req++;
                }
                else if(st.peek()=='('){
                    st.pop();
                }
                else
                 req++;
            }
        }
        if(st.size()>0){
            return req+st.size();
        }
        return req;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(RequiredParen(s));
    }
}
public class arrayImplementationOsStack{
    public static class Stack{
        private int[] arr=new int[10];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return ;
            }
            arr[idx]=x;
            idx++;
        }
       void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
       void pop(){
        if(idx==0){
            System.out.println("Stack is empty");
            return ;
        }
        int top=arr[idx-1];
        arr[idx-1]=0;
        idx--;
       }
       int peek(){
        if(idx==0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx-1];
       }
       boolean isFull(){
        if(idx==arr.length){
            return true;
        }
        return false;
       }
       int size(){
        return idx;
       }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(17);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println("Size:"+st.size());

    }
}
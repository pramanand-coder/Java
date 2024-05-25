public class LinkedListImplementationOfStack{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LLStack{
        private Node head=null;
        private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRev(Node h){
            if(h==null) return ;
            displayRev(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            displayRev(head);
            System.out.println();
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            size--;
            int top=head.data;
            head=head.next;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        LLStack st=new LLStack();
        st.push(10);
        st.push(15);
        st.push(17);
        st.push(19);
        st.display();
        System.out.println("Deleted item:"+st.pop());
        st.display();
        System.out.println("Peek item:"+st.peek());
        System.out.println("Size="+st.size());
        System.out.println(st.isEmpty());
        st.push(18);
        st.display();

    }
}
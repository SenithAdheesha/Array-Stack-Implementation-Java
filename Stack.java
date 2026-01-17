public class Stack {

    int tos; //index of the top of stack 
    int[] data; //stack values are stored in here 

    public Stack(int size){
        data = new int[size];
        tos = -1;
    }
    
    public Stack(){
        this(10);
    }

    public boolean isEmpty(){
        return tos == -1;
    }

    public boolean isFull(){
        return tos == data.length - 1;
    }

    public void push(int v){
        if (isFull()){
            System.out.println("Overflow Error");
        }else {
            data[++tos] = v;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow Error");
            return -1;
        }else{
            return data[tos--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            return data[tos];
        }
    }
}
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

}
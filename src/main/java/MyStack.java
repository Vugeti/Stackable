
import java.util.Arrays;

public class MyStack {
    private int size;
    private int[] stackArray;
    private int top;


    public MyStack(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }

    public boolean stackIsEmpty() {
        return (top == -1);
    }

    public void putOnStack(int element) {       //push
        if (stackIsFull()) {
            System.out.println("stack is full!");
        } else {
            int i = ++top;
            stackArray[i] = element;
            System.out.println("Top is " + top);
        }
    }

    public boolean stackIsFull() {
        try {
            return (top == size - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is full");
        }
        return false;
    }

    public int deleteElement() {     //pop
        if (stackIsEmpty()) {
            System.out.println("Stack is empty ");
            return 0;
        } else {
            System.out.println("Top is " + top);
            return stackArray[top--];
        }
    }

    public int checkTopElement() {      //pick
        if (stackIsEmpty()) {
            System.out.println("Stack is empty ");
            return 0;
        } else {
            System.out.println("Top is " + top);
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
        stack.putOnStack(1);
        stack.putOnStack(2);
        stack.putOnStack(3);
        System.out.println(Arrays.toString(stack.stackArray));
    }
}


import java.util.Arrays;

public class MyStack implements Stackable {
    private int size;
    private int[] stackArray;
    private int top;


    public MyStack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }


    public boolean stackIsEmpty() {
        return (top == -1);
    }

    public void putOnStack(int element) {       //push
        try {
            if (stackIsFull()) {
                System.out.println("stack is full!");
            } else {
                stackArray[++top] = element;
                System.out.println("Top is " + top + " element is " + element);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stack is full");
        }
    }

    public boolean stackIsFull() {
        return (top == size - 1);
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

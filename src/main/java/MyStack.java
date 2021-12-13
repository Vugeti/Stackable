
import java.util.Arrays;
import java.util.Optional;

public class MyStack implements Stackable {
    private int size;
    private int[] stackArray;
    private int top;

    public MyStack(int size) {
        this.size = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void putOnStack(int element) throws FullStackException {    //push      //Бросить соответствующие исключения в методах добавления/доставания
        if (stackIsFull()) {
            throw new FullStackException("fuck");
        } else {
            stackArray[++top] = element;
            System.out.println("Top is " + (top + 1) + " element is " + element);
        }
    }

    public boolean stackIsEmpty() {
        return (top == -1);
    }

    public boolean stackIsFull() {
        return (top == size - 1);
    }

    public Optional<Integer> deleteElement() {     //pop      //Бросить соответствующие исключения в методах добавления / доставания
        System.out.println("Top is " + (top + 1));
        if (stackIsEmpty()) {
            System.out.println("Stack is empty ");
            return Optional.empty();
        } else {
            return Optional.of(stackArray[top--]);
        }
    }

    public int deleteElement1() throws EmptyStackException {     //pop
        if (stackIsEmpty()) {
            throw new EmptyStackException("Empty");
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
            System.out.println("Top is " + (top + 1));
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(3);
//        stack.putOnStack(1);
//        stack.putOnStack(1);
//        stack.putOnStack(1);
//        stack.putOnStack(1);
        stack.deleteElement();
        System.out.println(Arrays.toString(stack.stackArray));
    }
}

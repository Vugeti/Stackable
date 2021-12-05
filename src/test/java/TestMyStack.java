import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMyStack {
    @Test
    void isEmpty() {
        MyStack stack = new MyStack(0);
        stack.deleteElement();
        Assertions.assertTrue(stack.stackIsEmpty());
    }

    @Test
    void IsFull() {
        MyStack stack = new MyStack(3);
        stack.putOnStack(1);
        stack.putOnStack(1);
        stack.putOnStack(1);
        stack.putOnStack(1);
        Assertions.assertTrue(stack.stackIsFull());
    }

    @Test
    void checkTopElementOnStack() {
        MyStack stack = new MyStack(3);
        stack.putOnStack(1);
        stack.putOnStack(2);
        stack.putOnStack(3);
        Assertions.assertEquals(3, stack.deleteElement());
    }

    @Test
    void addElementTest() {
        MyStack stack = new MyStack(10);
        stack.putOnStack(1);
        stack.putOnStack(1);
        stack.putOnStack(2);
        Assertions.assertEquals(2, stack.checkTopElement());
    }

    @Test
    void deleteElementTest() {
        MyStack stack = new MyStack(5);
        stack.putOnStack(5);
        stack.putOnStack(2);
        stack.deleteElement();
        Assertions.assertEquals(5, stack.checkTopElement());

    }
}
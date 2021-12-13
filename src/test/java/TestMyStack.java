import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TestMyStack {
    @Test
    void isEmpty() {
        MyStack stack = new MyStack(0);
        stack.deleteElement();
        EmptyStackException emptyStackException = Assertions.assertThrows(EmptyStackException.class, stack::deleteElement1);
        Assertions.assertEquals(emptyStackException.getMessage(), "Empty");
    }

    @Test
    void IsFull() throws FullStackException {
        MyStack stack = new MyStack(1);
        stack.putOnStack(1);
        FullStackException fullStackException = Assertions.assertThrows(FullStackException.class, () -> stack.putOnStack(1));
        Assertions.assertEquals(fullStackException.getMessage(), "fuck");
    }

    @Test
    void checkTopElementOnStack() throws EmptyStackException, FullStackException {
        MyStack stack = new MyStack(1);
        stack.putOnStack(1);
        Assertions.assertEquals(1, stack.deleteElement1());
    }

    @Test
    void addElementTest() throws FullStackException {
        MyStack stack = new MyStack(10);
        stack.putOnStack(1);
        stack.putOnStack(1);
        stack.putOnStack(2);
        Assertions.assertEquals(2, stack.checkTopElement());
    }

    @Test
    void deleteElementTest() throws FullStackException {
        MyStack stack = new MyStack(5);
        stack.putOnStack(5);
        stack.putOnStack(2);
        stack.deleteElement();
        Assertions.assertEquals(5, stack.checkTopElement());

    }

    @Test
    void isEmptyOptions() {
        MyStack stack = new MyStack(1);
        Optional<Integer> oStack = stack.deleteElement();
        Assertions.assertTrue(oStack.isEmpty());
    }
}
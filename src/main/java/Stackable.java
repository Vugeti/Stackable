import java.util.Optional;

public interface Stackable {

    boolean stackIsEmpty();

    void putOnStack(int element) throws FullStackException;

    boolean stackIsFull();

    Optional<Integer> deleteElement();

    int checkTopElement();

}

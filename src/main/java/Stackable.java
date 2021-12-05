public interface Stackable {

    boolean stackIsEmpty();

    void putOnStack(int element);

    boolean stackIsFull();

    int deleteElement();

    int checkTopElement();

}

/**
 * @author hongf
 * @create 2018-12-09 15:01
 * @desc
 **/

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}

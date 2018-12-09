/**
 * @author 洪峰
 * @create 2018-12-09 15:01
 **/

public class ArrayStack<E> implements Stack<E> {
    private DynamicArray<E> array;

    public ArrayStack(int capacity){
        array = new DynamicArray<>(capacity);
    }

    public ArrayStack(){
        array = new DynamicArray<>();
    }



    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }
}
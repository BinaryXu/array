/**
 * @author 洪峰
 * @create 2018-12-09 15:24
 **/

public class ArrayQueue<E> implements Queue<E>{

    DynamicArray<E> array;

    public ArrayQueue(int capacity){
      array = new DynamicArray<>(capacity);
    }

    public ArrayQueue(){
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
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    public int getCapacity(){
        return array.getCapacticy();
    }
}

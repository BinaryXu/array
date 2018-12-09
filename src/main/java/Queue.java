/**
 * @author hongf
 * @create 2018-12-09 15:21
 * @desc
 **/

public interface Queue<E> {

    /**
     * 获取对列大小
     * @return
     */
    int getSize();

    /**
     * 判断对列是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 进入对列
     * @param e
     */
    void enqueue(E e);

    /**
     * 出队
     * @return
     */
    E dequeue();

    /**
     * 获取队首元素
     * @return
     */
    E getFront();


}

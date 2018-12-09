/**
 * @author 洪峰
 * @create 2018-12-08 14:59
 **/

public class DynamicArray<E>{

    private E[] data;
    private int size;

    public DynamicArray(int capacticy){
        data = (E[])new Object[capacticy];
        size = 0;
    }
    public DynamicArray(){
        this(10);
    }

    //获取数组的容量
    public int getCapacticy(){
        return data.length;
    }
    //获取数组元素的个数
    public int getSize(){
        return size;
    }
    //返回数据是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //添加元素
    public void add(int index,E e){
        //当达到最大容量
        if(size == data.length){
            throw new IllegalArgumentException("Add failed Array is full");
        }
        if(size == data.length){
            resize(data.length*2);
        }
        if(index<0 || index > size){
            throw new IllegalArgumentException("Add failed Require index >= 0 and index <= size");
        }
        for (int i = size - 1;i >= index ;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;


    }

    //在头部添加元素

    public void addFirst(E e){
        add(0,e);
    }

    //在尾部添加元素
    public void addLast(E e){
        add(size,e);
    }

    //获取index索引未知的元素
    public E get(int index){
        if(index < 0 || index >=size){
            throw new IllegalArgumentException("Get failed Index is illegal");
        }
        return data[index];

    }
    public E getLast(){
        return get(size - 1);
    }

    public E getFirst(){
        return get(0);
    }
    //修改索引未知的元素为e
    public void set(int index,E e){
        if(index<0 || index >=size){
            throw new IllegalArgumentException("Set failed Index is illegal");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e){
        for(int i= 0;i<size;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;

    }

    //查找数组元素e所在的索引,如果不存在元素e，则返回-1
    public int find(E e){
        for (int i = 0; i < size ; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index){
        if(index<0|| index >= size){
            throw new IllegalArgumentException("remove fail index illegal");
        }
        E res = data[index];
        for (int i = index + 1;i<size;i++){
            data[i-1] = data[i];
        }
        size --;
        data[size] = null;

        if(size == data.length / 4 && data.length / 2 != 0){
            resize(data.length/2);
        }
        return res;

    }
    //从数组中删除第一个元素，返回删除的元素
    public E removeFirst(){
        return remove(0);
    }
    // 从数组中删除最后一个元素。返回删除的元素
    public E removeLast(){
        return remove(size-1);
    }
    //在数组中删除元素e
    public void removeElement(E e){
         int index = find(e);
         if(index!= -1){
             remove(index);
         }
    }
    //将数组空间的容量编变成newCapacity大小
    public void resize(int capacity){
        E newData[] = (E[]) new Object[capacity];
        for(int i=0;i<size;i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));

        res.append('[');
        for(int i = 0;i < size;i++){
            res.append(data[i]);
            if(i != size-1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

}

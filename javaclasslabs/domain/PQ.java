package javaclasslabs.domain;

public class PQ<K extends Comparable, V> implements PQInterface<K, V>  {


    Entry<K, V>[] heap;

    int size; //to keep track of where you are
    int capacity; //the whole array


    public PQ(){
        capacity = 10;
        size = 0;

        heap = new Entry[capacity];

    }

    private void swap(int i, int j){
        Entry<K, V> temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;

//        i = i + j;
//        j = i - j;
//        i = i - j;

    }

    private void upHeap(){
        int current = size - 1;

        while (current > 0){
            int parent = parent(current);
            if (heap[parent].getKey().compareTo(heap[current].getKey()) > 0){
                swap(current, parent(current));


                current = parent;
            } else {
                break;
            }
        }
    }
    @Override
    public void add(K key, V value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }

        Entry<K, V> entry = new Entry<>(key, value);
        heap[size++] = entry;
        size++;


    }
    public K getMin() {
        return heap[0].getKey();
    }

    @Override
    public V min() {
        return null;
    }

    @Override
    public V max() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int parent(int index) {
        return (index - 1) / 2;
    }

    @Override
    public int left(int index) {
        return index * 2 + 1;
    }

    @Override
    public int right(int index) {
        return index * 2 + 2;
    }
}

package javaclasslabs.domain;

public interface PQInterface<K, V> {

    public void add(K key, V value) throws Exception;
    public V min();
    public V max();
    public boolean isEmpty();
    public boolean isFull();
    public int size();
    public int parent(int index);
    public int left(int index);
    public int right(int index);
    public K getMin();
}

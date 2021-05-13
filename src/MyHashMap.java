import java.util.Arrays;

public class MyHashMap <K, V> {
    private int size;
    private MyNode <K, V> [] buckets;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    MyHashMap(){
        buckets = new MyNode[DEFAULT_CAPACITY];
    }

    private int keyHash(K key){
        return (key==null)? 0: key.hashCode()%DEFAULT_CAPACITY+1;
    }

    //добавляет пару ключ + значение
    public void put(K key, V value){
        int keyHash = keyHash(key);
        System.out.println("ключ = " + key + ", значение = " + value + ", определен hash ключа = " + keyHash);

        if (size > buckets.length * LOAD_FACTOR) {
            MyNode <K, V> [] newBucket = Arrays.copyOf(buckets, buckets.length * 2);
            buckets = newBucket;
        }

        MyNode <K, V> newNode = new MyNode <> (key, value,null);
        if (buckets[keyHash] == null){
            buckets[keyHash] = newNode;
            size++;
        } else {
            MyNode prev = null;
            MyNode item = buckets[keyHash];

            while (item != null) {
                if (item.key.equals(key)){
                    item.value = value;
                }
            }
            prev = item;
            item = item.next;
            size++;
        }
       // System.out.println(Arrays.toString(buckets));
    }
    //удаляет пару по ключу
    public void remove (K key){
        System.out.println("MyHashMap до удаления:\n" + Arrays.toString(buckets));
        buckets[keyHash(key)] = null;
        System.out.println("MyHashMap после удаления:\n" + Arrays.toString(buckets));
    }
    //очищает коллекцию
    public void clear() {
        System.out.println(Arrays.toString(buckets));
        buckets = new MyNode[DEFAULT_CAPACITY];
        size = 0;
        System.out.println(Arrays.toString(buckets));
    }
    //возвращает размер коллекции
    public int size() {
        return size;
    }
    //возвращает значение(Object value) по ключу
    public MyNode <K, V> get (K key){
        int keyHash = keyHash(key);
        MyNode node = buckets[keyHash];
        while (node != null) {
            if (node.key.equals(key)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    class MyNode <K, V> {
    int hash;
    K key;
    V value;
    MyNode <K, V> next;

    MyNode(K key, V value, MyNode <K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }
}

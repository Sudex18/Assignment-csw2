package genericspt2;

public class genq1<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public genq1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter method for key
    public K getKey() {
        return key;
    }

    // Setter method for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter method for value
    public V getValue() {
        return value;
    }

    // Setter method for value
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        // Create a Pair object with Integer key and String value
        genq1<Integer, String> myPair = new genq1<>(42, "Hello duniya!");

        // Retrieve and print the key and value
        System.out.println("Key: " + myPair.getKey());
        System.out.println("Value: " + myPair.getValue());
    }
}

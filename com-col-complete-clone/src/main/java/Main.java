import clone.org.apache.commons.collections.Bag;
import clone.org.apache.commons.collections.bag.HashBag;

public class Main {

    public static void main(String[] args) {
        Bag bag = new HashBag();
        bag.add("Hello");
        bag.add("World");
        System.out.println(bag.size());
    }
}

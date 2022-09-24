import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;

public class Main {

    public static void main(String[] args) {
        Bag bag = new HashBag();
        bag.add("Hello");
        bag.add("World");
        System.out.println(bag.size());

//        Bag bag = new HashBag();
//        Path path = Paths.get(args[0]);
//        byte[] data = Files.readAllBytes(path);
//        InputStream d = new ByteArrayInputStream(data);
//        ObjectInputStream ois = new ObjectInputStream(d);
//        ois.readObject();
    }
}

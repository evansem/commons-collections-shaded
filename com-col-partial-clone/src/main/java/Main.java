import clone.org.apache.commons.collections.Bag;
import clone.org.apache.commons.collections.bag.HashBag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Run dot command which in general is dot -Tpng:cairo foo.dot -o foo.png
        String[] c = {"java", "--version"};
        Process p = Runtime.getRuntime().exec(c);

        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s = null;
        while ((s = in.readLine()) != null) {
            System.out.println(s);
        }


        Bag bag = new HashBag();
        bag.add("Hello");
        bag.add("World");
        System.out.println(bag.size());
    }
}

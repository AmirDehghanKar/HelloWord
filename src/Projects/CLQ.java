package Projects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CLQ {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");
        collection.remove("A");
        var conta = collection.contains("C");
        System.out.println(conta);
        System.out.println(collection);
    }
}
/* Collection List Queue: Add Remove Contains */
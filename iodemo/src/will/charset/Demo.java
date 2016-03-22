package will.charset;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class Demo {
    public static void main(String[] args) {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        Set<String> keys = map.keySet();
        for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
            String key = iterator.next();
            System.out.println(key+", "+map.get(key).displayName());
        }
    }
}

package will.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Will
 * @date 16/3/20
 */
public class StandStreamTest {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(reader);
        String line;
        while ((line = r.readLine()) != null) {
            System.out.println(line);
        }
    }
}

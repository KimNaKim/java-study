package ex13;

import java.util.HashSet;
import java.util.Random;
import java.util.jar.JarEntry;

public class Collect03 {
    static void main() {
        HashSet<Integer> arr = new HashSet<Integer>();

        Random random = new Random();
        int n;

        while(true){
            n = random.nextInt(45);
            arr.add(n);

            if(arr.size() == 6) break;
        }
    }
}

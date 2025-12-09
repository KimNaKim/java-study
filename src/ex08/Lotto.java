package ex08;

import java.util.Random;

public class Lotto {
    static void main() {
        Random random = new Random();

        for(int i = 0; i<10; i++){
            System.out.println(random.nextInt(99));
        }
    }
}

package ex16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallbackTest {
    static void main() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("beep");
            }
        };
        Timer t = new Timer(1000, listener);
    }
}

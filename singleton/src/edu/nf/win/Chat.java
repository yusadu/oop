package edu.nf.win;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Chat {
    private static Chat instance=new Chat();


    private Chat(){
        JFrame f=new JFrame("聊天框");
        f.setSize(400,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static Chat getInstance(){
        return instance;
    }
}

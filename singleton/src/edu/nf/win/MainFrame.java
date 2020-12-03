package edu.nf.win;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {
    private JFrame f;
    private JButton btn;

    public MainFrame(){
        f=new JFrame("主界面");
        btn=new JButton("点击");
        f.add(btn, BorderLayout.CENTER);
        f.setSize(300,300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //给按钮绑定单击事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chat.getInstance();
            }
        });
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

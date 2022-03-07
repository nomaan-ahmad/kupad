package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JButton b1;
    About(){
        setBounds(600, 200, 700, 600 );
        setLayout(null);

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 40, 400, 80);*/

        JLabel l3 = new JLabel("<html><h1>TechBOX<h1><br>Nomaan Ahmad<br><br>Kupad is just a alternative of classical Notepad for basic text editing purpose</html>");
        l3.setBounds(100, 50, 500, 400);
        l3.setFont(new Font("SAN SERIF", Font.PLAIN, 10));
        add(l3);

        b1 = new JButton("OK");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    public static void main(String[] args){
        new About().setVisible(true);
    }
}

//Matias Gonzalez
//maa.gonzalezmo@alumnos.duoc.cl
//ing informatica
//932361713

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HolaMundo extends JFrame implements ActionListener {

    private JLabel label;
    private JMenuBar bar;
    private JMenu menu, menu2, menu3, menu4, menu5;
    private JMenuItem item, item2, item3, item4, item5, item6, item7, item8;
    private JMenuItem item9, item10, item11, item12, item13, item14, item15, item16;


    public HolaMundo() {

        setLayout(null);
        label = new JLabel("Hola Mundo!!");

        label.setBounds(70, 40, 200, 100);
        add(label);

        label.setFont(new java.awt.Font("Tahoma", 2, 24));
        label.setForeground(Color.BLACK);

        bar = new JMenuBar();
        bar.setBounds(0, 0, 300, 20);
        add(bar);

        menu = new JMenu("Tipo Letra");
        bar.add(menu);
        menu2 = new JMenu("Tahoma");
        menu.add(menu2);
        menu3 = new JMenu("Arial");
        menu.add(menu3);
        menu4 = new JMenu("Blackadder ITC");
        menu.add(menu4);
        menu5 = new JMenu("Edwardian Script ITC");
        menu.add(menu5);

        item = new JMenuItem("Azul");
        menu2.add(item);
        item.addActionListener(this);
        item2 = new JMenuItem("Rojo");
        menu2.add(item2);
        item2.addActionListener(this);
        item3 = new JMenuItem("Verde");
        menu2.add(item3);
        item3.addActionListener(this);
        item4 = new JMenuItem("Naranjo");
        menu2.add(item4);
        item4.addActionListener(this);

        item5 = new JMenuItem("Azul");
        menu3.add(item5);
        item5.addActionListener(this);
        item6 = new JMenuItem("Rojo");
        menu3.add(item6);
        item6.addActionListener(this);
        item7 = new JMenuItem("Verde");
        menu3.add(item7);
        item7.addActionListener(this);
        item8 = new JMenuItem("Naranjo");
        menu3.add(item8);
        item8.addActionListener(this);

        item9 = new JMenuItem("Azul");
        menu4.add(item9);
        item9.addActionListener(this);
        item10 = new JMenuItem("Rojo");
        menu4.add(item10);
        item10.addActionListener(this);
        item11 = new JMenuItem("Verde");
        menu4.add(item11);
        item11.addActionListener(this);
        item12 = new JMenuItem("Naranjo");
        menu4.add(item12);
        item12.addActionListener(this);

        item13 = new JMenuItem("Azul");
        menu5.add(item13);
        item13.addActionListener(this);
        item14 = new JMenuItem("Rojo");
        menu5.add(item14);
        item14.addActionListener(this);
        item15 = new JMenuItem("Verde");
        menu5.add(item15);
        item15.addActionListener(this);
        item16 = new JMenuItem("Naranjo");
        menu5.add(item16);
        item16.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == item) {
            label.setFont(new java.awt.Font("Tahoma", 2, 24));
            label.setForeground(Color.BLUE);
        }
        if (e.getSource() == item2) {
            label.setFont(new java.awt.Font("Tahoma", 2, 24));
            label.setForeground(Color.red);
        }
        if (e.getSource() == item3) {
            label.setFont(new java.awt.Font("Tahoma", 2, 24));
            label.setForeground(Color.GREEN);
        }
        if (e.getSource() == item4) {
            label.setFont(new java.awt.Font("Tahoma", 2, 24));
            label.setForeground(Color.ORANGE);
        }

        if (e.getSource() == item5) {
            label.setFont(new java.awt.Font("Arial", 2, 24));
            label.setForeground(Color.BLUE);
        }
        if (e.getSource() == item6) {
            label.setFont(new java.awt.Font("Arial", 2, 24));
            label.setForeground(Color.red);
        }
        if (e.getSource() == item7) {
            label.setFont(new java.awt.Font("Arial", 2, 24));
            label.setForeground(Color.GREEN);
        }
        if (e.getSource() == item8) {
            label.setFont(new java.awt.Font("Arial", 2, 24));
            label.setForeground(Color.ORANGE);
        }

        if (e.getSource() == item9) {
            label.setFont(new java.awt.Font("Blackadder ITC", 2, 24));
            label.setForeground(Color.BLUE);
        }
        if (e.getSource() == item10) {
            label.setFont(new java.awt.Font("Blackadder ITC", 2, 24));
            label.setForeground(Color.red);
        }
        if (e.getSource() == item11) {
            label.setFont(new java.awt.Font("Blackadder ITC", 2, 24));
            label.setForeground(Color.GREEN);
        }
        if (e.getSource() == item12) {
            label.setFont(new java.awt.Font("Blackadder ITC", 2, 24));
            label.setForeground(Color.ORANGE);
        }

        if (e.getSource() == item13) {
            label.setFont(new java.awt.Font("Edwardian Script ITC", 2, 24));
            label.setForeground(Color.BLUE);
        }
        if (e.getSource() == item14) {
            label.setFont(new java.awt.Font("Edwardian Script ITC", 2, 24));
            label.setForeground(Color.red);
        }
        if (e.getSource() == item15) {
            label.setFont(new java.awt.Font("Edwardian Script ITC", 2, 24));
            label.setForeground(Color.GREEN);
        }
        if (e.getSource() == item16) {
            label.setFont(new java.awt.Font("Edwardian Script ITC", 2, 24));
            label.setForeground(Color.ORANGE);
        }
    }


    public static void main(String[] args) {
        HolaMundo mundo = new HolaMundo();

        mundo.setBounds(0, 0, 300, 200);

        mundo.setVisible(true);
        mundo.setLocationRelativeTo(null);
        mundo.setResizable(false);
        mundo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

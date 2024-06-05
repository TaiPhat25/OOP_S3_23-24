/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6p;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tai-E758
 */
public class MainFrame extends JFrame {

    private JTextField name;
    private JCheckBox breakfast, golf, pool;
    private JButton btnCalculate;
    private JComboBox discountOption;

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        this.setLayout(new GridLayout(7, 1));

        JPanel pannel1 = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("Resort Price Calculator");
        label1.setFont(new Font("Windows 7 Segoe UI", Font.PLAIN, 25));
        pannel1.add(label1);

        JPanel pannel2 = new JPanel(new FlowLayout());
        JLabel label2 = new JLabel("Base price for a room is $200");
        label2.setFont(new Font("Windows 7 Segoe UI", Font.PLAIN, 17));
        pannel2.add(label2);

        JPanel pannel3 = new JPanel(new FlowLayout());
        JLabel label3 = new JLabel("Choose options that you want");
        label3.setFont(new Font("Windows 7 Segoe UI", Font.PLAIN, 17));
        pannel3.add(label3);

        this.add(pannel1);
        this.add(pannel2);
        this.add(pannel3);

        JPanel pannel4 = new JPanel(new FlowLayout());
        JLabel label4 = new JLabel("Guest Name: ");
        label4.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        pannel4.add(label4);
        name = new JTextField();
        name.setPreferredSize(new Dimension(175, 20));
        pannel4.add(name);

        this.add(pannel4);

        JPanel pannel5 = new JPanel(new FlowLayout());
        breakfast = new JCheckBox("Breakfast $20");
        breakfast.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        golf = new JCheckBox("Golf $50");
        golf.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        pool = new JCheckBox("Pool $15");
        pool.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        pannel5.add(breakfast);
        pannel5.add(golf);
        pannel5.add(pool);

        this.add(pannel5);

        JPanel pannel6 = new JPanel(new FlowLayout());
        JLabel label7 = new JLabel();
        String[] data = {"Weekdays (-10%)", "Weekends (+30%)"};
        discountOption = new JComboBox(data);
        discountOption.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        pannel6.add(discountOption);
        btnCalculate = new JButton("Calculate");
        btnCalculate.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        btnCalculate.addActionListener((e) -> {
            if (!name.getText().isEmpty()) {
                double price = 200;
                if (breakfast.isSelected()) {
                    price += 20;
                }
                if (golf.isSelected()) {
                    price += 50;
                }
                if (pool.isSelected()) {
                    price += 15;
                }
                if (discountOption.getSelectedItem().equals("Weekdays (-10%)")) {
                    price = price - (price * 0.1);
                } else {
                    price = price + (price * 0.3);
                }
                label7.setText(String.format("Hello %s, Your Payment Is: $%.2f", name.getText(), price));
            } else {
                JOptionPane.showMessageDialog(null, "You Need To Enter Your Name", "Notification", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        pannel6.add(btnCalculate);
        label7.setHorizontalAlignment(JLabel.CENTER);

        this.add(pannel6);
        this.add(label7);

        this.setSize(1024, 768);
        this.setLocation(250, 250);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

}

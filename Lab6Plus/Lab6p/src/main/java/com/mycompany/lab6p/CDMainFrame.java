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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Tai-E758
 */
public class CDMainFrame extends JFrame {

    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField cdid, cdtitle, cdprice, cdyearOfRelease;
    private JComboBox cdCollection;
    private JRadioButton audio, video;
    private JButton btnAdd, btnClear, btnShowAll;
    private CDManager cdStore = new CDManager();

    public CDMainFrame() throws HeadlessException {
    }

    public CDMainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public CDMainFrame(String title) throws HeadlessException {
        super(title);
        this.setLayout(new GridLayout(7, 1));

        JPanel panel1 = new JPanel(new FlowLayout());
        label1 = new JLabel("CD ID");
        label1.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel1.add(label1);
        cdid = new JTextField();
        cdid.setPreferredSize(new Dimension(175, 25));
        panel1.add(cdid);

        this.add(panel1);

        JPanel panel2 = new JPanel(new FlowLayout());
        label2 = new JLabel("CD Title");
        label2.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel2.add(label2);
        cdtitle = new JTextField();
        cdtitle.setPreferredSize(new Dimension(175, 25));
        panel2.add(cdtitle);

        this.add(panel2);

        JPanel panel3 = new JPanel(new FlowLayout());
        label3 = new JLabel("CD Collection");
        label3.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel3.add(label3);
        String[] collection = {"Game", "Movie", "Music"};
        cdCollection = new JComboBox(collection);
        cdCollection.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel3.add(cdCollection);
        label4 = new JLabel("CD Type");
        label4.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel3.add(label4);
        audio = new JRadioButton("Audio");
        video = new JRadioButton("Video");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(audio);
        rndGroup.add(video);
        panel3.add(audio);
        panel3.add(video);

        this.add(panel3);

        JPanel panel4 = new JPanel(new FlowLayout());
        label5 = new JLabel("CD Price");
        label5.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        panel4.add(label5);
        cdprice = new JTextField();
        cdprice.setPreferredSize(new Dimension(175, 25));
        panel4.add(cdprice);

        this.add(panel4);

        label6 = new JLabel("CD Year Of Release");
        label6.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        label6.setHorizontalAlignment(JLabel.CENTER);

        this.add(label6);

        JPanel panel5 = new JPanel(new FlowLayout());
        cdyearOfRelease = new JTextField();
        cdyearOfRelease.setPreferredSize(new Dimension(175, 25));
        panel5.add(cdyearOfRelease);

        this.add(panel5);

        JPanel panel6 = new JPanel(new FlowLayout());
        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        btnAdd.addActionListener((e) -> {
            if (checkInformation()) {
                if (audio.isSelected()) {
                    CD cd1 = new CD(Long.parseLong(cdid.getText()), cdCollection.getSelectedItem().toString(), "Audio", cdtitle.getText(), Integer.parseInt(cdprice.getText()), Integer.parseInt(cdyearOfRelease.getText()));
                    if (cdStore.addCD(cd1) == true) {
                        JOptionPane.showMessageDialog(null, "CD Added Successfully", "Notification", JOptionPane.CLOSED_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "This CD Is Already In The List", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (video.isSelected()) {
                    CD cd1 = new CD(Long.parseLong(cdid.getText()), cdCollection.getSelectedItem().toString(), "Video", cdtitle.getText(), Integer.parseInt(cdprice.getText()), Integer.parseInt(cdyearOfRelease.getText()));
                    if (cdStore.addCD(cd1) == true) {
                        JOptionPane.showMessageDialog(null, "CD Added Successfully", "Notification", JOptionPane.CLOSED_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(null, "This CD Is Already In The List", "Notification", JOptionPane.ERROR_MESSAGE);
                    }
                }
                clearInformation();
            } else {
                JOptionPane.showMessageDialog(null, "You Need To Enter All Information", "Notification", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        btnClear.addActionListener((e) -> {
            clearInformation();
        });
        btnShowAll = new JButton("Show All");
        btnShowAll.setFont(new Font("Windows 7 Segoe UI", Font.BOLD, 12));
        btnShowAll.addActionListener((e) -> {
            cdStore.showAllCD();
        });
        panel6.add(btnAdd);
        panel6.add(btnClear);
        panel6.add(btnShowAll);

        this.add(panel6);

        this.setSize(1024, 768);
        this.setLocation(250, 250);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public CDMainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    public boolean checkInformation() {
        if (cdid.getText().isEmpty() || cdtitle.getText().isEmpty() || cdprice.getText().isEmpty() || cdyearOfRelease.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void clearInformation() {
        cdid.setText("");
        cdtitle.setText("");
        cdprice.setText("");
        cdyearOfRelease.setText("");
    }
}

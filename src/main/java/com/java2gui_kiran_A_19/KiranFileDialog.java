package com.java2gui_kiran_A_19;
import java.awt.*;
public class KiranFileDialog extends Frame {
    KiranFileDialog() {
        this.setTitle("Kiran Khanal-10413/19");
        this.setSize(700, 600);
        this.setLayout(null);
        this.setVisible(true);
        Button btnSelect = new Button("Select File");
        btnSelect.setBounds(120, 100, 100, 25);
        this.add(btnSelect);
        FileDialog fd = new FileDialog(this, "Choose File");
        fd.setSize(400, 200);
        fd.setLayout(null);
        btnSelect.addActionListener(e -> {
        fd.setVisible(true);
        });
    }
    public static void main(String[] args) {
        new KiranFileDialog();
    }
}
package edu.neu.mgen.HW14;

import javax.swing.*;
import java.awt.*;

class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JButton loginButton;

    public LoginFrame() {
        setTitle("Chat Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Username:"));
        usernameField = new JTextField(15);
        add(usernameField);

        loginButton = new JButton("Login");
        add(loginButton);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText().trim();
            if (!username.isEmpty()) {
                setVisible(false);
                new ChatFrame(username);
            } else {
                JOptionPane.showMessageDialog(this, "Username cannot be empty!");
            }
        });

        setVisible(true);
    }
}

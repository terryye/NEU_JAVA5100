package edu.neu.mgen.HW14;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

class ChatFrame extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public ChatFrame(String username) {
        setTitle("Chat Application - " + username);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Chat Area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Input Area
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        sendButton = new JButton("Send");
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(e -> sendMessage(username));

        // Initialize networking
        initializeNetworking();
        setVisible(true);
    }

    private void initializeNetworking() {
        try {
            String option = JOptionPane.showInputDialog(this, "Type 'wait' to listen or 'connect' to join:");
            if (option.equalsIgnoreCase("wait")) {
                // Server: Prompt for port (9001-9010)
                int port = Integer
                        .parseInt(JOptionPane.showInputDialog(this, "Enter port to listen on (9001-9010):", "9001"));
                if (port < 9001 || port > 9010) {
                    throw new IllegalArgumentException("Invalid port range. Choose between 9001 and 9010.");
                }

                // Start a new thread for accepting connections
                new Thread(() -> {
                    try (ServerSocket serverSocket = new ServerSocket(port)) {
                        chatArea.append("Waiting for a connection on port " + port + "...\n");
                        socket = serverSocket.accept();
                        chatArea.append("Client connected.\n");
                        setupStreams();
                    } catch (IOException e) {
                        chatArea.append("Error: " + e.getMessage() + "\n");
                    }
                }).start();

            } else if (option.equalsIgnoreCase("connect")) {
                // Client: Prompt for IP and port
                String serverIP = JOptionPane.showInputDialog(this, "Enter server IP:", "localhost");
                int port = Integer
                        .parseInt(JOptionPane.showInputDialog(this, "Enter port to connect to (9001-9010):", "9001"));
                if (port < 9001 || port > 9010) {
                    throw new IllegalArgumentException("Invalid port range. Choose between 9001 and 9010.");
                }

                // Connect as client
                new Thread(() -> {
                    try {
                        socket = new Socket(serverIP, port);
                        chatArea.append("Connected to server on port " + port + ".\n");
                        setupStreams();
                    } catch (IOException e) {
                        chatArea.append("Error: " + e.getMessage() + "\n");
                    }
                }).start();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid option. Restart the application.");
                System.exit(0);
            }
        } catch (Exception ex) {
            chatArea.append("Error initializing networking: " + ex.getMessage() + "\n");
        }
    }

    private void sendMessage(String username) {
        String message = inputField.getText().trim();
        if (!message.isEmpty()) {
            writer.println(username + ": " + message);
            chatArea.append("Me: " + message + "\n");
            inputField.setText("");
        }
    }

    private void setupStreams() {
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(), true);

            // Start receiving messages
            new Thread(this::receiveMessages).start();

        } catch (IOException e) {
            chatArea.append("Error setting up streams: " + e.getMessage() + "\n");
        }
    }

    private void receiveMessages() {
        try {
            String message;
            while ((message = reader.readLine()) != null) {
                chatArea.append(message + "\n");
            }
        } catch (IOException ex) {
            chatArea.append("Connection lost.\n");
        }
    }
}

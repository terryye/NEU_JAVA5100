package edu.neu.mgen.Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleColorChooser extends JFrame {
    private JComboBox<String> colorDropdown;
    private CirclePanel circlePanel;
    private JLabel colorLabel;

    // Constructor to set up the GUI
    public CircleColorChooser() {
        // Set up the frame
        setTitle("Circle Color Chooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Dropdown for color selection
        String[] colors = { "Choose Color", "Red", "Blue", "Green" };
        colorDropdown = new JComboBox<>(colors);
        colorDropdown.addActionListener(new ColorSelectionHandler());

        // Panel to display the circle
        circlePanel = new CirclePanel();

        // Label to display the selected color name
        colorLabel = new JLabel("Selected Color: None", SwingConstants.CENTER);

        // Add components to the frame
        add(colorDropdown, BorderLayout.NORTH);
        add(circlePanel, BorderLayout.CENTER);
        add(colorLabel, BorderLayout.SOUTH);
    }

    public class CirclePanel extends JPanel {
        private Color circleColor = null;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw the circle
            g.setColor(circleColor == null ? getBackground() : circleColor);
            g.fillOval(100, 50, 150, 150);
            g.setColor(Color.BLACK);
            g.drawOval(100, 50, 150, 150);
        }

        // Method to set the color of the circle
        public void setCircleColor(Color color) {
            this.circleColor = color;
            repaint();
        }
    }

    // Event handler for color selection
    private class ColorSelectionHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = (String) colorDropdown.getSelectedItem();
            Color color = null;

            // Map the selected color to its Color object
            switch (selectedColor) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Green":
                    color = Color.GREEN;
                    break;
            }

            // Update the circle color and the label text
            circlePanel.setCircleColor(color);
            colorLabel.setText("Selected Color: " + selectedColor);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleColorChooser frame = new CircleColorChooser();
            frame.setVisible(true);
        });
    }
}
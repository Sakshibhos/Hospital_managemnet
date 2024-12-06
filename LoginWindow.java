package Hospitalmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends JFrame implements ActionListener {
    private JButton patientButton;
    private JButton doctorButton;

    public LoginWindow() {
        setTitle("Hospital Management System Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(2, 1));

        // Create buttons
        patientButton = new JButton("Login as Patient");
        doctorButton = new JButton("Login as Doctor");

        // Add action listeners
        patientButton.addActionListener(this);
        doctorButton.addActionListener(this);

        // Add buttons to the frame
        add(patientButton);
        add(doctorButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == patientButton) {
            // Open patient login window
            new PatientLoginWindow().setVisible(true);
        } else if (e.getSource() == doctorButton) {
            // Open doctor login window
            new DoctorLoginWindow().setVisible(true);
        }
    }

    public static void main(String[] args) {
        // Create and display the login window
        SwingUtilities.invokeLater(() -> {
            new LoginWindow().setVisible(true);
        });
    }
}

class PatientLoginWindow extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField mobileField;

    public PatientLoginWindow() {
        setTitle("Patient Login");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close only this window
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(4, 2));

        // Add labels and text fields
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Mobile Number:"));
        mobileField = new JTextField();
        add(mobileField);

        // Add login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            // Perform login operation here
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String mobile = mobileField.getText();
            // You can handle the login process here
        });
        add(loginButton);
    }
}

class DoctorLoginWindow extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JTextField mobileField;

    public DoctorLoginWindow() {
        setTitle("Doctor Login");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Close only this window
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(4, 2));

        // Add labels and text fields
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Mobile Number:"));
        mobileField = new JTextField();
        add(mobileField);

        // Add login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            // Perform login operation here
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String mobile = mobileField.getText();
            // You can handle the login process here
        });
        add(loginButton);
    }
}

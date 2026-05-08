import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

public class NetflixLogin {
    public static void main(String[] args) {
        // Үндсэн цонх
        JFrame frame = new JFrame("Netflix - Login");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK); // Netflix-ийн хар дэвсгэр
        frame.setLayout(null);

        // Гарчиг
        JLabel titleLabel = new JLabel("Sign In");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setBounds(50, 50, 200, 40);
        frame.add(titleLabel);

        // Имэйл оруулах талбар
        JTextField emailField = new JTextField("Email or phone number");
        emailField.setBounds(50, 120, 300, 50);
        emailField.setBackground(new Color(51, 51, 51));
        emailField.setForeground(Color.GRAY);
        emailField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        frame.add(emailField);

        // Нууц үг оруулах талбар
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 190, 300, 50);
        passwordField.setBackground(new Color(51, 51, 51));
        passwordField.setForeground(Color.WHITE);
        frame.add(passwordField);

        // Нэвтрэх товчлуур (Улаан)
        JButton loginButton = new JButton("Sign In");
        loginButton.setBounds(50, 280, 300, 45);
        loginButton.setBackground(new Color(229, 9, 20)); // Netflix Red
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(loginButton);

        // Тусламж хэсэг
        JCheckBox rememberMe = new JCheckBox("Remember me");
        rememberMe.setBounds(50, 340, 150, 20);
        rememberMe.setBackground(Color.BLACK);
        rememberMe.setForeground(Color.LIGHT_GRAY);
        frame.add(rememberMe);

        // Үйлдэл бүртгэх (ActionListeners)
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = emailField.getText();
                PrintStream out = System.out;
                out.println("System: 'Sign In' tovch daragdlaa.");
                out.println("Console: Hereglegch '" + user + "' Nereer nevtrehiig oroldloo.");
            }
        });

        rememberMe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean selected = rememberMe.isSelected();
                String x = "Console: Remember me selection = " + selected;
                System.out.println(x);
            }
        });

        frame.setLocationRelativeTo(null); // Цонхыг дэлгэцийн голд байрлуулна
        frame.setVisible(true);
    }
}
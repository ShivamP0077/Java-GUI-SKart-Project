import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Registration extends JFrame implements ActionListener {
    JLabel title, l1, l2, l3,bg;
    JTextField usernameField;
    JPasswordField passwordField, confirmPasswordField;
    JButton registerButton, backButton;

    DatabaseConnection dbConnection;

    Registration() {

        dbConnection = new DatabaseConnection();



        title = new JLabel("Registration");
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setBounds(470, 100, 400, 100);
        add(title);

        l1 = new JLabel();
        l1.setText("Username");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l1.setBounds(370, 200, 350, 100);
        add(l1);

        l2 = new JLabel();
        l2.setText("Password");
        l2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l2.setBounds(370, 270, 350, 100);
        add(l2);

        l3 = new JLabel();
        l3.setText("Confirm Password");
        l3.setFont(new Font("Segoe UI", Font.BOLD, 18));
        l3.setBounds(370, 340, 350, 100);
        add(l3);

        usernameField = new JTextField();
        usernameField.setBounds(540, 240, 200, 20);
        add(usernameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(540, 308, 200, 20);
        add(passwordField);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(540, 378, 200, 20);
        add(confirmPasswordField);

        registerButton = new JButton("Register");
        registerButton.setBounds(487, 450, 90, 35);
        registerButton.setText("Register");
        registerButton.addActionListener(this);
        add(registerButton);

        backButton = new JButton("Back");
        backButton.setBounds(645, 450, 90, 35);
        backButton.setText("Back");
        backButton.addActionListener(this);
        add(backButton);

        bg = new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\rgbg.jpg"));
        bg.setSize(1280, 720);
        add(bg);

        setTitle("Registration");

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
            } else if (!isPasswordValid(password)) {
                JOptionPane.showMessageDialog(this, "Password is not valid.");
                JOptionPane.showMessageDialog(this, "Password must have one uppercase and one number.");
            } else {
                // Registration successful
               JOptionPane.showMessageDialog(this, "Registration successful!");
                DatabaseConnection.registerUser(username, password);
                // redirirct to login
                new login();
                dispose();
            }
        } else if (e.getSource() == backButton) {
            new login();
            dispose();
        }
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (hasUppercase && hasDigit) {
                return true;
            }
        }

        return false;
    }


}

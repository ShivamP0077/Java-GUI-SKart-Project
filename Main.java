import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class login extends JFrame implements ActionListener {
    JLabel title,bg,l1,l2;

    JTextField t;

    JPasswordField p;

    JButton b,r;

    DatabaseConnection dbConnection;

    login()
    {
        dbConnection = new DatabaseConnection();

        title = new JLabel("WELCOME TO SKART...");
        title.setFont(new Font("Segue UI", 1, 28));
        title.setBounds(300,50,400,100);
        add(title);

        l1 = new JLabel();
        l1.setText(" USERNAME ");
        l1.setFont(new Font("Segue UI", 1, 18));
        l1.setBounds(200, 200, 350, 100);
        add(l1);

        l2 = new JLabel();
        l2.setText(" PASSWORD ");
        l2.setFont(new Font("Segue UI", 1, 18));
        l2.setBounds(200, 270, 350, 100);
        add(l2);

        t = new JTextField();
        t.setBounds(320,240,200,20);
        add(t);

        p = new JPasswordField();
        p.setBounds(320,308,200,20);
        add(p);

        b = new JButton("LOGIN");
        b.setBounds(327,388,90,35);
        b.setText("LOGIN");
        b.addActionListener(this);
        add(b);

        r = new JButton("SIGN UP");
        r.setBounds(475,388,90,35);
        r.setText("SIGN UP");
        r.addActionListener(this);
        add(r);

        bg = new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\login-bg.jpg"));
        bg.setSize(1280, 720);
        add(bg);

        setTitle("LOGIN");

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String username = t.getText();
            String password = new String(p.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } else {
                boolean loginSuccessful = DatabaseConnection.checkLogin(username, password);
                if (loginSuccessful) {
                    JOptionPane.showMessageDialog(this, "Login successful!");

                    new itempage();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Login failed. Please check your credentials.");
                }
            }
        } else if (e.getSource() == r) {
            new Registration();
            dispose();
        }
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 6) {
            // Password is too short
            JOptionPane.showMessageDialog(this, "Password is too short. It must be at least 6 characters long.");
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
                // Password is valid

                return true;
            }
        }

        // Password dont match
        JOptionPane.showMessageDialog(this, "Password must contain at least one uppercase letter and one digit.");
        return false;
    }





}

public class Main{
    public static void main(String[] args) {
        new login();
    }
}

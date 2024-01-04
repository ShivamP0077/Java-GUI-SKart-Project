import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CartPage extends JFrame implements ActionListener {
    private DefaultListModel<String> cartListModel;
    private JList<String> cartList;
    private JButton removeButton;

    public CartPage(DefaultListModel<String> cartListModel) {
        this.cartListModel = cartListModel;

        setTitle("Shopping Cart");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Customize the background color
        getContentPane().setBackground(new Color(240, 240, 240));

        // Create a custom font for the cart list
        Font customFont = new Font("Arial", Font.PLAIN, 16);

        cartList = new JList<>(this.cartListModel);
        cartList.setFont(customFont);

        // Create a custom selection color
        cartList.setSelectionBackground(new Color(255, 215, 0));

        removeButton = new JButton("Remove");
        removeButton.setFont(customFont);
        removeButton.setBackground(new Color(255, 69, 0)); // Set a custom background color
        removeButton.setForeground(Color.WHITE); // Set text color
        removeButton.setFocusPainted(false); // Remove focus border
        removeButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = cartList.getSelectedIndex();
                if (selectedIndex != -1) {
                    cartListModel.remove(selectedIndex);
                }
            }
        });

        JButton showBillButton = new JButton("Show Bill");
        showBillButton.setFont(customFont);
        showBillButton.setBackground(new Color(0, 128, 0)); // Set a custom background color
        showBillButton.setForeground(Color.WHITE); // Set text color
        showBillButton.setFocusPainted(false); // Remove focus border
        showBillButton.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Add padding
        showBillButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBill();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(removeButton);
        buttonPanel.add(showBillButton);

        // Create a title label
        JLabel titleLabel = new JLabel("Your Shopping Cart");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create a separator
        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);

        setLayout(new BorderLayout());

        // Customize the title label's background color
        titleLabel.setOpaque(true);
        titleLabel.setBackground(new Color(0, 102, 204));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0)); // Add padding

        add(titleLabel, BorderLayout.NORTH);
        add(new JScrollPane(cartList), BorderLayout.CENTER);
        add(separator, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void showBill() {
        float totalAmount = 0;
        StringBuilder billText = new StringBuilder();

        for (int i = 0; i < cartListModel.size(); i++) {
            String item = cartListModel.elementAt(i);
            // Extract the quantity and price from the item string
            String[] parts = item.split(" @ Rs.");
            if (parts.length == 2) {
                String quantityStr = parts[0].replaceAll("[^0-9]", ""); // Extract digits
                String priceStr = parts[1].replaceAll("[^0-9.]", ""); // Extract digits and decimal point
                int quantity = Integer.parseInt(quantityStr);
                float price = Float.parseFloat(priceStr);
                totalAmount += quantity * price;

                billText.append(item).append("\n");
            }
        }

        billText.append("Total: Rs.").append(totalAmount);

        // Display the bill in a dialog
        JOptionPane.showMessageDialog(this, billText.toString(), "Bill", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DefaultListModel<String> cartListModel = new DefaultListModel<>();
            cartListModel.addElement("Item 1 @ Rs.10.50");
            cartListModel.addElement("Item 2 @ Rs.5.25");
            CartPage cartPage = new CartPage(cartListModel);
            cartPage.setVisible(true);
        });
    }
}

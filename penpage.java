import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.*;
public class penpage implements ActionListener {
    private DefaultListModel<String> cartListModel;
    JFrame p;
    JLabel pl, list, quan, pen_back, urllink, ss_url, ss2_url, oct_url, gold_url, cell_url;
    JButton add_cart, check_dir, jcart;
    JCheckBox jcb_ss, jcb_ss2, jcb_oct, jcb_gold, jcb_cell;
    JTextField ss_quan, ss2_quan, oct_quan, gold_quan, cell_quan;

    penpage() {
        cartListModel = new DefaultListModel<>();

        p = new JFrame("Pen Items..");
        pl = new JLabel();
        pl.setFont(new Font("Segoe UI", 1, 36));
        pl.setText("Available Pens...");
        pl.setForeground(Color.BLACK);
        pl.setBounds(450, 25, 350, 100);
        p.add(pl);
        list = new JLabel();
        list.setFont(new Font("Segoe UI", 1, 16));
        list.setText("Here are the list of available pens....");
        list.setForeground(Color.YELLOW);
        list.setBounds(100, 130, 350, 100);
        p.add(list);
        quan = new JLabel();
        quan.setFont(new Font("Segoe UI", 1, 16));
        quan.setText("Quantity");
        quan.setForeground(Color.YELLOW);
        quan.setBounds(450, 130, 100, 100);
        p.add(quan);
        urllink = new JLabel();
        urllink.setFont(new Font("Segoe UI", 1, 16));
        urllink.setText("Preview");
        urllink.setForeground(Color.YELLOW);
        urllink.setBounds(550, 130, 100, 100);
        p.add(urllink);
        ss_url = new JLabel();
        ss_url.setFont(new Font("Segoe UI", 1, 14));
        ss_url.setText("S.S. Pinlong");
        ss_url.setBounds(550, 162, 100, 100);
        ss_url.setForeground(Color.BLUE.darker());
        ss_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p.add(ss_url);
        ss2_url = new JLabel();
        ss2_url.setFont(new Font("Segoe UI", 1, 14));
        ss2_url.setText("S.S. Natural");
        ss2_url.setBounds(550, 212, 100, 100);
        ss2_url.setForeground(Color.BLUE.darker());
        ss2_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        p.add(ss2_url);
        oct_url = new JLabel();
        oct_url.setFont(new Font("Segoe UI", 1, 14));
        oct_url.setText("Octant Pen");
        oct_url.setBounds(550, 262, 100, 100);
        oct_url.setForeground(Color.BLUE.darker());
        p.add(oct_url);
        gold_url = new JLabel();
        gold_url.setFont(new Font("Segoe UI", 1, 14));
        gold_url.setText("Goldex Pen");
        gold_url.setBounds(550, 312, 100, 100);
        gold_url.setForeground(Color.BLUE.darker());
        p.add(gold_url);
        cell_url = new JLabel();
        cell_url.setFont(new Font("Segoe UI", 1, 14));
        cell_url.setText("Cello Butterflow");
        cell_url.setBounds(550, 362, 100, 100);
        cell_url.setForeground(Color.BLUE.darker());
        p.add(cell_url);

        jcart = new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        jcart.addActionListener(this);
        p.add(jcart);
        jcb_ss = new JCheckBox("S.S. Pinlong pen @ Rs.4/pen.");
        jcb_ss.setBounds(100, 200, 300, 20);
        ss_quan = new JTextField("0");
        ss_quan.setBounds(450, 200, 60, 20);
        ss_quan.setEnabled(false);
        jcb_ss2 = new JCheckBox("S.S. Natural pen @ Rs.2.5/pen.");
        jcb_ss2.setBounds(100, 250, 300, 20);
        ss2_quan = new JTextField("0");
        ss2_quan.setBounds(450, 250, 60, 20);
        ss2_quan.setEnabled(false);
        jcb_oct = new JCheckBox("Octant dark pen @ Rs.10/pen.");
        jcb_oct.setBounds(100, 300, 300, 20);
        oct_quan = new JTextField("0");
        oct_quan.setBounds(450, 300, 60, 20);
        oct_quan.setEnabled(false);
        jcb_gold = new JCheckBox("Goldex pen @ Rs.7/pen.");
        jcb_gold.setBounds(100, 350, 300, 20);
        gold_quan = new JTextField("0");
        gold_quan.setBounds(450, 350, 60, 20);
        gold_quan.setEnabled(false);
        jcb_cell = new JCheckBox("Cello Butterflow pen @ Rs.20/pen.");
        jcb_cell.setBounds(100, 400, 300, 20);
        cell_quan = new JTextField("0");
        cell_quan.setBounds(450, 400, 60, 20);
        cell_quan.setEnabled(false);
        p.add(jcb_ss);
        p.add(ss_quan);
        p.add(jcb_ss2);
        p.add(ss2_quan);
        p.add(jcb_oct);
        p.add(oct_quan);
        p.add(jcb_gold);
        p.add(gold_quan);
        p.add(jcb_cell);
        p.add(cell_quan);
        add_cart = new JButton("Add To Cart");
        add_cart.addActionListener(this);
        check_dir = new JButton("Check Out to Buy.");
        add_cart.setBounds(70, 450, 150, 20);
        check_dir.setBounds(250, 450, 150, 20);
        ss_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://m.media-amazon.com/images/I/81mgyV4aCbL.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        ss2_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://admin.bulkomatrix.com/uploads/2022/11/ss.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        oct_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://itcstore.in/cdn/shop/products/B00WOOYRVS.PT01_1eeb379e-7edc-40c4-b572-dfb8e1386d32_grande.jpg?v=1669991447"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        gold_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.quickpantry.in/cdn/shop/products/goldex-8005-original-imafvgwz3gzhtgsf_612x553.jpg?v=1621714497"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        cell_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.cellowriting.com/public/uploads/items/gallery/Butterflow_59dde3cacc8d5.png"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        jcb_ss.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jcb_ss.isSelected()) {
                    ss_quan.setEnabled(true);
                } else {
                    ss_quan.setEnabled(false);
                }
            }
        });
        jcb_ss2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e2) {
                if (jcb_ss2.isSelected()) {
                    ss2_quan.setEnabled(true);
                } else {
                    ss2_quan.setEnabled(false);
                }
            }
        });
        jcb_oct.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jcb_oct.isSelected()) {
                    oct_quan.setEnabled(true);
                } else {
                    oct_quan.setEnabled(false);
                }
            }
        });
        jcb_gold.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jcb_gold.isSelected()) {
                    gold_quan.setEnabled(true);
                } else {
                    gold_quan.setEnabled(false);
                }
            }
        });
        jcb_cell.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (jcb_cell.isSelected()) {
                    cell_quan.setEnabled(true);
                } else {
                    cell_quan.setEnabled(false);
                }
            }
        });
        p.add(add_cart);
        p.add(check_dir);   // after next is carried forward to darshan
        check_dir.addActionListener(this);  // after next is carried forward to darshan
        pen_back = new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\penbacknew.jpg"));
        pen_back.setSize(1280, 720);
        p.add(pen_back);
        jcart.addActionListener(this);
        p.setExtendedState(JFrame.MAXIMIZED_BOTH);
        p.setLayout(null);
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jcart) {
            // Show the cart page when the "Shopping Cart" button is clicked
            CartPage cartPage = new CartPage(cartListModel);
            cartPage.setVisible(true);
        }

        if (e.getSource() == add_cart) {
            // Add items to the shopping cart list model
            if (jcb_ss.isSelected()) {
                int quantity = Integer.parseInt(ss_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("S.S. PinLong - " + quantity + " @ Rs.4/pen");
                }
            }

            if (jcb_ss2.isSelected()) {
                int quantity = Integer.parseInt(ss2_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("S.S. Natural - " + quantity + " @ Rs.2.5/pen");
                }
            }

            if (jcb_oct.isSelected()) {
                int quantity = Integer.parseInt(oct_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Octant dark - " + quantity + " @ Rs.10/pen");
                }
            }

            if (jcb_gold.isSelected()) {
                int quantity = Integer.parseInt(gold_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Goldex - " + quantity + " @ Rs.7/pen");
                }
            }

            if (jcb_cell.isSelected()) {
                int quantity = Integer.parseInt(cell_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Cello Butterflow - " + quantity + " @ Rs.20/pen");
                }
            }

            // Notify the user that items have been added to the cart
            JOptionPane.showMessageDialog(p, "Item(s) added to cart.");
        }
        if(e.getSource() == check_dir)
        {

            float total_amount_pen = 0;
            String msg = "";
            if (jcb_ss.isSelected()) {
                int a;
                String s1 = ss_quan.getText();
                a = Integer.parseInt(s1);
                total_amount_pen += (4 * a);
                msg = "S.S. PinLong @ Rs.4/pen * " + s1 + "\n";
            }
            if (jcb_ss2.isSelected()) {
                int b;
                String s2 = ss2_quan.getText();
                b = Integer.parseInt(s2);
                total_amount_pen += (2.5 * b);
                msg += "S.S. Natural @ Rs.2.5/pen * " + s2 + "\n";
            }
            if (jcb_oct.isSelected()) {
                int c;
                String s3 = oct_quan.getText();
                c = Integer.parseInt(s3);
                total_amount_pen += (10 * c);
                msg += "Octant dark pen @ Rs.10/pen * " + s3 + "\n";
            }
            if (jcb_gold.isSelected()) {
                int d;
                String s4 = gold_quan.getText();
                d = Integer.parseInt(s4);
                total_amount_pen += (7 * d);
                msg += "Goldex pen @ Rs.7/pen * " + s4 + "\n";
            }
            if (jcb_cell.isSelected()) {
                int f;
                String s5 = cell_quan.getText();
                f = Integer.parseInt(s5);
                total_amount_pen += (20 * f);
                msg += "Cello Butterflow pen @ Rs.20/pen * " + s5 + "\n";
            }
            msg += "-------------\n";
            JOptionPane.showMessageDialog(p, msg + "Total: " + total_amount_pen);
        }

        }
    }

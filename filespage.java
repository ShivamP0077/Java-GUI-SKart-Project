import javax.swing.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.*;
import java.io.*;
//import java.net.*;
public class filespage implements ActionListener{
    JFrame fp;

    float total_amount_pen=0;
    JLabel pl,list,quan,pen_back,urllink,ss_url,ss2_url,oct_url,gold_url,cell_url;
    JButton add_cart,check_dir,jcart;
    JCheckBox jcb_ss,jcb_ss2,jcb_oct,jcb_gold,jcb_cell;
    JTextField ss_quan,ss2_quan,oct_quan,gold_quan,cell_quan;
    filespage(){
        fp=new JFrame("Files Items..");
        pl=new JLabel();
        pl.setFont(new Font("Segoe UI", 1, 36));
        pl.setText("Available Files And Folder...");
        pl.setForeground(Color.BLACK);
        pl.setBounds(450, 25, 350, 100);
        fp.add(pl);
        list=new JLabel();
        list.setFont(new Font("Segoe UI", 1, 16));
        list.setText("Here are the list of available pens....");
        list.setForeground(Color.YELLOW);
        list.setBounds(100, 130, 350, 100);
        fp.add(list);
        quan=new JLabel();
        quan.setFont(new Font("Segoe UI", 1, 16));
        quan.setText("Quantity");
        quan.setForeground(Color.YELLOW);
        quan.setBounds(450, 130, 100, 100);
        fp.add(quan);
        urllink=new JLabel();
        urllink.setFont(new Font("Segoe UI", 1, 16));
        urllink.setText("Preview");
        urllink.setForeground(Color.YELLOW);
        urllink.setBounds(550, 130, 100, 100);
        fp.add(urllink);
        ss_url=new JLabel();
        ss_url.setFont(new Font("Segoe UI", 1, 14));
        ss_url.setText("Transparent");
        ss_url.setBounds(550, 162, 100, 100);
        ss_url.setForeground(Color.BLUE.darker());
        ss_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fp.add(ss_url);
        ss2_url=new JLabel();
        ss2_url.setFont(new Font("Segoe UI", 1, 14));
        ss2_url.setText("Type1");
        ss2_url.setBounds(550, 212, 100, 100);
        ss2_url.setForeground(Color.BLUE.darker());
        ss2_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fp.add(ss2_url);
        oct_url=new JLabel();
        oct_url.setFont(new Font("Segoe UI", 1, 14));
        oct_url.setText("Type2");
        oct_url.setBounds(550, 262, 100, 100);
        oct_url.setForeground(Color.BLUE.darker());
        fp.add(oct_url);
        gold_url=new JLabel();
        gold_url.setFont(new Font("Segoe UI", 1, 14));
        gold_url.setText("Important");
        gold_url.setBounds(550, 312, 100, 100);
        gold_url.setForeground(Color.BLUE.darker());
        fp.add(gold_url);
        cell_url=new JLabel();
        cell_url.setFont(new Font("Segoe UI", 1, 14));
        cell_url.setText("Plastic");
        cell_url.setBounds(550, 362, 100, 100);
        cell_url.setForeground(Color.BLUE.darker());
        fp.add(cell_url);

        jcart=new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        fp.add(jcart);
        jcart.setVisible(true);
        jcart.setEnabled(true);

        jcb_ss=new JCheckBox("Transparent File @ Rs.20/piece.");
        jcb_ss.setBounds(100, 200, 300, 20);
        ss_quan=new JTextField("0");
        ss_quan.setBounds(450, 200, 60, 20);
        ss_quan.setEnabled(false);
        jcb_ss2=new JCheckBox("Noraml Card Type1 File @ Rs.20/piece.");
        jcb_ss2.setBounds(100, 250, 300, 20);
        ss2_quan=new JTextField("0");
        ss2_quan.setBounds(450, 250, 60, 20);
        ss2_quan.setEnabled(false);
        jcb_oct=new JCheckBox("Normal Card Type2 FIle @ Rs.30/piece.");
        jcb_oct.setBounds(100, 300, 300, 20);
        oct_quan=new JTextField("0");
        oct_quan.setBounds(450, 300, 60, 20);
        oct_quan.setEnabled(false);
        jcb_gold=new JCheckBox("Important Doc File @ Rs.350/piece.");
        jcb_gold.setBounds(100, 350, 300, 20);
        gold_quan=new JTextField("0");
        gold_quan.setBounds(450, 350, 60, 20);
        gold_quan.setEnabled(false);
        jcb_cell=new JCheckBox("Plastic Page Type File @ Rs.5/piece.");
        jcb_cell.setBounds(100, 400, 300, 20);
        cell_quan=new JTextField("0");
        cell_quan.setBounds(450, 400, 60, 20);
        cell_quan.setEnabled(false);
        fp.add(jcb_ss);fp.add(ss_quan);
        fp.add(jcb_ss2);fp.add(ss2_quan);
        fp.add(jcb_oct);fp.add(oct_quan);
        fp.add(jcb_gold);fp.add(gold_quan);
        fp.add(jcb_cell);fp.add(cell_quan);
        add_cart=new JButton("Add To Cart");
        check_dir=new JButton("Check Out to Buy.");
        add_cart.setBounds(70, 450, 150, 20);
        check_dir.setBounds(250, 450, 150, 20);
        ss_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/CA/CO/PC/SELLER-83075148/plastic-files-folders.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        ss2_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://www.towntokri.com/wp-content/uploads/2021/04/paper-folder.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        oct_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://m.media-amazon.com/images/I/61FSpicMyhL.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        gold_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/YJ/YJ/KQ/SELLER-84081798/office-file-folder.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        cell_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://m.media-amazon.com/images/I/61+xWN+STWL._AC_UF1000,1000_QL80_.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        jcb_ss.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_ss.isSelected()){
                    ss_quan.setEnabled(true);
                }
                else{
                    ss_quan.setEnabled(false);
                }
            }
        });
        jcb_ss2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e2){
                if(jcb_ss2.isSelected()){
                    ss2_quan.setEnabled(true);
                }
                else{
                    ss2_quan.setEnabled(false);
                }
            }
        });
        jcb_oct.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_oct.isSelected()){
                    oct_quan.setEnabled(true);
                }
                else{
                    oct_quan.setEnabled(false);
                }
            }
        });
        jcb_gold.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_gold.isSelected()){
                    gold_quan.setEnabled(true);
                }
                else{
                    gold_quan.setEnabled(false);
                }
            }
        });
        jcb_cell.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_cell.isSelected()){
                    cell_quan.setEnabled(true);
                }
                else{
                    cell_quan.setEnabled(false);
                }
            }
        });
        fp.add(add_cart);fp.add(check_dir);   // after next is carried forward to darshan
        check_dir.addActionListener(this); // after next is carried forward to darshan
        jcart.addActionListener(this);    // Make sure this line is present in your constructor

        pen_back=new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\fileback.jpg"));
        pen_back.setSize(1280, 720);
        fp.add(pen_back);
        jcart.addActionListener(this);
        fp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fp.setLayout(null);
        fp.setVisible(true);
        fp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
//        System.out.println("Button clicked");
//        if(e.getSource()==jcart){
//            //  carried forward to darshan
//            float totalAmount = total_amount_pen;
//            DefaultListModel<String> cartModel = null;
//            new CartPage(cartModel, totalAmount);
//        }

        String msg="";
        if(jcb_ss.isSelected()){
            int a;
            String s1=ss_quan.getText();
            a=Integer.parseInt(s1);
            total_amount_pen+=(20*a);
            msg="Transparent File @ Rs.20/piece * "+s1+"\n";
        }
        if(jcb_ss2.isSelected()){
            int b;
            String s2=ss2_quan.getText();
            b=Integer.parseInt(s2);
            total_amount_pen+=(20*b);
            msg+="Noraml Card Type1 File @ Rs.20/piece * "+s2+"\n";
        }
        if(jcb_oct.isSelected()){
            int c;
            String s3=oct_quan.getText();
            c=Integer.parseInt(s3);
            total_amount_pen+=(30*c);
            msg+="Normal Card Type2 FIle @ Rs.30/piece * "+s3+"\n";
        }
        if(jcb_gold.isSelected()){
            int d;
            String s4=gold_quan.getText();
            d=Integer.parseInt(s4);
            total_amount_pen+=(350*d);
            msg+="Important Doc File @ Rs.350/piece * "+s4+"\n";
        }
        if(jcb_cell.isSelected()){
            int f;
            String s5=cell_quan.getText();
            f=Integer.parseInt(s5);
            total_amount_pen+=(5*f);
            msg+="Plastic Page Type File @ Rs.5/piece * "+s5+"\n";
        }
        msg+="-------------\n";
        JOptionPane.showMessageDialog(fp,msg+"Total: "+total_amount_pen);
    }
//    private float calculateTotalAmount() {
//        float totalAmount = 0;
//        if (jcb_ss.isSelected()) {
//            int quantity = Integer.parseInt(ss_quan.getText());
//            totalAmount += (20 * quantity);
//        }
//        if (jcb_ss2.isSelected()) {
//            int quantity = Integer.parseInt(ss2_quan.getText());
//            totalAmount += (20 * quantity);
//        }
//        if (jcb_oct.isSelected()) {
//            int quantity = Integer.parseInt(oct_quan.getText());
//            totalAmount += (30 * quantity);
//        }
//        if (jcb_gold.isSelected()) {
//            int quantity = Integer.parseInt(gold_quan.getText());
//            totalAmount += (350 * quantity);
//        }
//        if (jcb_cell.isSelected()) {
//            int quantity = Integer.parseInt(cell_quan.getText());
//            totalAmount += (5 * quantity);
//        }
//        return totalAmount;
//    }

}
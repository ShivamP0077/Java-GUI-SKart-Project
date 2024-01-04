
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.*;
public class pencilpage implements ActionListener{
    JFrame pen;
    private DefaultListModel<String> cartListModel;
    JLabel pl,list,quan,pencil_back,urllink,apsa_url,nata_url,cam_url,doms_url,pen_url;
    JButton add_cart,check_dir,jcart;
    JCheckBox jcb_apsa,jcb_nata,jcb_cam,jcb_doms,jcb_pen;
    JTextField apsa_quan,nata_quan,cam_quan,doms_quan,pen_quan;
    pencilpage(){
        cartListModel = new DefaultListModel<>();
        pen=new JFrame("Pencil Items..");

        pl=new JLabel();
        pl.setFont(new Font("Segoe UI", 1, 36));
        pl.setText("Available Pencils...");
        pl.setForeground(Color.BLACK);
        pl.setBounds(450, 25, 350, 100);
        pen.add(pl);
        list=new JLabel();
        list.setFont(new Font("Segoe UI", 1, 16));
        list.setText("Here are the list of available pencils..");
        list.setForeground(Color.YELLOW);
        list.setBounds(100, 130, 350, 100);
        pen.add(list);
        quan=new JLabel();
        quan.setFont(new Font("Segoe UI", 1, 16));
        quan.setText("Quantity");
        quan.setForeground(Color.YELLOW);
        quan.setBounds(450, 130, 100, 100);
        pen.add(quan);
        urllink=new JLabel();
        urllink.setFont(new Font("Segoe UI", 1, 16));
        urllink.setText("Preview");
        urllink.setForeground(Color.YELLOW);
        urllink.setBounds(550, 130, 100, 100);
        pen.add(urllink);
        apsa_url=new JLabel();
        apsa_url.setFont(new Font("Segoe UI", 1, 14));
        apsa_url.setText("Apsara");
        apsa_url.setBounds(550, 162, 100, 100);
        apsa_url.setForeground(Color.BLUE.darker());
        apsa_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pen.add(apsa_url);
        nata_url=new JLabel();
        nata_url.setFont(new Font("Segoe UI", 1, 14));
        nata_url.setText("Nataraj");
        nata_url.setBounds(550, 212, 100, 100);
        nata_url.setForeground(Color.BLUE.darker());
        nata_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pen.add(nata_url);
        cam_url=new JLabel();
        cam_url.setFont(new Font("Segoe UI", 1, 14));
        cam_url.setText("Camlin");
        cam_url.setBounds(550, 262, 100, 100);
        cam_url.setForeground(Color.BLUE.darker());
        pen.add(cam_url);
        doms_url=new JLabel();
        doms_url.setFont(new Font("Segoe UI", 1, 14));
        doms_url.setText("Doms");
        doms_url.setBounds(550, 312, 100, 100);
        doms_url.setForeground(Color.BLUE.darker());
        pen.add(doms_url);
        pen_url=new JLabel();
        pen_url.setFont(new Font("Segoe UI", 1, 14));
        pen_url.setText("Pentonic");
        pen_url.setBounds(550, 362, 100, 100);
        pen_url.setForeground(Color.BLUE.darker());
        pen.add(pen_url);


        jcb_apsa=new JCheckBox("Apsara Dark pencil @ Rs.4/pencil.");
        jcb_apsa.setBounds(100, 200, 300, 20);
        jcb_apsa.setForeground(Color.BLACK);
        jcb_apsa.setBackground(Color.WHITE);
        jcb_apsa.setOpaque(true);// Set the background color to white

        apsa_quan=new JTextField("0");
        apsa_quan.setBounds(450, 200, 60, 20);
        apsa_quan.setEnabled(false);
        jcb_nata=new JCheckBox("Nataraj pencil @ Rs.2.5/pencil.");
        jcb_nata.setBounds(100, 250, 300, 20);
        nata_quan=new JTextField("0");
        nata_quan.setBounds(450, 250, 60, 20);
        nata_quan.setEnabled(false);
        jcb_cam=new JCheckBox("Camlin pencil @ Rs.5/pencil.");
        jcb_cam.setBounds(100, 300, 300, 20);
        cam_quan=new JTextField("0");
        cam_quan.setBounds(450, 300, 60, 20);
        cam_quan.setEnabled(false);
        jcb_doms=new JCheckBox("Doms pencil @ Rs.7/pencil.");
        jcb_doms.setBounds(100, 350, 300, 20);
        doms_quan=new JTextField("0");
        doms_quan.setBounds(450, 350, 60, 20);
        doms_quan.setEnabled(false);
        jcb_pen=new JCheckBox("Pentonic pen @ Rs.10/pencil.");
        jcb_pen.setBounds(100, 400, 300, 20);
        pen_quan=new JTextField("0");
        pen_quan.setBounds(450, 400, 60, 20);
        pen_quan.setEnabled(false);
        pen.add(jcb_apsa);pen.add(apsa_quan);
        pen.add(jcb_nata);pen.add(nata_quan);
        pen.add(jcb_cam);pen.add(cam_quan);
        pen.add(jcb_doms);pen.add(doms_quan);
        pen.add(jcb_pen);pen.add(pen_quan);
        add_cart=new JButton("Add To Cart");
        check_dir=new JButton("Check Out to Buy.");
        add_cart.setBounds(70, 450, 150, 20);
        check_dir.setBounds(250, 450, 150, 20);

        jcart=new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        pen.add(jcart);


        apsa_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/SELLER/Default/2022/12/PB/JI/QD/10631898/apsara-pencil.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        nata_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://4.imimg.com/data4/QX/ES/MY-12745475/natraj-pencil-500x500.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        cam_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://www.kokuyocamlin.com/camlin/assets/camlin/pencils-and-accessories/wooden-pencils/box-of-10-pencils/box-of-10-pencils-with-eraser-and-long-point-sharpener/1.JPG"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        doms_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/SELLER/Default/2021/12/SR/XQ/AV/72533377/doms-zoom-triangle-pencil.jpg"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        pen_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://artikate.com/cdn/shop/products/411M-rKbr3L.jpg?v=1658557045"));
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });
        jcb_apsa.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_apsa.isSelected()){
                    apsa_quan.setEnabled(true);
                }
                else{
                    apsa_quan.setEnabled(false);
                }
            }
        });
        jcb_nata.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e2){
                if(jcb_nata.isSelected()){
                    nata_quan.setEnabled(true);
                }
                else{
                    nata_quan.setEnabled(false);
                }
            }
        });
        jcb_cam.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_cam.isSelected()){
                    cam_quan.setEnabled(true);
                }
                else{
                    cam_quan.setEnabled(false);
                }
            }
        });
        jcb_doms.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_doms.isSelected()){
                    doms_quan.setEnabled(true);
                }
                else{
                    doms_quan.setEnabled(false);
                }
            }
        });
        jcb_pen.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(jcb_pen.isSelected()){
                    pen_quan.setEnabled(true);
                }
                else{
                    pen_quan.setEnabled(false);
                }
            }
        });
        pen.add(add_cart);pen.add(check_dir);   // after next is carried forward to darshan
        check_dir.addActionListener(this);  // after next is carried forward to darshan
        pencil_back=new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\pensilbg.jpg"));
        pencil_back.setSize(1280, 720);
        pen.add(pencil_back);
        jcart.addActionListener(this);
        add_cart.addActionListener(this);
        pen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pen.setLayout(null);
        pen.setVisible(true);
        pen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jcart){
            CartPage cartPage = new CartPage(cartListModel);
            cartPage.setVisible(true);
        }
        if (e.getSource() == add_cart) {
            // Add selected items to the cartItems list

            if (jcb_apsa.isSelected()) {
                int quantity = Integer.parseInt(apsa_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Apsara Dark pencil - " + quantity + " @ Rs.4/pencil");
                }
            }

            if (jcb_nata.isSelected()) {
                int quantity = Integer.parseInt(nata_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Nataraj pencil - " + quantity + " @ Rs.2.5/pencil");
                }
            }

            if (jcb_cam.isSelected()) {
                int quantity = Integer.parseInt(cam_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Camlin pencil - " + quantity + " @ Rs.5/pencil");
                }
            }

            if (jcb_doms.isSelected()) {
                int quantity = Integer.parseInt(doms_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Doms pencil - " + quantity + " @ Rs.7/pencil");
                }
            }

            if (jcb_pen.isSelected()) {
                int quantity = Integer.parseInt(pen_quan.getText());
                if (quantity > 0) {
                    cartListModel.addElement("Pentonic pen - " + quantity + " @ Rs.10/pencil");
                }
            }

            // Notify the user that items have been added to the cart
            JOptionPane.showMessageDialog(pen, "Item(s) added to cart.");
        }
        if(e.getSource() == check_dir)
        {
            float total_amount_pen=0;
            String msg="";
            if(jcb_apsa.isSelected()){
                int a;
                String s1=apsa_quan.getText();
                a=Integer.parseInt(s1);
                total_amount_pen+=(4*a);
                msg="Apsara Dark pencil @ Rs.4/pencil * "+s1+"\n";
            }
            if(jcb_nata.isSelected()){
                int b;
                String s2=nata_quan.getText();
                b=Integer.parseInt(s2);
                total_amount_pen+=(2.5*b);
                msg+="Nataraj pencil @ Rs.2.5/pencil. * "+s2+"\n";
            }
            if(jcb_cam.isSelected()){
                int c;
                String s3=cam_quan.getText();
                c=Integer.parseInt(s3);
                total_amount_pen+=(5*c);
                msg+="Camlin pencil @ Rs.5/pencil * "+s3+"\n";
            }
            if(jcb_doms.isSelected()){
                int d;
                String s4=doms_quan.getText();
                d=Integer.parseInt(s4);
                total_amount_pen+=(7*d);
                msg+="Doms pencil @ Rs.7/pencil * "+s4+"\n";
            }
            if(jcb_pen.isSelected()){
                int f;
                String s5=pen_quan.getText();
                f=Integer.parseInt(s5);
                total_amount_pen+=(10*f);
                msg+="Pentonic pen @ Rs.10/pencil * "+s5+"\n";
            }
            msg+="-------------\n";
            JOptionPane.showMessageDialog(pen,msg+"Total: "+total_amount_pen);
        }
    }
}
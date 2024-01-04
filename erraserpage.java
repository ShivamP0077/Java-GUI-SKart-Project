import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.*;
public class erraserpage implements ActionListener{
    JFrame ef;
    JLabel pl,list,quan,pen_back,urllink,ss_url,ss2_url,oct_url,gold_url,cell_url;
    JButton add_cart,check_dir,jcart;
    JCheckBox jcb_ss,jcb_ss2,jcb_oct,jcb_gold,jcb_cell;
    JTextField ss_quan,ss2_quan,oct_quan,gold_quan,cell_quan;
    erraserpage(){
        ef=new JFrame("Erraser Items..");
        pl=new JLabel();
        pl.setFont(new Font("Segoe UI", 1, 36));
        pl.setText("Available Errasers...");
        pl.setForeground(Color.BLACK);
        pl.setBounds(450, 25, 350, 100);
        ef.add(pl);
        list=new JLabel();
        list.setFont(new Font("Segoe UI", 1, 16));
        list.setText("Here are the list of available errasers....");
        list.setForeground(Color.YELLOW);
        list.setBounds(100, 130, 350, 100);
        ef.add(list);
        quan=new JLabel();
        quan.setFont(new Font("Segoe UI", 1, 16));
        quan.setText("Quantity");
        quan.setForeground(Color.YELLOW);
        quan.setBounds(450, 130, 100, 100);
        ef.add(quan);
        urllink=new JLabel();
        urllink.setFont(new Font("Segoe UI", 1, 16));
        urllink.setText("Preview");
        urllink.setForeground(Color.YELLOW);
        urllink.setBounds(550, 130, 100, 100);
        ef.add(urllink);
        ss_url=new JLabel();
        ss_url.setFont(new Font("Segoe UI", 1, 14));
        ss_url.setText("Apsara");
        ss_url.setBounds(550, 162, 100, 100);
        ss_url.setForeground(Color.BLUE.darker());
        ss_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ef.add(ss_url);
        ss2_url=new JLabel();
        ss2_url.setFont(new Font("Segoe UI", 1, 14));
        ss2_url.setText("Doms");
        ss2_url.setBounds(550, 212, 100, 100);
        ss2_url.setForeground(Color.BLUE.darker());
        ss2_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ef.add(ss2_url);
        oct_url=new JLabel();
        oct_url.setFont(new Font("Segoe UI", 1, 14));
        oct_url.setText("Fiber Castel");
        oct_url.setBounds(550, 262, 100, 100);
        oct_url.setForeground(Color.BLUE.darker());
        ef.add(oct_url);
        gold_url=new JLabel();
        gold_url.setFont(new Font("Segoe UI", 1, 14));
        gold_url.setText("Youva");
        gold_url.setBounds(550, 312, 100, 100);
        gold_url.setForeground(Color.BLUE.darker());
        ef.add(gold_url);
        cell_url=new JLabel();
        cell_url.setFont(new Font("Segoe UI", 1, 14));
        cell_url.setText("Nataraj");
        cell_url.setBounds(550, 362, 100, 100);
        cell_url.setForeground(Color.BLUE.darker());
        ef.add(cell_url);

        jcart=new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        ef.add(jcart);
        jcb_ss=new JCheckBox("Apsara Eraser @ Rs.4/piece.");
        jcb_ss.setBounds(100, 200, 300, 20);
        ss_quan=new JTextField("0");
        ss_quan.setBounds(450, 200, 60, 20);
        ss_quan.setEnabled(false);
        jcb_ss2=new JCheckBox("Doms Eraser @ Rs.5/piece.");
        jcb_ss2.setBounds(100, 250, 300, 20);
        ss2_quan=new JTextField("0");
        ss2_quan.setBounds(450, 250, 60, 20);
        ss2_quan.setEnabled(false);
        jcb_oct=new JCheckBox("Fiber Castel Eraser @ Rs.6/piece.");
        jcb_oct.setBounds(100, 300, 300, 20);
        oct_quan=new JTextField("0");
        oct_quan.setBounds(450, 300, 60, 20);
        oct_quan.setEnabled(false);
        jcb_gold=new JCheckBox("Youva Eraser @ Rs.7/piece.");
        jcb_gold.setBounds(100, 350, 300, 20);
        gold_quan=new JTextField("0");
        gold_quan.setBounds(450, 350, 60, 20);
        gold_quan.setEnabled(false);
        jcb_cell=new JCheckBox("Nataraj @ Rs.2/piece.");
        jcb_cell.setBounds(100, 400, 300, 20);
        cell_quan=new JTextField("0");
        cell_quan.setBounds(450, 400, 60, 20);
        cell_quan.setEnabled(false);
        ef.add(jcb_ss);ef.add(ss_quan);
        ef.add(jcb_ss2);ef.add(ss2_quan);
        ef.add(jcb_oct);ef.add(oct_quan);
        ef.add(jcb_gold);ef.add(gold_quan);
        ef.add(jcb_cell);ef.add(cell_quan);
        add_cart=new JButton("Add To Cart");
        check_dir=new JButton("Check Out to Buy.");
        add_cart.setBounds(70, 450, 150, 20);
        check_dir.setBounds(250, 450, 150, 20);
        ss_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://images-eu.ssl-images-amazon.com/images/I/81cEHIOY5DL._AC_UL600_SR600,400_.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://images-eu.ssl-images-amazon.com/images/I/61DwOScfy1S._AC_UL600_SR600,400_.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://images-eu.ssl-images-amazon.com/images/I/61+8RPU2vtL._AC_UL600_SR600,400_.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://images-eu.ssl-images-amazon.com/images/I/61AP3UXobmL._AC_UL300_SR300,200_.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/CB/MR/HD/SELLER-79587102/rubber-eraser.jpg"));
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
        ef.add(add_cart);ef.add(check_dir);   // after next is carried forward to darshan
        check_dir.addActionListener(this);
        // after next is carried forward to darshan
        pen_back=new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\erraserback.jpg"));
        pen_back.setSize(1280, 720);
        ef.add(pen_back);
        jcart.addActionListener(this);
        ef.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ef.setLayout(null);
        ef.setVisible(true);
        ef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jcart){
            //  carried forward to darshan
        }
        float total_amount_pen=0;
        String msg="";
        if(jcb_ss.isSelected()){
            int a;
            String s1=ss_quan.getText();
            a=Integer.parseInt(s1);
            total_amount_pen+=(4*a);
            msg="Apsara Eraser @ Rs.4/pen * "+s1+"\n";
        }
        if(jcb_ss2.isSelected()){
            int b;
            String s2=ss2_quan.getText();
            b=Integer.parseInt(s2);
            total_amount_pen+=(5*b);
            msg+="Doms Erase @ Rs.5/pen * "+s2+"\n";
        }
        if(jcb_oct.isSelected()){
            int c;
            String s3=oct_quan.getText();
            c=Integer.parseInt(s3);
            total_amount_pen+=(6*c);
            msg+="Fiber Castel @ Rs.6/pen * "+s3+"\n";
        }
        if(jcb_gold.isSelected()){
            int d;
            String s4=gold_quan.getText();
            d=Integer.parseInt(s4);
            total_amount_pen+=(7*d);
            msg+="Youva Eraser @ Rs.7/pen * "+s4+"\n";
        }
        if(jcb_cell.isSelected()){
            int f;
            String s5=cell_quan.getText();
            f=Integer.parseInt(s5);
            total_amount_pen+=(2*f);
            msg+="Nataraj Eraser @ Rs.2/pen * "+s5+"\n";
        }
        msg+="-------------\n";
        JOptionPane.showMessageDialog(ef,msg+"Total: "+total_amount_pen);
    }
}
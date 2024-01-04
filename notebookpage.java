import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.*;
public class notebookpage implements ActionListener{
    JFrame np;
    JLabel pl,list,quan,pen_back,urllink,ss_url,ss2_url,oct_url,gold_url,cell_url;
    JButton add_cart,check_dir,jcart;
    JCheckBox jcb_ss,jcb_ss2,jcb_oct,jcb_gold,jcb_cell;
    JTextField ss_quan,ss2_quan,oct_quan,gold_quan,cell_quan;
    notebookpage(){
        np=new JFrame("NoteBooks Items..");
        pl=new JLabel();
        pl.setFont(new Font("Segoe UI", 1, 36));
        pl.setText("Available NoteBoks...");
        pl.setForeground(Color.BLACK);
        pl.setBounds(450, 25, 350, 100);
        np.add(pl);
        list=new JLabel();
        list.setFont(new Font("Segoe UI", 1, 16));
        list.setText("Here are the list of available NoteBooks....");
        list.setForeground(Color.YELLOW);
        list.setBounds(100, 130, 350, 100);
        np.add(list);
        quan=new JLabel();
        quan.setFont(new Font("Segoe UI", 1, 16));
        quan.setText("Quantity");
        quan.setForeground(Color.YELLOW);
        quan.setBounds(450, 130, 100, 100);
        np.add(quan);
        urllink=new JLabel();
        urllink.setFont(new Font("Segoe UI", 1, 16));
        urllink.setText("Preview");
        urllink.setForeground(Color.YELLOW);
        urllink.setBounds(550, 130, 100, 100);
        np.add(urllink);
        ss_url=new JLabel();
        ss_url.setFont(new Font("Segoe UI", 1, 14));
        ss_url.setText("Classmate");
        ss_url.setBounds(550, 162, 100, 100);
        ss_url.setForeground(Color.BLUE.darker());
        ss_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        np.add(ss_url);
        ss2_url=new JLabel();
        ss2_url.setFont(new Font("Segoe UI", 1, 14));
        ss2_url.setText("ClassTime");
        ss2_url.setBounds(550, 212, 100, 100);
        ss2_url.setForeground(Color.BLUE.darker());
        ss2_url.setCursor(new Cursor(Cursor.HAND_CURSOR));
        np.add(ss2_url);
        oct_url=new JLabel();
        oct_url.setFont(new Font("Segoe UI", 1, 14));
        oct_url.setText("Neel");
        oct_url.setBounds(550, 262, 100, 100);
        oct_url.setForeground(Color.BLUE.darker());
        np.add(oct_url);
        gold_url=new JLabel();
        gold_url.setFont(new Font("Segoe UI", 1, 14));
        gold_url.setText("Ambition");
        gold_url.setBounds(550, 312, 100, 100);
        gold_url.setForeground(Color.BLUE.darker());
        np.add(gold_url);
        cell_url=new JLabel();
        cell_url.setFont(new Font("Segoe UI", 1, 14));
        cell_url.setText("Nataraj");
        cell_url.setBounds(550, 362, 100, 100);
        cell_url.setForeground(Color.BLUE.darker());
        np.add(cell_url);

        jcart=new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        np.add(jcart);
        jcb_ss=new JCheckBox("Classmate NoteBook @ Rs.60/piece.");
        jcb_ss.setBounds(100, 200, 300, 20);
        ss_quan=new JTextField("0");
        ss_quan.setBounds(450, 200, 60, 20);
        ss_quan.setEnabled(false);
        jcb_ss2=new JCheckBox("Classtime NoteBook @ Rs.55/piece.");
        jcb_ss2.setBounds(100, 250, 300, 20);
        ss2_quan=new JTextField("0");
        ss2_quan.setBounds(450, 250, 60, 20);
        ss2_quan.setEnabled(false);
        jcb_oct=new JCheckBox("Neel NoteBook @ Rs.40/piece.");
        jcb_oct.setBounds(100, 300, 300, 20);
        oct_quan=new JTextField("0");
        oct_quan.setBounds(450, 300, 60, 20);
        oct_quan.setEnabled(false);
        jcb_gold=new JCheckBox("Ambitious NoteBook @ Rs.50/piece.");
        jcb_gold.setBounds(100, 350, 300, 20);
        gold_quan=new JTextField("0");
        gold_quan.setBounds(450, 350, 60, 20);
        gold_quan.setEnabled(false);
        jcb_cell=new JCheckBox("Nataraj NoteBook @ Rs.35/piece.");
        jcb_cell.setBounds(100, 400, 300, 20);
        cell_quan=new JTextField("0");
        cell_quan.setBounds(450, 400, 60, 20);
        cell_quan.setEnabled(false);
        np.add(jcb_ss);np.add(ss_quan);
        np.add(jcb_ss2);np.add(ss2_quan);
        np.add(jcb_oct);np.add(oct_quan);
        np.add(jcb_gold);np.add(gold_quan);
        np.add(jcb_cell);np.add(cell_quan);
        add_cart=new JButton("Add To Cart");
        check_dir=new JButton("Check Out to Buy.");
        add_cart.setBounds(70, 450, 150, 20);
        check_dir.setBounds(250, 450, 150, 20);
        ss_url.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/ZQ/ZU/WY/SELLER-76577611/classmate-notebook.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/ANDROID/Default/2021/7/FO/CM/KU/130959406/product-jpeg-500x500.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://m.media-amazon.com/images/I/61v+bjcxqgL._AC_UF1000,1000_QL80_.jpg"));
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
                    Desktop.getDesktop().browse(new URI("https://trison.in/cdn/shop/products/AmbitionRegister4.png?v=1653982209&width=1445"));
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
                    Desktop.getDesktop().browse(new URI("https://5.imimg.com/data5/SELLER/Default/2021/1/NY/GQ/FY/57734199/nataraj-spider-print-notebook.jpg"));
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
        np.add(add_cart);np.add(check_dir);   // after next is carried forward to darshan
        check_dir.addActionListener(this);  // after next is carried forward to darshan
        pen_back=new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\notebookback.jpg"));
        pen_back.setSize(1280, 700);
        np.add(pen_back);
        jcart.addActionListener(this);
        np.setExtendedState(JFrame.MAXIMIZED_BOTH);
        np.setLayout(null);
        np.setVisible(true);
        np.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
            total_amount_pen+=(60*a);
            msg="Classmate NoteBook @ Rs.60/piece * "+s1+"\n";
        }
        if(jcb_ss2.isSelected()){
            int b;
            String s2=ss2_quan.getText();
            b=Integer.parseInt(s2);
            total_amount_pen+=(55*b);
            msg+="Classtime NoteBook @ Rs.55/piece * "+s2+"\n";
        }
        if(jcb_oct.isSelected()){
            int c;
            String s3=oct_quan.getText();
            c=Integer.parseInt(s3);
            total_amount_pen+=(40*c);
            msg+="Neel NoteBook @ Rs.40/piece * "+s3+"\n";
        }
        if(jcb_gold.isSelected()){
            int d;
            String s4=gold_quan.getText();
            d=Integer.parseInt(s4);
            total_amount_pen+=(50*d);
            msg+="Ambitious NoteBook @ Rs.50/piece * "+s4+"\n";
        }
        if(jcb_cell.isSelected()){
            int f;
            String s5=cell_quan.getText();
            f=Integer.parseInt(s5);
            total_amount_pen+=(35*f);
            msg+="Nataraj NoteBook @ Rs.35/piece * "+s5+"\n";
        }
        msg+="-------------\n";
        JOptionPane.showMessageDialog(np,msg+"Total: "+total_amount_pen);
    }
}
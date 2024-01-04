import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
public class itempage implements ActionListener{
    private DefaultListModel<String> cartListModel;
    JFrame f;
    JLabel lb,bg;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jcart;
    itempage(){
        cartListModel = new DefaultListModel<>();

        f=new JFrame("Scart Stationary Items");
        lb=new JLabel();
        lb.setFont(new Font("Segoe UI", 1, 36));
        lb.setText("Stationary Items");
        lb.setBounds(450, 25, 350, 100);
        f.add(lb);

        jcart=new JButton("Shopping Cart", new ImageIcon("D:\\project\\Scart Project\\Photos\\cartlogonew.jpg"));
        jcart.setBounds(950, 60, 178, 166);
        f.add(jcart);    // cart button
        jcart.addActionListener(this);
        jb1=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\newpen.jpg"));
        jb1.setBounds(80, 200, 159, 158);
        f.add(jb1);      // pen button
        jb1.addActionListener(this);
        jb2=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\pencil.jpeg"));
        jb2.setBounds(320, 200, 160, 158);
        f.add(jb2);      // pencil button
        jb2.addActionListener(this);
        jb3=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\erraser.jpeg"));
        jb3.setBounds(550, 200, 163, 161);
        f.add(jb3);     // erraser button
        jb3.addActionListener(this);
        jb4=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\xeroxnew.jpg"));
        jb4.setBounds(80, 380, 160,160);
        f.add(jb4);     // xerox button
        jb4.addActionListener(this);
        jb5=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\school-notebook.jpg"));
        jb5.setBounds(320, 380, 140,168);
        f.add(jb5);     //notebooks button
        jb5.addActionListener(this);
        jb6=new JButton(new ImageIcon("D:\\project\\Scart Project\\Photos\\files.jpg"));
        jb6.setBounds(550, 380, 160,111);
        f.add(jb6);   // files button
        bg = new JLabel(new ImageIcon("D:\\project\\Scart Project\\Photos\\item-back.jpg"));
        bg.setSize(1280,720);
        f.add(bg);
        jb6.addActionListener(this);
        f.setLayout(null);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb1){
            new penpage();
        }
        else if(e.getSource()==jb2){
            new pencilpage();
        }
        else if(e.getSource()==jb3){
            new erraserpage();
        }
        else if(e.getSource()==jb4){
            new xeroxpage();
        }
        else if(e.getSource()==jb5){
            new notebookpage();
        }
        else if(e.getSource()==jb6){
            new filespage();
        }
       else if(e.getSource() == jcart) {

            CartPage cartPage = new CartPage(cartListModel);
            cartPage.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new itempage();
    }
}
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class xeroxpage implements ActionListener{
    JFrame x,y;
    JLabel xt;  static JLabel l;
    JPanel jp;
    JButton chf,upf;
    xeroxpage(){
        x=new JFrame("Xerox the Files");
        xt=new JLabel();
        xt.setFont(new Font("Segoe UI", 1, 36));
        xt.setText("Choose Your Files And Upload Here..");
        xt.setForeground(Color.BLACK);
        xt.setBounds(300, 15, 650, 50);
        x.add(xt);
        jp=new JPanel();
        jp.setBounds(20,80,1100,650);
        jp.setBackground(Color.WHITE);
        x.add(jp);
        x.setBackground(Color.LIGHT_GRAY);
        chf=new JButton("Choose File");
        chf.setBounds(50, 100, 80, 30);
        upf=new JButton("Upload Files");
        upf.setBounds(100, 100, 80, 30);
        jp.add(chf);jp.add(upf);
        chf.addActionListener(this);
        upf.addActionListener(this);
        l=new JLabel("No File Selected..");
        l.setBounds(70, 150, 750, 50);
        jp.add(l);
        x.setSize(1200,800);
        x.setLayout(null);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String com=e.getActionCommand();
        if(com.equals("Choose File")){
            JFileChooser jf=new JFileChooser(FileSystemView.getFileSystemView());
            int r=jf.showOpenDialog(null);  ///change
            if(r==JFileChooser.APPROVE_OPTION){
                l.setText(jf.getSelectedFile().getAbsolutePath());
            }
            else{
                l.setText("The user cancelled the operation");
            }
        }
        else{
            int i=0;
            JProgressBar pb=new JProgressBar(0, 2000);
            pb.setBounds(40, 40, 160, 30);
            pb.setValue(0);
            pb.setStringPainted(true);
            y=new JFrame("Uploading");
            y.add(pb);
            while(i<=2000){
                pb.setValue(i);
                i=i+20;
                try{
                    Thread.sleep(150);
                }
                catch(Exception r){}
            }
            y.setSize(250, 150);
            y.setVisible(true);
            y.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   
        }
    }
}

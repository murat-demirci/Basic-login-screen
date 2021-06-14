import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Giris {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel p=new JPanel();
        f.setBounds(200,200,500,500);
        f.setTitle("Administer");
        Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\demur\\Desktop\\indir.png");
        JPasswordField password=new JPasswordField();
        password.setBounds(150,300,150,30);
        JTextField t=new JTextField();
        t.setBounds(150,250,150,30);
        JLabel l1,l2,l3;
        l1=new JLabel("Name");
        l1.setBounds(100,250,90,30);
        l1.setFont(new Font("Cambriga",Font.BOLD,16));
        l2=new JLabel("Password");
        l2.setBounds(70,300,90,30);
        l2.setFont(new Font("Cambriga",Font.BOLD,16));
        l3=new JLabel(new ImageIcon("C:\\Users\\demur\\Desktop\\indir.png"));
        l3.setBounds(115,0,225,225);
        f.add(password);f.add(p);
         f.add(t); f.add(l1); f.add(l2); f.add(l3);
        f.setIconImage(im);
        f.setLayout(null);
        p.setLayout(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

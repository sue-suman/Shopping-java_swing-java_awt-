import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Shopseeweb extends JFrame implements ActionListener {
    JButton button,button1,button2,button3;
    DBConnection c = null;
    Shopseeweb(){
        setLayout(null);
        setSize(990, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Shopswoon ");

        setLocation(250, 65);

        JLabel text=new JLabel("WELCOME TO SHOPSWOON");
        text.setBounds(270,60,500,50);
        text.setFont(new Font("Railway",Font.BOLD,30));
        add(text);

        JLabel text0=new JLabel("RESEARCH YOUR OPTIONS ");
        text0.setBounds(280,90,400,50);
        text0.setFont(new Font("Railway",Font.BOLD,20));
        add(text0);

        getContentPane().setBackground(Color.pink);

        button = new JButton("MOBILE");
        button.setBounds(200, 200, 200, 100);
        button.setFont(new Font("OSWALD", Font.BOLD, 30));
        Color bgc = new Color(252, 108, 133);
        button.setBackground(bgc);
        button.addActionListener(this);
        add(button);


        button1 = new JButton("TRIPODS");
        button1.setBounds(560, 200, 200, 100);
        button1.setFont(new Font("OSWALD", Font.BOLD, 30));
        button1.setBackground(bgc);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("LIGHTS");
        button2.setBounds(200, 370, 200, 100);
        button2.setFont(new Font("OSWALD", Font.BOLD, 30));
        button2.setBackground(bgc);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("CAMERA");
        button3.setBounds(560, 370, 200, 100);
        button3.setFont(new Font("OSWALD", Font.BOLD, 30));
        button3.setBackground(bgc);
        button3.addActionListener(this);
        add(button3);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == button) {
            setVisible(false);
            new display_m().setVisible(true);
        } else if (ae.getSource() == button1) {
            setVisible(false);
            new display_t().setVisible(true);
        } else if (ae.getSource() == button2) {
            setVisible(false);
            new display_l().setVisible(true);
        } else if (ae.getSource() == button3) {
            setVisible(false);
            new display_c().setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Shopseeweb();
    }


}


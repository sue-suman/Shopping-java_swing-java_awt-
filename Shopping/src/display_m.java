import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.*;

public class display_m extends JFrame implements ActionListener{
    JButton button,button0;
    private DBConnection c;
    private Statement stm;
    private JTable productListTable;
    private DefaultTableModel tableModel;
    public display_m() {
        setLayout(null);
        setSize(990, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(" OPTIONS :");
        setLocation(250, 65);
        getContentPane().setBackground(Color.pink);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel tf = new JLabel("*******MOBILE*******");
        tf.setBounds(50, 80, 400, 50);
        tf.setFont(new Font("OSWALD", Font.BOLD, 20));
        add(tf);

        button=new JButton(" SHOW ");
        button.setBounds(50, 250, 150, 50);
        button.setFont(new Font("OSWALD", Font.BOLD, 20));
        Color bgc = new Color(196, 78, 98);
        button.setBackground(bgc);
        button.addActionListener(this);
        add(button);

        String[] columnNames = {"M_ID","M_NAME","M_DESCRIPTION","M_COST"};
        tableModel = new DefaultTableModel(columnNames, 0);
        productListTable = new JTable(tableModel);

        productListTable.setFont(new Font(productListTable.getFont().getName(), Font.PLAIN, 12));

        //ADDING INPUT.
        JScrollPane scrollPane = new JScrollPane(productListTable);
        scrollPane.setPreferredSize(new Dimension(900, 500)); // Adjust size of scroll pane
        add(scrollPane);

        button0 = new JButton("Back");
        button0.setBounds(600, 600, 150, 50);
        button0.setFont(new Font("OSWALD", Font.BOLD, 20));
        button0.setBackground(bgc);
        button0.addActionListener(this);
        add(button0);

        try {
            c=new DBConnection();
            stm= c.conn.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            disp();
        }else if (e.getSource() == button0) {
            setVisible(false);
            new Shopseeweb().setVisible(true);
        }
    }
    private void disp(){
        tableModel.setRowCount(0); // Clear the table
        try {
            ResultSet resultSet = stm.executeQuery("SELECT * FROM mobile");
            while (resultSet.next()) {
                int id = resultSet.getInt("M_ID");
                String name = resultSet.getString("M_NAME");
                String description = resultSet.getString("M_DESCRIPTION");
                double price = resultSet.getDouble("M_COST");
                tableModel.addRow(new Object[]{id, name, description, price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        new display_m();
    }


}
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.event.*;

public class display_t extends JFrame implements ActionListener {
    JButton button1,button0;
    private DBConnection c;
    private Statement stm;
    private JTable productListTable;
    private DefaultTableModel tableModel;
    public display_t(){
        setLayout(null);
        setSize(990, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(" OPTIONS :");
        setLocation(250, 65);
        getContentPane().setBackground(Color.pink);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel tf = new JLabel("*******TRIPODS*******");
        tf.setBounds(50, 80, 400, 50);
        tf.setFont(new Font("OSWALD", Font.BOLD, 20));
        add(tf);

        button1=new JButton(" SHOW ");
        button1.setBounds(50, 250, 150, 50);
        button1.setFont(new Font("OSWALD", Font.BOLD, 20));
        Color bgc = new Color(196, 78, 98);
        button1.setBackground(bgc);
        button1.addActionListener(this);
        add(button1);

        String[] columnNames = {"T_ID","T_NAME","T_DESCRIPTION","T_COST"};
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
        if (e.getSource() == button1) {
            disp1();
        }else if (e.getSource() == button0) {
            setVisible(false);
            new Shopseeweb().setVisible(true);
        }
    }
    private void disp1() {
        tableModel.setRowCount(0); // Clear the table
        try {
            ResultSet resultSet = stm.executeQuery("SELECT * FROM tripods");
            while (resultSet.next()) {
                int id = resultSet.getInt("T_ID");
                String name = resultSet.getString("T_NAME");
                String description = resultSet.getString("T_DESCRIPTION");
                double price = resultSet.getDouble("T_COST");
                tableModel.addRow(new Object[]{id, name, description, price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new display_t();
    }

}

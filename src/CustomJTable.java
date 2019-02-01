import javax.swing.JTable; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import java.awt.BorderLayout; 
import java.awt.Dimension;
public class CustomJTable extends JFrame implements ActionListener { 
   private StockTableModel tableModel; 
   private JTable table; 
   private StockList myList;
   public CustomJTable(String title) { 
      super(title); 
      setBounds(10,10,400,300); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myList = new StockList();
      tableModel = new StockTableModel(myList); 
      table = new JTable(tableModel); 
      table.setAutoCreateRowSorter(true);
      JScrollPane scrollPane = new JScrollPane(table); 
      scrollPane.setPreferredSize(new Dimension(380,280)); 
      JPanel panel = new JPanel(); 
      panel.add(scrollPane); 
      add(panel,BorderLayout.CENTER); 
   } 
   public void actionPerformed(ActionEvent ae) { 
    
   } 
   public static void main(String[] args) { 
      CustomJTable myApp = new CustomJTable("Custom JTable"); 
      myApp.setVisible(true); 
   } 
}

 
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 
public class Main {
 
    public static void main(String[] args) {
        final JFrame frame = new JFrame("JTable Demo");
 
        /*String[] columns = {"Code", "Name", "High", "Low",
                            "Close", "Volume", "Change","Change %"};
 
        // Array mit starren Werten gefüllt. Für dynamische Werte müsste das API hier eingelesen werden.
        
        Object[][] data = {
            {"MBF", "CITYGROUP", 10.16, 10.16, 10.16, 200, 0.08,0.79},
            {"MBL", "BANK OF AMERICA", 12.66, 12.66, 12.66, 6600, 0.13,1.04},
            {"MJP", "Morgan Stanley Dean Witter & Co.", 24.97, 24.97, 24.97, 1000, -0.04,-0.16},
            {"UBSN", "Union de Banques Suisse", 12.50, 15.00, 13.00, 2000, -0.04,-0.16},
            {"SREN", "SwissRe", 95.55, 101.50, 100.00, 5500,-0.05, -0.36},
            {"ABBN", "Asea Brown Boveri", 19.50, 17.30, 18.80, 6000, 0.03, 0.79},
            {"ADEN", "Adecco", 50.50,  48.30, 50.26, 10000, 0.05,-0.09}
            
        };*/
        
        StockList myList = new StockList();
        StockTableModel tableModel = new StockTableModel(myList); 
 
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
											
				 System.out.println((e.getSource()));
				 /*public double getFirstIndex();
				 public double getSecondIndex();
				 public int getThirdIndex();*/
				// TODO Auto-generated method stub
				//e.getSource();
				//System.out.println(e);
				System.out.print(table.getValueAt(table.getSelectedRow(), 0).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 1).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 2).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 3).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 4).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 5).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 6).toString());
				System.out.print(table.getValueAt(table.getSelectedRow(), 7).toString());
			}
		});
 
        JLabel lblHeading = new JLabel("Stock Quotes");
        lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));
 
        frame.getContentPane().setLayout(new BorderLayout());
 
        frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
        frame.getContentPane().add(scrollPane,BorderLayout.CENTER);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 200);
        frame.setVisible(true);
    }
}
/*Previous Tutorial: How to Create ToolBar by Using JToolBar
Getting Started

    Introduction to Java Swing
    Developing the First Swing Application

Layout Manager

    Java Swing Layouts
    BorderLayout
    FlowLayout
    GridLayout
    GridBagLayout
    CardLayout

Basic Components

    JButton
    JToggleButton
    JCheckBox
    JRadioButton
    JLabel
    JTextField
    JTextArea
    JEditorPane
    JSpinner
    JComboBox
    JList
    JPasswordField
    JScrollBar
    JProgressBar
    JSlider

Java Swing Dialogs

    Java Swing Dialog
    JColorChooser
    JFileChooser
    JOptionPane
    Creating Login Dialog
    Creating Menu
    Popup Menu
    ToolBar
    Displaying Data using JTable

Return to top of page

Copyright © 2019 by ZenTut Website. All Rights Reserved.*/

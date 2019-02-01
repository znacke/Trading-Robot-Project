import javax.swing.table.AbstractTableModel; 
import java.util.ArrayList; 
public class StockTableModel extends AbstractTableModel { 
   private String[] columnNames = {"Code", "Name", "High", "Low", "Close", "Volume", "Chage", "ChangeP"}; 
   private ArrayList<Stock> myList; 
   public StockTableModel(StockList StList) { 
      myList = StList.getStocks(); 
   } 
   public int getColumnCount() { 
      return columnNames.length; 
   } 
   public int getRowCount() { 
      int size; 
      if (myList == null) { 
         size = 0; 
      } 
      else { 
         size = myList.size(); 
      } 
      return size; 
   } 
   public Object getValueAt(int row, int col) { 
      Object temp = null; 
      if (col == 0) { 
         temp = myList.get(row).getCode(); 
      } 
      else if (col == 1) { 
         temp = myList.get(row).getName();
      } 
      else if (col == 2) {                
         temp = myList.get(row).getHigh();
      }   
       else if (col == 3) {                
          temp = myList.get(row).getLow();
       }  
       else if (col == 4) {                  
    	   temp = myList.get(row).getClose();
       } 
        else if (col == 5) {                
           temp = myList.get(row).getVolume();
        }
      
        else if (col == 6) {                
            temp = myList.get(row).getChange();
        //Berechne die Differenz zwischen Open/High und Close:
            
            return temp = getHigh() - getClose();
        
        }
       

       else if (col == 7) {                 
          temp = myList.get(row).getChangeP(); 
          	
       //Berechne den prozentualen Anteil:
          
       
       
       }    
      return temp; //Fuelle alle Felder
   } 
   // needed to show column names in JTable 
   public String getColumnName(int col) { 
      return columnNames[col]; 
   } 
   public Class<?> getColumnClass(int col) { 
      if (col == 0 || col == 1) { 
         return String.class;

      }      
      else { 
         return Double.class; //Datentyp definieren
      } 
   } 
}
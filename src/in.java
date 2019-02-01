    About Us
    Request a Tutorial
    Contact Us
    Advertising
    Privacy Policy

ZenTut

Programming Made Easy

    Home
    SQL
    Data Warehouse
    Data Mining
    PHP
        PHP PDO
    C
    JavaScript
    Java Swing
    JSP
    Python

Home / Java Swing / How to Use JTable to Display Data
How to Use JTable to Display Data

In this tutorial, you will learn how to create table for displaying tabular data using JTable class in Java swing application.

JTable class represents Swing table component. JTable provides rich functionality for managing appearance and behavior of the table component. JTable directly extends JComponent and implements several model listener interfaces such as TableModelListener, TableColumnModelListener, ListSelectionListener… etc. JTable also implements scrollable interface therefore table is usually placed in a JScrollPane.

Each JTable has three models TableModel, TableColumnModel, and ListSelectionModel.

    TableModel is used to specify how the table’s data is stored and retrieval of this data. JTable’s data is often in two-dimensional structure such as a two-dimension array or a Vector of Vectors.  TableModel also is used to specify how data can be editable in the Table.
    TableColumnModel is used to manage all TableColumn in term of column selection, column order and margin size.
    ListSelectionModel allows table to have different mode of selection such as single, single interval and multiple interval selections.

We can create a table by using its constructors as follows:
JTable Constructors	Description
JTable()	Create an empty table
JTable(int rows, int columns)	Create a table with rows and columns empty cell.
JTable(Object[][] data, Object[] heading)	Create a table with data specify in two-dimensional array data and column heading heading
JTable(TableModel dm)	Create a table with a given TableModel
JTable(TableModel dm, TableColumnModel cm)	Create a table with a given TableModel and TableColumnModel.
JTable(TableModel dm,TableColumnModel cm, ListSelectionModel sm)	Create a table with a given TableModel, TableColumnModel, and ListSelectionModel.
JTable(Vector data, Vector heading)	 Create a table with data in vector of Vectors data and column headings headin.
Example of using JTable to display stock quotes

In this example, we will display stock quotes in a table using JTable class.

    First we specify the column heading in the columns array.
    Then we use two-dimensional array data to store stock quotes data.
    Next we create an instance of JTable by passing table data and column heading to the constructor.
    Finally we place the table JScrollPane and add it to the main frame.

Here is the screenshot of the JTable demo application:

JTable Demo
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
	

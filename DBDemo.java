import java.sql.*;
import java.util.Properties;

public class DBDemo
{
  
  private Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedstatement = null;
  private ResultSet resultset = null;
  private String  serial_no []  = new String[6];
  private String problems []  = new String[3];


  public DBDemo(){
    try{
        final String dbClassName = "com.mysql.jdbc.Driver";
        final String CONNECTION = "jdbc:mysql://127.0.0.1/uprint";
        System.out.println(dbClassName);

        // Class.forName(xxx) loads the jdbc classes driver
        Class.forName(dbClassName);

        // Properties for user and password. Here the user and password are both 'paulr'
        Properties p = new Properties();
        p.put("user","abdullahsumbal");
        p.put("password","abc123");

        // set up the connection with the database
        connect = DriverManager.getConnection(CONNECTION,p);

        // Statement allows to issue SQL quiries to the database
        statement = connect.createStatement();

        System.out.println("It works !");
  }
    catch (Exception e){
      System.out.println("unable to connect");
    }
  }

  public void read(){
    try{
        resultset = statement.executeQuery("Select * from uprint.printers");
        int count = 0;
        while(resultset.next()){
            serial_no[count] = resultset.getString(1);
            count++;
       } 
        resultset = statement.executeQuery("Select * from uprint.problems");
        int j = 0;
        while(resultset.next()){
            problems[j] = resultset.getString(1);
            j++;  
      }
    }
      catch (Exception e){
        System.out.println(e);

      }
  }

  public String get_location(String serial){
    
    try{
      String query = "Select * from uprint.printers where serial_no='"+serial+"'";
      resultset = statement.executeQuery(query);
      resultset.next();
      return resultset.getString(2);
    }
    catch(Exception e){
      System.out.println(e);

    }
    return "not found";
  }

  public String [] get_serial_no(){
    return serial_no;
  }

  public String [] get_problems(){
    return problems;
  }
}
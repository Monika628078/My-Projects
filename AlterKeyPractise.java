import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.sql.*;

public class AlterKeyPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/firstproject";
            String user = "root";
            String password = "Sam@6280";
            Connection con = DriverManager.getConnection(url, user,password);
            Statement st = con.createStatement();
            String q = "create table Practise (id int(20), Emp_Name varchar(20), Emp_Contact int(10), Address varchar(20))";
            st.executeUpdate(q);
            System.out.println("table created");

            q = "AlTER table Practise add Emp_Id varchar(20) AFTER Emp_Name";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("table altered successfully");

            q = "ALTER table Practise modify Emp_id varchar(50)";
            ps = con.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("column modified successfully");

            q = "ALTER table Practise drop column id";
            ps = con.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("column dropped successsfully");

            q= "AlTER table Practise rename column Emp_id to id";
            ps = con.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("column renamed successfully");

            q = "ALTER table Practise rename to Emp_Table";
            ps= con.prepareStatement(q);
            ps.executeUpdate();
            System.out.println("table renamed successfully");

        }catch (java.lang.Exception e)
        {
            System.out.println(e);
        }
    }
}

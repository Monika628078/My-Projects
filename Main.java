package Dbms_Practise;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll_no;
        String st_name;
        String course;
        String subjects;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/firstproject";
            String user = "root";
            String password = "Sam@6280";
            Connection con = DriverManager.getConnection(url, user, password);

           // String q="create table MyDatabase (Roll_no int(10) primary key, Student_name varchar(20) not null, Course varchar(20), Subjects varchar(30))";
            Statement stm = con.createStatement();
           // stm.executeUpdate(q);
            System.out.println("***********************************-----------------------------***********************************");
            System.out.println("Table Created Successfully");
            System.out.println("***********************************-----------------------------***********************************");


            String q1 ="insert into MyDatabase (Roll_no, Student_name, Course, Subjects) values(?,?,?,?)";
            PreparedStatement pt = con.prepareStatement(q1);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You have following options to inserting or deleting values from table");
            while(true)
            {
                                  // Manipulation Options

                System.out.println("press 1 for Adding record");
                System.out.println("press 2 for Deleting record");
                System.out.println("press 3 for Updating record");
                System.out.println("press 4 for displaying record");
                System.out.println("press 5 for Exit");
                System.out.println("***********************************-----------------------------***********************************");
                System.out.print("Please Choose One Option = ");
                int choice = sc.nextInt();
                switch (choice)
                {
                    case 1:
                                 // Inserting column_values

                         System.out.println("\n Enter Roll_no of student");
                         roll_no = Integer.parseInt(br.readLine());
                         System.out.println("Enter name of the Student");
                         st_name = br.readLine();
                         System.out.println("Enter name of the course");
                         course = br.readLine();
                         System.out.println("Enter subjects name");
                         subjects = br.readLine();

                         pt.setInt(1,roll_no);
                         pt.setString(2,st_name);
                         pt.setString(3,course);
                         pt.setString(4,subjects);
                         pt.executeUpdate();
                        System.out.println("***********************************-----------------------------***********************************");
                        System.out.println("Inserted.......");
                        System.out.println("database affected.....");
                        System.out.println("***********************************-----------------------------***********************************");
                        break;

                    case 2:

                                       // Getting roll_no from user who's record has to be deleted

                        System.out.println("***********************************-----------------------------***********************************");
                        System.out.print("Enter roll_no and name of student who's record wanted to be deleted = ");
                        System.out.println("***********************************-----------------------------***********************************");
                        int get = sc.nextInt();
                        //String name = sc.nextLine();
                        //stm.executeUpdate(q2);

                                        // Getting values from table and printing

                        String q3 = "select * from MyDatabase where roll_no = " + get;
                        pt = con.prepareStatement(q3);
                        ResultSet rs2 = pt.executeQuery();
                        while(rs2.next())
                        {
                            roll_no = rs2.getInt("Roll_no");
                            st_name = rs2.getString("Student_name");
                            course = rs2.getString("Course");
                            subjects = rs2.getString("Subjects");
                            System.out.println("***********************************-----------------------------***********************************");
                            System.out.println("\n" + roll_no + "\t\t\t" + st_name + "\t\t\t" + course + "\t\t\t" + subjects);
                            System.out.println("***********************************-----------------------------***********************************");
                            break;
                        }
                                        // Asking from user if he want to delete a record or not

                        System.out.println("##############################################-----------------------------##############################################");
                        System.out.println(" do you want to delete this record");
                        System.out.println(" press Y for yes");
                        System.out.println(" press N for no");
                        char ch = sc.next().charAt(0);
                        System.out.println("##############################################-----------------------------##############################################");
                        switch (ch)
                        {
                            case 'Y', 'y':

                                        //  firing delete query

                                String q2 = "delete from MyDatabase where roll_no = " + get;
                                stm.executeUpdate(q2);
                                System.out.println("***********************************-----------------------------***********************************");
                                System.out.println("record deleted");
                                System.out.println("***********************************-----------------------------***********************************");

                            case 'N', 'n':
                                break;
                            default:
                                System.out.println("invalid option");
                        }
                         break;

                    case 3:

                        System.out.print("Enter roll_no to update Specific student's record = ");
                        int rn = sc.nextInt();
                        System.out.println("##############################################-----------------------------##############################################");

                                        // Various record  updation options

                        System.out.println("\n press 1 to update roll_no");
                        System.out.println("press 2 to update st_name");
                        System.out.println("press 3 to update course");
                        System.out.println("press 4 to update subjects");
                        choice = sc.nextInt();
                        System.out.println("##############################################-----------------------------##############################################");
                        switch (choice) {
                            case 1:

                                         // roll_no updating and fire update statement

                                q3 = "update MyDatabase set roll_no=? where roll_no = " + rn;
                                System.out.println("##############################################-----------------------------##############################################");
                                System.out.println("Enter new roll_no");
                                roll_no = Integer.parseInt(br.readLine());
                                pt = con.prepareStatement(q3);
                                pt.setInt(1, roll_no);
                               // pt.setInt(2, rn);
                                pt.executeUpdate();
                                System.out.println("***********************************-----------------------------***********************************");
                                System.out.println("Record updated successfully");
                                System.out.println("***********************************-----------------------------***********************************");
                                //con.close();
                                break;

                            case 2:
                                        // student_name updating and fire update statement

                                q3 = "update MyDatabase set st_name=? where roll_no = " + rn;
                                System.out.println("##############################################-----------------------------##############################################");
                                System.out.println("Enter new st_name");
                                st_name = br.readLine();
                                pt = con.prepareStatement(q3);
                                pt.setString(1, st_name);
                                pt.executeUpdate();
                                System.out.println("***********************************-----------------------------***********************************");
                                System.out.println("Record updated successfully");
                                System.out.println("***********************************-----------------------------***********************************");
                                //con.close();
                                break;

                            case 3:
                                      // course updating and fire update statement

                                 q3 = "update MyDatabase set course =? where roll_no = " + rn;
                                System.out.println("##############################################-----------------------------##############################################");
                                System.out.println("Enter new st_course");
                                course = br.readLine();
                                pt = con.prepareStatement(q3);
                                pt.setString(1, course);
                                pt.executeUpdate();
                                System.out.println("***********************************-----------------------------***********************************");
                                System.out.println("Record updated successfully");
                                System.out.println("***********************************-----------------------------***********************************");

                                //con.close();
                                break;

                            case 4:
                                     // subjects updating and fire update statement

                                 q3 = "update MyDatabase set subjects =? where roll_no = " + rn;
                                System.out.println("##############################################-----------------------------##############################################");
                                System.out.println("Enter new subjects");
                                subjects = br.readLine();
                                pt = con.prepareStatement(q3);
                                pt.setString(1, subjects);
                                pt.executeUpdate();
                                System.out.println("***********************************-----------------------------***********************************");
                                System.out.println("Record updated successfully");
                                System.out.println("***********************************-----------------------------***********************************");
                                //con.close();
                                break;

                            default:
                                System.out.println("invalid operation");
                        }
                        break;

                    case 4:
                                // using select statement and retrieving all field values from database

                          q3 = "SELECT * from MyDatabase";
                        //stm = con.createStatement();
                        pt = con.prepareStatement(q3);
                        ResultSet rs = pt.executeQuery();
                        System.out.println("Roll_no\t   Student_name\t    Course\t\t\t    Subjects" );
                        while (rs.next())
                        {
                                // getting all field values into variables

                            roll_no = rs.getInt("Roll_no");
                            st_name = rs.getString("Student_name");
                            course = rs.getString("Course");
                            subjects = rs.getString("Subjects");
                           // System.out.println("Roll_no\t Student_name\t Course\t Subjects" );
                            //System.out.println("--------------------------------------------------------------------------------------------------");

                                              // Printing all field values

                            System.out.println(roll_no + "\t\t   " + st_name + "\t\t\t" + course + "\t\t\t " + subjects );
                            System.out.println("--------------------------------------------------------------------------------------------------");
                            System.out.println();
                        }
                            System.out.println("\t\t\t\t -----------------------*************************----------------------------");
                        break;
                    case 5:
                    {
                        con.close();
                        System.exit(0);
                    }
                }

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

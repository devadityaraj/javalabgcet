package JDBC;

import java.sql.*;
import java.util.Scanner;

class JDBCdemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adi_database_1", "root", "password");
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter employee id: ");
            int empid = inp.nextInt();
            inp.nextLine();

            System.out.print("Enter employee name: ");
            String name = inp.nextLine();

            System.out.print("Enter employee email: ");
            String email = inp.nextLine();

            System.out.print("Enter mobile number: ");
            int mob = inp.nextInt();
            String sql = "INSERT INTO employee (empid, name, emailid, mobilenum) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empid);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.setInt(4, mob);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                System.out.println("The record inserted successfully.");
            } else {
                System.out.println("The record was not inserted.");
            }
            String selectSQL = "SELECT * FROM employee";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("empid") + ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("emailid") + ", Mobile: " + rs.getInt("mobilenum"));
            }
            rs.close();
            stmt.close();
            pstmt.close();
            con.close();
            inp.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

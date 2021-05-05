/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author This-pc
 */
public class UserDao {
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    
    public boolean  save(User user){
          boolean f=false;
        try{
          
          String sql = "insert into employee values(?,?,?,?,?)";
           PreparedStatement ps = this.con.prepareStatement(sql);
           ps.setString(1, user.getName());
           ps.setString(2, user.getEmail());
           ps.setString(3, user.getPassword());
           ps.setString(4, user.getConfirmPassword());
           ps.setString(5, user.getMobilenumber());
           ps.executeUpdate();
           f=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public User getuser(String email , String password){
    User user=null;
    
        try {
   String sql = "select * from employee where email =? and password=?";
        PreparedStatement ps =this.con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        user = new User();
        String name = rs.getString("Name");
        user.setName(name);
        user.setEmail(rs.getString("Email"));
        user.setPassword(rs.getString("password"));
        user.setConfirmPassword(rs.getString("ConfirmPassword"));
        user.setMobilenumber(rs.getString("MobileNumber"));
        }
        } catch (Exception e) {
        }
    return user;
    }
    
    
    
}


package project;

public class User {

    private String name;
    private String Email;
    private String password;
    private String confirmPassword;
    private String mobilenumber;

    public User(String name, String Email, String password, String confirmPassword, String mobilenumber) {
        this.name = name;
        this.Email = Email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.mobilenumber = mobilenumber;
    }

    public User() {
    }

    public User(String name, String password, String confirmPassword, String mobilenumber) {
        this.name = name;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.mobilenumber = mobilenumber;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    
}

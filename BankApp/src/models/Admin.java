package models;

public class Admin extends User{
    public Admin(int id,String name,String userName,String password){
        super(id,name,userName,password);
        this.setAdmin(true);
    }
}

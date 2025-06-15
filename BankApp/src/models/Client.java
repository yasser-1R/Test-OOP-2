package models;

public class Client extends User{
    public Client(int id,String name,String userName,String password){
        super(id,name,userName,password);
        this.setAdmin(false);
    }
}

package models;

import java.util.List;

public abstract class User {
    
    private int id;
    private String name;
    private String userName;
    private String password;
    private List<Compte> comptes;
    private boolean isAdmin;

    public User(int id,String name,String userName,String password){
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public List<Compte> getComptes() {
        return comptes;
    }
    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    
    public String infos(){
        String infos = "Id : " + this.id + " Name : " + this.name + " UserName : " + this.userName;
        return infos;
    }
}

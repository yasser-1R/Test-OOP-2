package services;

import java.util.List;

import models.User;

public class AuthService {
    public static User authentification(String userName,String password,List<User> users){
        for(User user:users){
            if(user.getName().equals(userName) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}

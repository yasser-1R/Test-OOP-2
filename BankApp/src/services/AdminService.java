package services;

import java.util.List;

import models.Admin;
import models.Client;
import models.Compte;
import models.User;

public class AdminService {
    
    // public static boolean addUser(List<User> users,User user){
    //     if(!users.contains(user)){
    //         users.add(user);
    //         return true;
    //     }
    //     return false;
    // }

    // public static boolean removeUser(List<User> users,User user){
    //     if (users.contains(user)) {
    //         users.remove(user);
    //         return true;
    //     }
    //     return false;
    // }

    // public static boolean addCompte(List<Compte> comptes,Compte compte){
    //     if(!comptes.contains(compte)){
    //         comptes.add(compte);
    //         return true;
    //     }
    //     return false;
    // }

    // public static boolean removeCompte(List<Compte> comptes,Compte compte){
    //     if (comptes.contains(compte)) {
    //         comptes.remove(compte);
    //         return true;
    //     }
    //     return false;
    // }

    public static Compte findCompteByRIP(List<Compte> comptes,int RIP){
        for(Compte compte:comptes){
            if(compte.getRIP() == RIP){
                return compte;
            }
        }
        return null;
    }

    public static User findUserById(List<User> users,int Id){
        for(User user:users){
            if(user.getId() == Id){
                return user;
            }
        }
        return null;
    }




    public static boolean addCompte(List<Compte> comptes,int RIP,double solde){
        Compte test = findCompteByRIP(comptes, RIP);
        if(test == null){
            Compte compte = new Compte(RIP,solde);
            comptes.add(compte);
            return true;
        }
        return false;

        
    }

    public static boolean removeCompte(List<Compte> comptes,int RIP){
        Compte compte = findCompteByRIP(comptes, RIP);
        if(compte != null){
            comptes.remove(compte);
            return true;
        }
        return false;
    }

    public static boolean addUser(List<User> users,int id,String name,String userName,String password, boolean isAdmin){
        
        User user;
        if(isAdmin == true){
            user = new Admin(id, name, userName, password);
        }
        else{
            user = new Client(id, name, userName, password);
        }

        User U = findUserById(users, id);
        if(U == null){
            users.add(user);
            return true;
        }
        return false;

    }

    public static boolean removeUser(List<User> users,int id){
        User user = findUserById(users, id);
        if(user != null){
            users.remove(user);
            return true;
        }
        return false;
    }

}

package services;

import models.Compte;
import models.User;

public class ComptesService {

    public static boolean addCompte(User user,Compte compte){
        if(!user.getComptes().contains(compte)){
            user.getComptes().add(compte);
            return true;
        }
        return false;
    }

    public static boolean removeCompte(User user,Compte compte){
        if(user.getComptes().contains(compte)){
            user.getComptes().remove(compte);
            return true;
        }
        return false;
    }

    public static boolean transaction(Compte compteSender , Compte compteReciever , double amount){
        if(compteSender.getSolde()>=amount){
            compteSender.setSolde(compteSender.getSolde() - amount);
            compteReciever.setSolde(compteReciever.getSolde() + amount);
            return true;
        }
        return false;
    }
}

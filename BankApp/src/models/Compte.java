package models;

public class Compte {

    private int RIP;
    private double solde;
    private User owner;
    
    public int getRIP() {
        return RIP;
    }
    public void setRIP(int RIP) {
        this.RIP = RIP;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
}

package modele;

import pattern.PaiementStrategie;

public class Article {

    private String nom;
    private int prix;


    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public void payer(PaiementStrategie paiement){
        paiement.payer(this.getPrix());
    }
}

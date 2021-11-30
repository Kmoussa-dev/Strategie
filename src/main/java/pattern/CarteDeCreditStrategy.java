package pattern;

public class CarteDeCreditStrategy implements PaiementStrategie{


  private String numeroCarte;
  private String crypto;
  private String dateExpiration;

    public CarteDeCreditStrategy(String numeroCarte, String crypto, String dateExpiration) {
        this.numeroCarte = numeroCarte;
        this.crypto = crypto;
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void payer(int prix) {
        System.out.println("Vous venez de payez par carte bleu"+prix);
    }
}

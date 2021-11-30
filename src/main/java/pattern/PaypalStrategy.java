package pattern;

public class PaypalStrategy implements PaiementStrategie{

   private String id;
   private String password;

    public PaypalStrategy(String id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public void payer(int prix) {
        System.out.println("Vous venez faire un achat par paypal de "+prix);
    }
}

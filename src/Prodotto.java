
import java.util.Random;

public class Prodotto {
    /*
     * CARATTERISTICHE
     */

    private int Codice;

    private String Nome;
    
    private String Descrizione;

    private float Prezzo;

    private int IVA;

    Random rand = new Random();
    /*
     * COSTRUTTORE
     */

    public Prodotto(String nome, String descrizione, float prezzo, int iVA) {
        this.Codice = rand.nextInt(10000);
        this.Nome = nome;
        this.Descrizione = descrizione;
        this.Prezzo = prezzo;
        this.IVA = iVA;
    }
    
    /*
     * METODI
     */


    public void mostraInfo(){
        System.out.println("INFORMAZIONI PRODOTTO:");
        System.out.println("Codice:      "+ this.Codice);
        System.out.println("Nome:        "+ this.Nome);
        System.out.println("Descrizione: "+ this.Descrizione);
        System.out.println("Prezzo:      "+ this.Prezzo);
        System.out.println("IVA:         "+ this.IVA);
    }

    public void showPlanPrice(){
        System.out.println("Il prezzo di questo prodotto è di "+ this.Prezzo + " euro");
    }

    public float calcolaPrezzoConIVA(){
        float costoIVA = ((this.Prezzo*this.IVA)/100);
        // System.out.println(costoIVA);
        float prezzoFinaleConIva=this.Prezzo+costoIVA;
        return prezzoFinaleConIva;
    }

    public String NomeEsteso(){
        return (this.Codice + "-" + this.Nome);
    }

    /*
    * GETTERS
    */

    public int getCodice() {
        return Codice;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public float getPrezzo() {
        return Prezzo;
    }

    public int getIVA() {
        return IVA;
    }

    /*
     * SETTERS e CUSTOM SETTERS
     */

    public void setNome(String nome) {
        if (nome.length() >= 0){
            Nome = nome;
        }else{
            System.out.println("Inserire un nome!");
        }
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    public void setPrezzo(float prezzo) {
        if (prezzo >= 0){
            Prezzo = prezzo;
        }else{
            System.out.println("Inserire un prezzo corretto!");
        }
    }
}

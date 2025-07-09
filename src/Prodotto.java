
import java.util.Scanner;

public class Prodotto {
    Scanner scan = new Scanner(System.in);
    /*
     * CARATTERISTICHE
     */

    public int Codice;

    public String Nome;
    
    public String Descrizione;

    public float Prezzo;

    public int IVA;

    /*
     * COSTRUTTORE
     */

    public Prodotto(){
        // crea codice numerico intero random
        Codice = (int)(Math.random()*10001);
        // Inserimento nome del prodotto
        System.out.print("Inserisci il nome del prodotto: ");
        Nome = scan.nextLine();
        // Inserimento una breve descrizione del prodotto
        System.out.println("Inserisci una breve descrizione del prodotto: ");
        Descrizione = scan.nextLine();
        // Inserimento prezzo del prodotto
        System.out.print("Inserisci il prezzo del prodotto: ");
        Prezzo = scan.nextFloat();
        // Inserimento iva del prodotto
        System.out.print("Inserisci l'IVA del prodotto: ");
        IVA = scan.nextInt();
    }

    /*
     * METODI
     */

    public void mostraInfo(){
        System.out.println("INFORMAZIONI PRODOTTO:");
        System.out.println("Codice:      "+ Codice);
        System.out.println("Nome:        "+ Nome);
        System.out.println("Descrizione: "+ Descrizione);
        System.out.println("Prezzo:      "+ Prezzo);
        System.out.println("IVA:         "+ IVA);
    }

    public void showPlanPrice(){
        System.out.println("Il prezzo di questo prodotto è di "+ Prezzo + " euro");
    }

    public float calcolaPrezzoConIVA(){
        float costoIVA = ((Prezzo*IVA)/100);
        System.out.println(costoIVA);
        float prezzoFinaleConIva=Prezzo+costoIVA;
        return prezzoFinaleConIva;
    }

    public String NomeEsteso(){
        return (Codice + "-" + Nome);
    }
}

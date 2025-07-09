public class App {
    public static void main(String[] args) throws Exception {
        Prodotto prodotto1 = new Prodotto();

        prodotto1.mostraInfo();

        prodotto1.showPlanPrice();

        String NomeConCodice = prodotto1.NomeEsteso();
        System.out.println("Ecco la codifica del prodotto: "+ NomeConCodice);

        float prezzoDaMostrare = prodotto1.calcolaPrezzoConIVA();
        System.out.println("Ecco il prezzo da esporre (con IVA calcolata): "+ prezzoDaMostrare);
    }
}
public class Main {
    public static void main(String[] args) {
        ContoBancario conto1 = new ContoBancario("123c", 100);
        ContoBancario conto2 = new ContoBancario("456b", 50);

        Banca isp = new Banca("Intesa SanPaolo", 3);
        isp.aggiungiConto(conto1);
        isp.aggiungiConto(conto2);

        isp.visualizzaInformazioniConti();
        System.out.println("saldo totale: " + isp.saldoTotale());

    }
}
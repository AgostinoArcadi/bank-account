public class Banca {
    private String nomeBanca;

    private ContoBancario[] ContiBancari;

    private int numeroConti;

    public Banca(String nomeBanca, int maxConti) {
        this.nomeBanca = nomeBanca;
        ContiBancari = new ContoBancario[maxConti];
        this.numeroConti = 0;
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public ContoBancario[] getContiBancari() {
        return ContiBancari;
    }

    public void setContiBancari(ContoBancario[] contiBancari) {
        ContiBancari = contiBancari;
    }

    public int getNumeroConti() {
        return numeroConti;
    }

    public void setNumeroConti(int numeroConti) {
        this.numeroConti = numeroConti;
    }

    public void aggiungiConto(ContoBancario contoBancario) {
        if(numeroConti < ContiBancari.length) {
            ContiBancari[numeroConti] = contoBancario;
            numeroConti += 1;
        } else {
            System.out.println("Hai raggiunto il massimo di conti bancari");
        }
    }

    public void visualizzaInformazioniConti() {
        for(int i = 0; i < numeroConti; i++) {
            System.out.println(ContiBancari[i]);
        }
    }

    public double saldoTotale() {
        double totale = 0;

        for(int i = 0; i < numeroConti; i++) {
            totale += ContiBancari[i].getSaldo();
        }
        return totale;
    }
}

public class ContoBancario {
    private String iban;

    private double saldo;

    public ContoBancario(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContoBancario{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

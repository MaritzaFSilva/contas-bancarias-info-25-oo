public class ContaBancaria {

    // saldo, cliente, numero, agencio

    private int numero;
    private int agencia;
    private double saldo;
    private String cliente;

    // Construtor
    public ContaBancaria(int agencia, int numero, String cliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaBancaria(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0;
        this.cliente = "Não informado";
    }

    // get e set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String novoNome) {
        this.cliente = novoNome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodos gerais

    // toString

    // sacar, depositar, verSaldo

    public double verSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    public void sacar() {
        saldo = saldo - 100;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public String toString() {
        return "\nAgência: " + agencia +
                "\nNúmero: " + numero +
                "\nCliente: " + cliente +
                "\nSaldo: R$ " + saldo;
    }

}

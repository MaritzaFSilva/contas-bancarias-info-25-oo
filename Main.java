public class Main {
    public static void main(String[] args) {

        System.out.println("SISTEMA BANCÁRIO");

        // criar objeto
        ContaBancaria conta;
        // instancio o objeto
        conta = new ContaBancaria(123, 123456, "Maritza", 1000.55);
       
        // alterar o estado do objeto
        // conta.setAgencia(123);
        // conta.setNumero(123456);
        // conta.setCliente("Maritza dos Anjos");
        // conta.setSaldo(1000.55);

        System.out.println(conta.toString());

        System.out.println("Depositando...");
        conta.depositar(300);
        System.out.println(conta.toString());

        System.out.println("Sacando dimdim...");
        conta.sacar(900);
        System.out.println(conta.toString());
        // como eu faço pra mostrar meu saldo aqui?
    }
}
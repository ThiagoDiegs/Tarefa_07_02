/**
 * @author thiago.araujo
 */
public class BancoDiegs {
    public static void main(String args[]){
        ContaCorrente conta = new ContaCorrente();
        conta.setCliente("Thiago Diegs");
        conta.setConta(12345);
        conta.setAgencia(12);
        conta.setValor(5000);
        conta.imprimirDadosBancariso();

    }
}

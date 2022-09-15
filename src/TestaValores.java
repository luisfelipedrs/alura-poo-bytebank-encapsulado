public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24555);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 73437463);

        System.out.println(Conta.getTotal());
    }
}

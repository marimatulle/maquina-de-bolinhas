abstract class Bolinha implements Pagamento{
    private String cor;

    public Bolinha(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void processarPagamento(double valor) {
        int quantidade = (int) valor;
        System.out.println("Você comprou " + quantidade + " bolinha(s) " + cor + ".");
    }
}
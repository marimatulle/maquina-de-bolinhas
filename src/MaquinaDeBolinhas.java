import java.util.Random;

class MaquinaDeBolinhas {
    public void venderBolinhas(int quantidade) {
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            int tipoBolinha = random.nextInt(4);
            switch (tipoBolinha) {
                case 0:
                    new BolinhaColorida().processarPagamento(1);
                    break;
                case 1:
                    new BolinhaBrilhante().processarPagamento(1);
                    break;
                case 2:
                    new BolinhaNeon().processarPagamento(1);
                    break;
                case 3:
                    new BolinhaPersonagem().processarPagamento(1);
                    break;
            }
        }
    }
}

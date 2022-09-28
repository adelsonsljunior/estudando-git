public class Cd extends Produto {

    private int numeroDeFaixas;

    public Cd(String titulo, float preco, int numeroDeFaixas) {
        super(titulo, preco);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Número de faixas:" + numeroDeFaixas);
    }

    public float calcularDesconto(String dia) {

        float desconto = 0;

        if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("segunda")) {
            desconto = super.getPreco() * 15 / 100;
        }

        return desconto;

    }

}

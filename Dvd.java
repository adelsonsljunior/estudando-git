public class Dvd extends Produto {
    
    private int duracao;

    public Dvd(String titulo, float preco, int duracao) {
        super(titulo, preco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Duração: " + duracao);
    }

    public float calcularDesconto(String dia){

        float desconto = 0;

        if(dia.equalsIgnoreCase("sexta")){
            desconto = super.getPreco() * 15 / 100;
        }

        return desconto;

    }

    
}

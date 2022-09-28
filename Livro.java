public class Livro extends Produto {
    
    private String autor;

    public Livro(String titulo, float preco, String autor) {
        super(titulo, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Autor: " + autor);
    }

    public float calcularDesconto(String dia){

        float desconto = 0;

        if(dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("quarta")){
            desconto = super.getPreco() * 30 / 100;
        }

        return desconto;
    }

}
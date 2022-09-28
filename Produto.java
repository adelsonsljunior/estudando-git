public abstract class Produto{

    private String titulo;
    private float preco;

    public Produto(String titulo, float preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void exibir(){
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Preço: " + preco);
    }

    public abstract float calcularDesconto();

}
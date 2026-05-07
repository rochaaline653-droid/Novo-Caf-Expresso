package cafeexpresso;
public class Produto {
    private String nome;
    private double preco;

    //Construtor de produtos
    public Produto(String nome, double preco) {
        if (nome == null || nome.isBlank()) {
        throw new IllegalArgumentException("Nome não pode ser vazio");
    }
    if (preco <= 0) {
        throw new IllegalArgumentException("Preço deve ser maior que zero");
    }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
}

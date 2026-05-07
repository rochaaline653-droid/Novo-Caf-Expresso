package cafeexpresso;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    void deveCriarProduto() {
        Produto p = new Produto("Café", 5.0);

        assertEquals("Café", p.getNome());
        assertEquals(5.0, p.getPreco());
    }
}
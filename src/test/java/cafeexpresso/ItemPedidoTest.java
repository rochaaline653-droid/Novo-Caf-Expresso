package cafeexpresso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemPedidoTest {

    @Test
    void deveCalcularSubtotal() {
        Produto p = new Produto("Café", 5.0);
        ItemPedido item = new ItemPedido(p, 2);

        assertEquals(10.0, item.calcularSubtotal());
    }

    @Test
    void naoDeveCriarComQuantidadeInvalida() {
        Produto p = new Produto("Café", 5.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(p, 0);
        });
    }
}
package cafeexpresso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    void deveCalcularValorTotalPedido() {

        Produto cafe = new Produto("Café", 5.0);

        ItemPedido item1 = new ItemPedido(cafe, 2);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(item1);

        assertEquals(10.0, pedido.calcularTotal());
    }
}
package cafeexpresso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {

    @Test
    void deveCalcularValorTotalPedido() {

        Produto cafe = new Produto("Café", 5.0);
        Produto bolo = new Produto("Bolo", 8.0);

        ItemPedido item1 = new ItemPedido(cafe, 2);
        ItemPedido item2 = new ItemPedido(bolo, 1);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        assertEquals(18.0, pedido.calcularTotal());
    }

    @Test
    void deveIniciarComStatusPendente() {

        Pedido pedido = new Pedido();

        assertEquals(StatusPedido.PENDENTE, pedido.getStatus());
    }

    @Test
    void deveAlterarStatusPedido() {

        Pedido pedido = new Pedido();

        pedido.alterarStatus(StatusPedido.PREPARANDO);

        assertEquals(StatusPedido.PREPARANDO, pedido.getStatus());
    }
}
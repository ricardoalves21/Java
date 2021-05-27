package enums;

import java.util.Date;
import entidade.Pedido;
import entidade.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		StatusPedido pedido1 = StatusPedido.AGUARDANDO_PAGAMENTO;
		StatusPedido pedido2 = StatusPedido.valueOf("AGUARDANDO_PAGAMENTO");
		
		System.out.println(pedido1);
		System.out.println(pedido2);

	}

}

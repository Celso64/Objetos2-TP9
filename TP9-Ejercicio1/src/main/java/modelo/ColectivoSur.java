package modelo;

import java.util.Map;

public class ColectivoSur implements Enviador {

    private static final Double OTRO_LUGAR = 3000.0;
    private static final Map<Ciudad, Double> LUGARES_ESPECIALES = Map.of(Ciudad.CAPITAL_FEDERAL, 1000.0,
	    Ciudad.GRAN_BUENOS_AIRES, 1500.0);

    private static final Double PESO_MEDIANO = 5.0;
    private static final Double PESO_ALTO = 30.0;

    private static final Map<Double, Double> EXTRA_POR_PESO = Map.of(PESO_ALTO, 2000.0, PESO_MEDIANO, 500.0);

    @Override
    public Double enviar(Producto producto, Ciudad destino) {

	Double total = (LUGARES_ESPECIALES.containsKey(destino)) ? LUGARES_ESPECIALES.get(destino) : OTRO_LUGAR;

	total += (producto.pesaMasQue(PESO_ALTO)) ? EXTRA_POR_PESO.get(PESO_ALTO)
		: (producto.pesaMasQue(PESO_MEDIANO)) ? EXTRA_POR_PESO.get(PESO_MEDIANO) : 0.0;

	return total;
    }

}

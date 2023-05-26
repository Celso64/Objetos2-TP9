package modelo;

import java.util.Map;

public class CorreoArgentino implements Enviador {

    private static final Double OTRO_LUGAR = 800.0;
    private static final Map<Ciudad, Double> LUGARES_ESPECIALES = Map.of(Ciudad.CAPITAL_FEDERAL, 500.0);

    private static final Double COSTO_POR_KM = 5.0;

    private final CalculadoraDistancia servicioDistancia;

    public CorreoArgentino(CalculadoraDistancia servicioDistancia) {
	this.servicioDistancia = servicioDistancia;
    }

    @Override
    public Double enviar(Producto producto, Ciudad destino) {

	if (LUGARES_ESPECIALES.containsKey(destino))
	    return LUGARES_ESPECIALES.get(destino);

	Double total = OTRO_LUGAR;

	total += COSTO_POR_KM * this.servicioDistancia.calcularDistancias(Ciudad.CAPITAL_FEDERAL, destino);

	return total;
    }

}

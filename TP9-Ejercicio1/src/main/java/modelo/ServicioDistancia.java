package modelo;

import java.util.Map;

//Implementacion de Juguete
public class ServicioDistancia implements CalculadoraDistancia {

    private static final Map<Ciudad, Double> DISTANCIAS = Map.of(Ciudad.CAPITAL_FEDERAL, 0.0, Ciudad.GRAN_BUENOS_AIRES,
	    25.0, Ciudad.VIEDMA, 123.4);

    @Override
    public Double calcularDistancias(Ciudad origen, Ciudad destino) {

	if (!DISTANCIAS.containsKey(destino) || !origen.equals(Ciudad.CAPITAL_FEDERAL))
	    throw new RuntimeException("No se permiten otros parametros por ahora");

	return DISTANCIAS.get(destino);
    }

}

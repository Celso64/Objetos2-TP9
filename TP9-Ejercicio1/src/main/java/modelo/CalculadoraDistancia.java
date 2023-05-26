package modelo;

public interface CalculadoraDistancia {

    /**
     * Calcula los KM (KiloMetros) entre dos ciudades
     * 
     * @param origen
     * @param destino
     * @return KM entre las ciudades
     */
    Double calcularDistancias(Ciudad origen, Ciudad destino);

}

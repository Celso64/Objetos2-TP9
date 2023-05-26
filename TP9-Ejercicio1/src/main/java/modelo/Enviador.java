package modelo;

public interface Enviador {

    /**
     * Envia un producto por mensajeria
     * 
     * @param producto a enviar
     * @param destino  a donde enviarlo
     * @return Costo del envio
     */
    Double enviar(Producto producto, Ciudad destino);

}

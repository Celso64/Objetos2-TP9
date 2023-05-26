package api;

import java.util.Map;

import modelo.Ciudad;
import modelo.ColectivoSur;
import modelo.CorreoArgentino;
import modelo.Enviador;
import modelo.Producto;
import modelo.ServicioDistancia;

public class EComerce implements ComercioElectronico {

    private static final Map<String, Enviador> SERVICIOS = Map.of("correo argentino",
	    new CorreoArgentino(new ServicioDistancia()), "colectivo sur", new ColectivoSur());

    private static final Map<String, Ciudad> CIUDADES_DISPONIBLES = Map.of("capital federal", Ciudad.CAPITAL_FEDERAL,
	    "gran buenos aires", Ciudad.GRAN_BUENOS_AIRES, "viedma", Ciudad.VIEDMA);

    @Override
    public void vender(EnvioDTO envio) {

	String ciudadDestino = envio.ciudadDestino();

	if (!SERVICIOS.containsKey(envio.servicioEnvio()))
	    throw new RuntimeException("Ese servicio no existe o no es soportado");
	if (!CIUDADES_DISPONIBLES.containsKey(ciudadDestino))
	    throw new RuntimeException("Ciudad no disponible");

	Enviador servicio = SERVICIOS.get(envio.servicioEnvio());
	Producto producto = new Producto(Double.parseDouble(envio.peso()));

	Ciudad destino = CIUDADES_DISPONIBLES.get(ciudadDestino);

	servicio.enviar(producto, destino);

    }

}

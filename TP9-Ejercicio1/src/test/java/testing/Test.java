package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.CalculadoraDistancia;
import modelo.Ciudad;
import modelo.ColectivoSur;
import modelo.CorreoArgentino;
import modelo.Enviador;
import modelo.Producto;
import modelo.ServicioDistancia;

class Test {

    private Producto producto;

    private CalculadoraDistancia servicio = new ServicioDistancia();

    private Enviador colectivoSur = new ColectivoSur();
    private Enviador correoArgentino = new CorreoArgentino(servicio);

    // Test Sobre Colectivo Sur

    @org.junit.jupiter.api.Test
    void colectivoSurCapitalyPesoBajo() {
	producto = new Producto(2.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.CAPITAL_FEDERAL);

	assertEquals(1000.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurCapitalyPesoMediano() {
	producto = new Producto(7.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.CAPITAL_FEDERAL);

	assertEquals(1500.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurCapitalyPesoAlto() {
	producto = new Producto(41.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.CAPITAL_FEDERAL);

	assertEquals(3000.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurBuenosAiresyPesoBajo() {
	producto = new Producto(2.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.GRAN_BUENOS_AIRES);

	assertEquals(1500.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurBuenosAiresyPesoMediano() {
	producto = new Producto(7.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.GRAN_BUENOS_AIRES);

	assertEquals(2000.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurBuenosAiresyPesoAlto() {
	producto = new Producto(47.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.GRAN_BUENOS_AIRES);

	assertEquals(3500.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurOtroDestinoyPesoBajo() {
	producto = new Producto(2.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.VIEDMA);

	assertEquals(3000.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurOtroDestinoyPesoMediano() {
	producto = new Producto(13.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.VIEDMA);

	assertEquals(3500.0, costo);
    }

    @org.junit.jupiter.api.Test
    void colectivoSurOtroDestinoyPesoAlto() {
	producto = new Producto(52.3);
	Double costo = colectivoSur.enviar(producto, Ciudad.VIEDMA);

	assertEquals(5000.0, costo);
    }

    // Test Sobre Correo Argentino

    @org.junit.jupiter.api.Test
    void correoArgentinoCapital() {
	producto = new Producto(52.3);
	Double costo = correoArgentino.enviar(producto, Ciudad.CAPITAL_FEDERAL);

	assertEquals(500.0, costo);
    }

    @org.junit.jupiter.api.Test
    void correoArgentinoBuenosAires() {
	producto = new Producto(52.3);
	Double costo = correoArgentino.enviar(producto, Ciudad.GRAN_BUENOS_AIRES);

	assertEquals(925.0, costo);
    }

    @org.junit.jupiter.api.Test
    void correoArgentinoOtroLugar() {
	producto = new Producto(52.3);
	Double costo = correoArgentino.enviar(producto, Ciudad.VIEDMA);

	assertEquals(1417.0, costo);
    }

}

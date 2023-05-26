package modelo;

public class Producto {

    private Double pesoEnKilos;

    public Producto(Double pesoEnKilos) {
	this.pesoEnKilos = pesoEnKilos;
    }

    public Boolean pesaMasQue(Double kilos) {
	return this.pesoEnKilos > kilos;
    }

}

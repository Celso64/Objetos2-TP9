package modelo;

import java.time.LocalDate;

public class Persona {

    private final LocalDate fechaNacimiento;
    private final FechaFormateador formato;

    public Persona(LocalDate fechaNacimiento, FechaFormateador formato) {
	this.fechaNacimiento = fechaNacimiento;
	this.formato = formato;
    }

    public String fechaNacimiento() {
	return this.formato.formatear(this.fechaNacimiento);
    }

}

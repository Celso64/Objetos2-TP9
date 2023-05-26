package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import modelo.FormatoCorto;
import modelo.FormatoLargo;
import modelo.Persona;

class Test {

    @org.junit.jupiter.api.Test
    void fechaFormatoCorto() {
	Persona persona = new Persona(LocalDate.of(1997, 2, 12), new FormatoCorto());
	String fecha = persona.fechaNacimiento();
	assertEquals("12-2-1997", fecha);
    }

    @org.junit.jupiter.api.Test
    void fechaFormatoLargo() {
	Persona persona = new Persona(LocalDate.of(1997, 2, 12), new FormatoLargo());
	String fecha = persona.fechaNacimiento();
	assertEquals("12 de febrero de 1997", fecha);
    }

}

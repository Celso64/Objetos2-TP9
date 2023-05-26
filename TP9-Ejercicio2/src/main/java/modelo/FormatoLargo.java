package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatoLargo implements FechaFormateador {

    private final Locale local = new Locale("es");
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", local);

    @Override
    public String formatear(LocalDate fecha) {
	return fecha.format(formatter);
    }

}

package modelo;

import java.time.LocalDate;

public class FormatoCorto implements FechaFormateador {

    @Override
    public String formatear(LocalDate fecha) {

	StringBuilder buffer = new StringBuilder(16);

	buffer.append(fecha.getDayOfMonth()).append("-");
	buffer.append(fecha.getMonthValue()).append("-");
	buffer.append(fecha.getYear());

	return buffer.toString();
    }

}

package topico02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalcularIdade {
    public static int calcularIdade(int dataNascimento) {
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(new Date(dataNascimento));

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, age);

        if (today.before(dateOfBirth)) {
            age--;
        }

        return age;
    }

}

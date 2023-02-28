import java.util.Map;
import java.util.HashMap;

public class Holydayzer {
    Map<String, String> holidaysList = new HashMap<>();

    public void createHolydays() {
        list();
    }

    public void getHolyday(String data) {
        String holiday = holidaysList.get(data);

        if (holiday == null) {
            System.out.println("Não existe feriado na data " + data + ".");
            return;
        }
        System.out.println(" A data " + data + " se refere ao feriado " + holiday + ".");
    }

    public void listHolidays() {
        holidaysList.forEach((key, value) -> System.out.println("Data: " + key + " " + "feriado: " + value));
    }

    public void list() {

        holidaysList.put("01/01/2023", "Confraternização mundial");
        holidaysList.put("21/02/2023", "Carnaval");
        holidaysList.put("17/04/2023", "Páscoa");
        holidaysList.put("21/04/2023", "Tiradentes");
        holidaysList.put("01/05/2023", "Dia do trabalho");
        holidaysList.put("08/06/2023", "Corpus Christi");
        holidaysList.put("07/09/2023", "Independência do Brasil");
        holidaysList.put("12/10/2023", "Nossa Senhora Aparecida");
        holidaysList.put("02/11/2023", "Finados");
        holidaysList.put("15/11/2023", "Proclamação da República");
        holidaysList.put("25/12/2023", "Natal");

    }
}

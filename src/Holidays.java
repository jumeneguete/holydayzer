import java.util.ArrayList;
import java.util.List;

class Holidays {

    public void findByDate( String date ) {
        if (!date.matches("((0[1-9])?([1-2][0-9])?(3[0-1])?){1}/((0[1-9])?(1[0-2])?){1}/(2023)")) {
            System.out.println("Formato inválido de data! Use data válida no formato dd/mm/2023 ");
        } else {
            switch (date) {
                case "01/01/2023":
                    System.out.println("Confraternização mundial");
                    break;
                case "21/02/2023":
                    System.out.println("Carnaval");
                    break;
                case "17/04/2023":
                    System.out.println("Páscoa");
                    break;
                case "21/04/2023":
                    System.out.println("Tiradentes");
                    break;
                case "01/05/2023":
                    System.out.println("Dia do trabalho");
                    break;
                case "08/06/2023":
                    System.out.println("Corpus Christi");
                    break;
                case "07/09/2023":
                    System.out.println("Independência do Brasil");
                    break;
                case "12/10/2023":
                    System.out.println("Nossa Senhora Aparecida");
                    break;
                case "02/11/2023":
                    System.out.println("Finados");
                    break;
                case "15/11/2023":
                    System.out.println("Proclamação da República");
                    break;
                case "25/12/2023":
                    System.out.println("Natal");
                    break;
                default:
                    System.out.println("Não tem feriado nessa data :/");
            }

        }

    }

    public List<String> getAllHolidays () {

        List<String> holidays = new ArrayList<>();
        holidays.add("Confraternização mundial");
        holidays.add("Carnaval");
        holidays.add("Páscoa");
        holidays.add("Tiradentes");
        holidays.add("Dia do trabalho");
        holidays.add("Corpus Christi");
        holidays.add("Independência do Brasil");
        holidays.add("Nossa Senhora Aparecida");
        holidays.add("Finados");
        holidays.add("Proclamação da República");
        holidays.add("Natal");

        System.out.println("Feriados 2023");
        System.out.println(holidays);

        return holidays;
    }

}

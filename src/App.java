public class App {
    public static void main(String[] args) throws Exception {
        // Você deve desenvolver uma aplicação java de calendário de feriados!
        // Requisitos:
        // - [ ]  Ter uma classe separada para trabalhar com os feriados
        // - [ ]  Ter um função que recebe um parâmetro string que é a data do feriado! Caso não exista exibe uma mensagem dizendo que não existe feriado com tal dada, caso exista, buscar na lista de feriados o feriado com a data e imprimir uma mensagem informando a qual feriado se refere.
        // - [ ]  Ter uma função que retorna a lista com todos os feriados.
        Holidays holidays = new Holidays();

        System.out.println("----------------------");
        System.out.println("----------------------");
        holidays.findByDate("12/10/2023");
        holidays.findByDate("08/06/2023");
        holidays.findByDate("06/06/2023");
        holidays.findByDate("40/02/2023");
        System.out.println("----------------------");
        System.out.println("----------------------");
        holidays.getAllHolidays();
        System.out.println("----------------------");
        System.out.println("----------------------");
    }
}

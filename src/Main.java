public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15600; // стоимость билета.
        int rublesForOneBonusMile = 20; // количество рублей для одной бонусной мили.
        int numberOfBonusMiles = ticketPrice / rublesForOneBonusMile; // формула рассчета количества бонусных миль.

        System.out.println("Количество бонусных миль: " + numberOfBonusMiles);
    }
}
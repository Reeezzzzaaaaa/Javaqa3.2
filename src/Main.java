public class Main {
    public static void main(String[] args) {

        int accountBalance = 264;                         // баланс счёта
        int refill = 1654;                                // пополнение счёта
        int bonus = refill / 100;                         // бонусов начислится
        int totalBonus = accountBalance + refill + bonus; // итоговый баланс счёта после пополнения баланса и начисления бонусов
        int total = accountBalance + refill;              // итоговый баланс счёта после пополнения баланса

        System.out.println("Пополнение счёта: " + refill);

        if (refill > 1000) {
            System.out.println("Баланс счёта: " + totalBonus);
            System.out.println("Бонусных рублей начислено: " + bonus);
        } else {
            System.out.println("Баланс счёта: " + total);
        }

        int x = (refill > 1000) ? totalBonus : total;

        System.out.println("Баланс счёта: " + x);

    }
}
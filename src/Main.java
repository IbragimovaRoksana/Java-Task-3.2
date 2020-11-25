public class Main {
    public static void main(String[] args) {
        long clientAccount = 100;
        long increaseSumm = 1200;
        long bonus;
        if (increaseSumm > 1000) {
            bonus = increaseSumm / 100;
        } else {
            bonus = 0;
        }
        clientAccount = clientAccount + increaseSumm + bonus;
        System.out.println("Бонус пополнения счета = " + bonus);
        System.out.println("Итоговая сумма на счету клиента = " + clientAccount);
    }
}

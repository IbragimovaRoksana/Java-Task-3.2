public class Main {
    public static void main(String[] args) {
        long client_account = 100;
        long increase_summ = 1200;
        long bonus;
        if (increase_summ>1000) {bonus=increase_summ/100;}
            else {bonus=0;}
        client_account=client_account+increase_summ+bonus;
        System.out.println("Бонус пополнения счета = " + bonus);
        System.out.println("Итоговая сумма на счету клиента = " + client_account);
}
}

public class Main {
    public static void main(String[] args) {
        long client_account = 100;
        long Increase_summ = 1231;
        long Bonus;
        if (Increase_summ>1000) {Bonus=Increase_summ/100;}
            else {Bonus=0;}
        client_account+=Increase_summ+Bonus;
        System.out.println("Бонус пополнения счета = " + Bonus);
        System.out.println("Итоговая сумма на счету клиента = " + client_account);
}
}

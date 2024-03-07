package Class;

public class DebitPlanning  extends BasicPlanning {
    public void calculateDistribution(float salary, float debit) {
        float tithe = salary * percentTithe;
        salary = salary - (tithe + debit);
        System.out.println(salary);


        float investiment = salary * percentInvestment;
        float reserve = salary * percentReserve;
        float expense = salary * percentExpenses;


        System.out.println("================Debit Planning================");
        System.out.printf("Salário: R$%.2f\n", salary + (tithe + debit));
        System.out.printf("Dízimo:  R$%.2f\n", tithe);
        System.out.printf("Reserva de Emergência: R$%.2f\n", reserve);
        System.out.printf("Investimentos: R$%.2f\n", investiment);
        System.out.printf("Desejos: R$%.2f\n", expense);
    }
}
package Class;

public class BasicPlanning {
    protected float percentTithe = 0.10F;
    protected float percentInvestment;

    protected float percentExpenses;
    protected float percentReserve;


    public void setPercentExpenses(float percentExpenses) {
        if (percentExpenses >= 0.0F) {
            this.percentExpenses = percentExpenses;
        } else {
            System.out.println("Coloque um valor positivo para a porcentagem de despesas");
        }
    }
    public void setPercentInvestment(float percentInvestment) {
        if (percentInvestment >= 0.0F) {
            this.percentInvestment = percentInvestment;
        } else {
            System.out.println("Coloque um valor positivo para a porcentagem de investimento");
        }
    }
    public void setPercentReserve(float percentReserve) {
        if (percentReserve >= 0.0F) {
            this.percentReserve = percentReserve;
        } else {
            System.out.println("Coloque um valor positivo para a porcentagem de reserva de emergência");
        }
    }

    public void calculateDistribution(float salary) {
        float tithe = salary * percentTithe;
        salary *= (1 - percentTithe);
        System.out.println(salary);

        float investiment = salary * percentInvestment;
        float reserve = salary * percentReserve;
        float expense = salary * percentExpenses;


        System.out.println("================Basic Planning================");
        System.out.printf("Salário: R$%.2f\n", (salary + tithe));
        System.out.printf("Dízimo:  R$%.2f\n", tithe);
        System.out.printf("Reserva de Emergência: R$%.2f\n", reserve);
        System.out.printf("Investimentos: R$%.2f\n", investiment);
        System.out.printf("Desejos: R$%.2f\n", expense);
    }
}
package Class;

public class BasicPlanning {
    protected float percentTithe;
    protected float percentInvestment;

    protected float percentExpenses;
    protected float percentReserve;


    public void setPercentExpenses(float percentExpenses) {
        this.percentExpenses = percentExpenses;
    }
    public void setPercentInvestment(float percentInvestment) {
        this.percentInvestment = percentInvestment;
    }
    public void setPercentReserve(float percentReserve) {
        this.percentReserve = percentReserve;
    }
    public void setPercentTithe(float percentTithe) {
        this.percentTithe = percentTithe;
    }

    public void calculateDistribution(float salary) {
        salary *= (1 - percentTithe);

        float investiment = salary * percentInvestment;
        float reserve = salary * percentReserve;
        float expense = salary * percentExpenses;
        float tithe = salary * percentTithe;

        System.out.println("================Basic Planning================");
        System.out.printf("Salário: R$" + (salary + tithe));
        System.out.printf("Dízimo:  R$" + tithe);
        System.out.printf("Reserva de Emergência: R$" + reserve);
        System.out.printf("Investimentos: R$" + investiment);
        System.out.printf("Desejos: R$" + expense);
    }

}

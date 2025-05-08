package Homework;

public class DipendentePartTime extends Dipendente {
    private int oreLavorative;
    private double pagaOraria;

    public DipendentePartTime(String matricola, String[] dipartimenti, int oreLavorative, double pagaOraria) {
        super(matricola, dipartimenti);
        this.oreLavorative = oreLavorative;
        this.pagaOraria = pagaOraria;
    }

    @Override
    public double calculateSalary() {
        return oreLavorative * pagaOraria;
    }
}

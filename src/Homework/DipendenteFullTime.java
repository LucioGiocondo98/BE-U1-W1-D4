package Homework;

public class DipendenteFullTime extends Dipendente {
private double stipendioMensile;

    public DipendenteFullTime(String matricola, Dipartimento[] dipartimenti, double stipendioMensile) {
        super(matricola, dipartimenti);
        this.stipendioMensile = stipendioMensile;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile;
    }
}

public class Dirigente extends Dipendente {
    private double stipendioMensile;
    private double bonus;

    public Dirigente(String matricola, String[] dipartimenti, double stipendioMensile, double bonus) {
        super(matricola, dipartimenti);
        this.stipendioMensile = stipendioMensile;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendioMensile + bonus;
    }
}

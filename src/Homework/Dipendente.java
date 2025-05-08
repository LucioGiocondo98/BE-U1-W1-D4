package Homework;

public abstract class Dipendente implements CheckIn {
    private String matricola;
    //private double stipendio;
    private Dipartimento [] dipartimenti;

    public Dipendente(/*double stipendio,*/ String matricola, Dipartimento[] dipartimenti) {
       // this.stipendio = stipendio;
        this.matricola = matricola;
        this.dipartimenti = dipartimenti;

    }

    public String getMatricola() {
        return matricola;
    }

   // public double getStipendio() {
     //   return stipendio;
  //  }

    public Dipartimento[] getDipartimenti() {
        return dipartimenti;
    }

    public void setDipartimenti(Dipartimento[] nuovidipartimenti) {
        this.dipartimenti = nuovidipartimenti;
    }
    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola" + matricola + "ha fatto check-in");
    }
}

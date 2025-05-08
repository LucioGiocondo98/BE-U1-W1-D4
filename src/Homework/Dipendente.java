package Homework;

public abstract class Dipendente {
    private String matricola;
    //private double stipendio;
    private String [] dipartimenti;

    public static final String PRODUZIONE = "PRODUZIONE";
    public static final String AMMINISTRAZIONE = "AMMINISTRAZIONE";
    public static final String VENDITE = "VENDITE";

    public Dipendente(/*double stipendio,*/ String matricola, String[] dipartimenti) {
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

    public String[] getDipartimenti() {
        return dipartimenti;
    }

    public void setDipartimenti(String[] nuovidipartimenti) {
        this.dipartimenti = nuovidipartimenti;
    }
    public abstract double calculateSalary();
}

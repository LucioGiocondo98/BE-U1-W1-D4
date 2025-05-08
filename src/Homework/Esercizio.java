package Homework;

public class Esercizio {
    public static void main(String[] args) {
        Dipendente[] dipendenti = {
                new DipendenteFullTime("001", new Dipartimento[]{Dipartimento.VENDITE}, 1800.00),
                new DipendentePartTime("002", new Dipartimento[]{Dipartimento.VENDITE}, 88, 12.0),
                new Dirigente("003", new Dipartimento[]{Dipartimento.AMMINISTRAZIONE}, 5000.00, 1000.00)
        };
        for (Dipendente d : dipendenti) {
            System.out.println("Matricola: " + d.getMatricola());
            System.out.print("Dipartimenti: ");
            for (Dipartimento dept : d.getDipartimenti()) {
                System.out.print(dept + " ");
                System.out.println();
                System.out.println("Stipendio: " + d.calculateSalary());
            }
        }
        CheckIn[] presentiOggi={
                new DipendenteFullTime("001", new Dipartimento[]{Dipartimento.PRODUZIONE}, 1800.00),
                new DipendentePartTime("002", new Dipartimento[]{Dipartimento.VENDITE}, 88, 12.0),
                new Dirigente("003", new Dipartimento[]{Dipartimento.AMMINISTRAZIONE}, 5000.00, 1000.00),
                new Volontario("Luca", 25, "Studente di economia"),
                new Volontario("Giulia", 30, "Ex manager HR")
        };

        for (CheckIn c : presentiOggi) {
            c.checkIn();
        }
        }
    }

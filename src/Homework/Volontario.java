package Homework;

public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String curriculum;

    public Volontario(String nome, int eta, String curriculum) {
        this.nome = nome;
        this.eta = eta;
        this.curriculum = curriculum;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCurriculum() {
        return curriculum;
    }

    @Override
    public void checkIn() {
        System.out.println("Volontario " + nome + "ha iniziato il lavoro ");
    }
}

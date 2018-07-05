package hotel;

import java.time.LocalDate;

public class Planning {
    private int numeroChambre;
    private LocalDate jour;
    private int paye;
    private int reservation;
    private int idClient;

    public LocalDate getJour() {
        return jour;
    }

    public Planning(int numeroChambre, LocalDate jour, int paye, int idClient) {
        this.numeroChambre = numeroChambre;
        this.jour = jour;
        this.paye = paye;
        this.reservation = reservation;
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return "Planning{" +
                "numeroChambre=" + numeroChambre +
                ", jour=" + jour +
                ", paye=" + paye +
                ", idClient=" + idClient +
                '}';
    }

    public void setJour(LocalDate jour) {
        this.jour = jour;
    }

    public int getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public int isPaye() {
        return paye;
    }

    public void setPaye(int paye) {
        this.paye = paye;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}

// Visitenkartendruck-Klasse
class Visitenkartendruck {
    private Mitarbeiter mitarbeiter;
    private Druckbar drucker;

    public Visitenkartendruck(Mitarbeiter mitarbeiter, Druckbar drucker) {
        if (mitarbeiter == null || drucker == null) {
            throw new IllegalArgumentException("Mitarbeiter und Drucker dürfen nicht null sein.");
        }
        this.mitarbeiter = mitarbeiter;
        this.drucker = drucker;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        if (mitarbeiter == null) {
            throw new IllegalArgumentException("Mitarbeiter darf nicht null sein.");
        }
        this.mitarbeiter = mitarbeiter;
    }

    public void setDrucker(Druckbar drucker) {
        if (drucker == null) {
            throw new IllegalArgumentException("Drucker darf nicht null sein.");
        }
        this.drucker = drucker;
    }

    public void drucken() {
        drucker.drucken(mitarbeiter);
    }
}

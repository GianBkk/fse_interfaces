public class Main {
    public static void main(String[] args) {
        // Namensschilderdruck-Objekt erstellen
        Druckbar namensschilderdruck = new Namensschilderdruck();

        // Mitarbeiter-Objekt erstellen
        Mitarbeiter mitarbeiter = new Mitarbeiter(1, "Max Mustermann", "max@example.com", "Mitarbeiter");

        // Visitenkartendruck-Objekt erstellen und Namensschilderdruck und Mitarbeiter als Konstruktionsparameter übergeben
        Visitenkartendruck visitenkarte = new Visitenkartendruck(mitarbeiter, namensschilderdruck);

        // Visitenkarte für Mitarbeiter drucken
        visitenkarte.drucken();

        // Rahmendruck-Objekt erstellen
        Druckbar rahmendruck = new Rahmendruck();

        // Visitenkarte in Visitenkartendruck-Objekt aktualisieren
        visitenkarte.setDrucker(rahmendruck);

        // Visitenkarte für Mitarbeiter erneut drucken
        visitenkarte.drucken();
    }
}

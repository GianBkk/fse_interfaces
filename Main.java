public class Main {
    public static void main(String[] args) {
        Druckbar namensschilderdruck = new Namensschilderdruck();
        Mitarbeiter mitarbeiter = new Mitarbeiter(1, "Max Mustermann", "max@example.com", "Mitarbeiter");
        Visitenkartendruck visitenkarte = new Visitenkartendruck(mitarbeiter, namensschilderdruck);
        visitenkarte.drucken();
        Druckbar rahmendruck = new Rahmendruck();
        visitenkarte.setDrucker(rahmendruck);
        visitenkarte.drucken();
    }
}

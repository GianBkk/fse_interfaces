// Rahmendruck-Klasse
class Rahmendruck implements Druckbar {
    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        System.out.println("Visitenkarte (Rahmendruck):");
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("| ID: " + mitarbeiter.getID());
        System.out.println("| Name: " + mitarbeiter.getName());
        System.out.println("| Email: " + mitarbeiter.getEmail());
        System.out.println("| Position: " + mitarbeiter.getPosition());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
}

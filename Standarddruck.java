// Standarddruck-Klasse
class Standarddruck implements Druckbar {
    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        System.out.println("Visitenkarte (Standarddruck):");
        System.out.println("ID: " + mitarbeiter.getID());
        System.out.println("Name: " + mitarbeiter.getName());
        System.out.println("Email: " + mitarbeiter.getEmail());
        System.out.println("Position: " + mitarbeiter.getPosition());
    }
}
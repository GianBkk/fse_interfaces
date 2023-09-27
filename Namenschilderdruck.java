// Namensschilderdruck-Klasse
class Namensschilderdruck implements Druckbar {
    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        System.out.println("Namensschild:");
        System.out.println("Name: " + mitarbeiter.getName());
        System.out.print("ID: " + mitarbeiter.getID() + " ");

        String position = mitarbeiter.getPosition();
        int stars = 0;

        if (position.equals("Mitarbeiter")) {
            stars = 1;
        } else if (position.equals("Abteilungsleiter")) {
            stars = 3;
        } else if (position.equals("CEO")) {
            stars = 4;
        }

        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
// Mitarbeiter-Klasse
class Mitarbeiter extends Person {
    private String Email;
    private String Position;

    public Mitarbeiter(int ID, String Name, String Email, String Position) {
        super(ID, Name);
        this.Email = Email;
        this.Position = Position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
}

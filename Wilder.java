public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + this.firstname + " et je suis aware.";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware.";
        }
    }
}
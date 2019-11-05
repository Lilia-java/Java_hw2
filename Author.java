public class Author {
    String autName;
    String email;
    char gender;

    public Author(String autName, String email, char gender) {
        this.autName = autName;
        this.email = email;
        this.gender = gender;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return autName+", "+email+", "+gender;
    }
}

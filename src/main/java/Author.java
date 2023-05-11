import java.util.List;

public class Author {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Quotes> quotes;

    public List<Quotes> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quotes> quotes) {
        this.quotes = quotes;
    }

    public Author(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

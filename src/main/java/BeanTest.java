import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {


        Author tolkien = new Author(1, "J.R.R", "Tolkien");
        Quotes tolkienQuotes = new Quotes(1, "something here", tolkien);
        Quotes tolkienQuotes2 = new Quotes(2, "something something", tolkien);
        Author csLewis = new Author(2, "C.S", "Lewis");
        Quotes csLewisQuote = new Quotes(1, "Something", csLewis);
        Quotes csLewisQuote2 = new Quotes(2, "something", csLewis);

        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(tolkienQuotes);
        quotes.add(tolkienQuotes2);
        quotes.add(csLewisQuote);
        quotes.add(csLewisQuote2);

        for(Quotes quotes1 : quotes){
            System.out.println(quotes1.getAuthor().getFirstName() + ' ' +
                    quotes1.getAuthor().getLastName() + ' ' +
                    quotes1.getContent());
        }

    }
}

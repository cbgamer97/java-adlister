import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Album album1 = new Album(1L, "Led Zeppelin", "Zeppelin 1", 1973, 8.5, "Classic Rock");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));


        Author tolkien = new Author(1L, "J.R.R", "Tolkien");
        Quotes tolkienQuotes = new Quotes(1L, "something here", tolkien);
        Quotes tolkienQuotes2 = new Quotes(2L, "something something", tolkien);
        Author csLewis = new Author(2L, "C.S", "Lewis");
        Quotes csLewisQuote = new Quotes(3L, "Something", csLewis);
        Quotes csLewisQuote2 = new Quotes(4L, "something", csLewis);

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

import com.testConsoleApp.Main;
import com.testConsoleApp.entities.Author;
import com.testConsoleApp.entities.Book;
import com.testConsoleApp.repository.AuthorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
@Transactional
public class AuthorReposTest {
    @Autowired
    AuthorRepository repos;

    @Test
    public void addAuthorWithBook(){
        Author author = new Author();
        author.setName("Name");
        author.setSurname("Surname");
        Book book = new Book();
        book.setName("Book 1");
        book.setAuthor(author);
        author.getBooks().add(book);
        repos.save(author);

        Author resultAuthor = repos.getSream().findFirst().get();
        assertEquals("Name", resultAuthor.getName());
    }

}

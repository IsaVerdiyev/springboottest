import com.testConsoleApp.Main;
import com.testConsoleApp.entities.Student;
import com.testConsoleApp.entities.Teacher;
import com.testConsoleApp.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Test
    public void addTeacherWithStudentsTest(){

    }
}

import com.ssm.service.bookService;
import com.ssm.service.bookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void bookServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        bookService bookService = context.getBean("bookServiceImpl",bookServiceImpl.class);
        System.out.println(bookService.queryAllBooks().toString());
    }
}

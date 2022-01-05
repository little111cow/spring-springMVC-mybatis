import com.ssm.dao.bookMapper;
import com.ssm.dao.bookMapperImpl;
import com.ssm.entity.Books;
import com.ssm.service.bookService;
import com.ssm.service.bookServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    @Test
    public void bookServiceTest(){

        bookService bookService = context.getBean("bookServiceImpl",bookServiceImpl.class);
        System.out.println(bookService.queryAllBooks().toString());
        System.out.println(bookService.queryBookById(1).toString());
    }

    @Test
    public void bookDaoTest(){
        bookMapper bookMapper = (bookMapper)context.getBean("bookMapperImpl");
        System.out.println(bookMapper.queryBookById(1).toString());
        Books books = context.getBean("books",Books.class);
        books.setBookName("js");
        books.setDetail("dada");
        System.out.println(bookMapper.insertBook(books));
    }
}

import com.zhangbin.pojo.Books;
import com.zhangbin.service.BookSrevice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/9-11:07
 */
public class MyTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookSrevice bookServiceImpl = (BookSrevice) context.getBean("BookServiceImpl");
        List<Books> books = bookServiceImpl.selectAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }
}

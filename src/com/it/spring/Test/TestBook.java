package com.it.spring.Test;

import com.it.spring.entity.Book;
import com.it.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
//        book.setBookId(2);
//        book.setBookName("Java");
//        book.setBookStatus("changed");
//        bookService.addBook(book);
//        System.out.println(book);
//        bookService.updateBook(book);
//        bookService.deleteBook(1);
//        int res = bookService.findCount();
//        Book res = bookService.findOne(1);
//        List<Book> res = bookService.findAll();
//        System.out.println(res.toString());
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"js", "a", 10};
        Object[] o2 = {"c", "b", 11};
        Object[] o3 = {"c++", "c", 12};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);
    }
}

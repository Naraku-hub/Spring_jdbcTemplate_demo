package com.it.spring.service;

import com.it.spring.dao.BookDao;
import com.it.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // 注入Dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public void deleteBook(int id) {
        bookDao.delete(id);
    }

    public int findCount() {
       return bookDao.selectCount();
    }

    public Book findOne(int id) {
        return bookDao.findBookInfo(id);
    }

    public List<Book> findAll() {
        return bookDao.findAllBook();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }

    public void batchUpdate(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }
}

package com.it.spring.dao;

import com.it.spring.entity.Book;

import java.util.List;

public interface BookDao {
    // 新增
    void add(Book book);

    // 修改
    void update(Book book);

    // 删除
    void delete(int id);

    int selectCount();

    Book findBookInfo(int id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);
}

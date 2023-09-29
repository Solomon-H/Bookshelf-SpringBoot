package com.BookStore.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.BookStore.demo.Entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{

}
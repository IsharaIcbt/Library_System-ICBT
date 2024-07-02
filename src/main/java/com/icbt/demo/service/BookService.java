package com.icbt.demo.service;

import com.icbt.demo.dto.BookDTO;
import com.icbt.demo.model.Book;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface BookService {

    Book addNewBook(BookDTO bookDTO);

    List<Book> getAllBooks();

}

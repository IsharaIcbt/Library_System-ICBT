package com.icbt.demo.service.impl;

import com.icbt.demo.dto.BookDTO;
import com.icbt.demo.model.Book;
import com.icbt.demo.repository.BookRepository;
import com.icbt.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book addNewBook(BookDTO bookDTO) {
        log.info("Execute method addNewStudent : @param : {}", bookDTO);
        Book book = null;
        try {
             book = Book.builder()
                     .bookId(bookDTO.getBookId())
                     .title(bookDTO.getTitle())
                     .author(bookDTO.getAuthor())
                     .isbn(bookDTO.getIsbn())
                     .publisher(bookDTO.getPublisher())
                     .yearPublished(bookDTO.getYearPublished())
                     .genre(bookDTO.getGenre())
                     .copiesAvailable(bookDTO.getCopiesAvailable())
                     .build();

            return bookRepository.save(book);

        } catch (Exception e) {
            log.error("Method save student : " + e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


}

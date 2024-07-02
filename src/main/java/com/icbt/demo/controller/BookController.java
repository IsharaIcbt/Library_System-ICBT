package com.icbt.demo.controller;

import com.icbt.demo.dto.BookDTO;
import com.icbt.demo.model.Book;
import com.icbt.demo.service.BookService;
import com.icbt.demo.util.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.icbt.demo.constant.ResponseCodes.OPERATION_SUCCESS;
import static com.icbt.demo.constant.ResponseMessages.SUCCESS_RESPONSE;

@RestController
@CrossOrigin
@RequestMapping("v1/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

   @PostMapping("/add")
    public ResponseEntity<CommonResponse> saveNewUser(@RequestBody BookDTO bookDTO) {
       Book book = bookService.addNewBook(bookDTO);
        CommonResponse commonResponse = new CommonResponse(OPERATION_SUCCESS, book, SUCCESS_RESPONSE);
       return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }


    @GetMapping("/all")
    public ResponseEntity<CommonResponse>fetchAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();

        CommonResponse commonResponse = new CommonResponse(OPERATION_SUCCESS,allBooks, SUCCESS_RESPONSE);
        return new ResponseEntity<>(commonResponse, HttpStatus.OK);
    }


}

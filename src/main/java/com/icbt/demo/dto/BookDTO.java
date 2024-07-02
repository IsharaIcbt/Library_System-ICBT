package com.icbt.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private ObjectId id;
    private int bookId;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int yearPublished;
    private String genre;
    private int copiesAvailable;
}

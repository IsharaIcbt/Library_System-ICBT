package com.icbt.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
    @Id
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

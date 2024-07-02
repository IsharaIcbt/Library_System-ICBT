package com.icbt.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "borrow")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Borrow {
    @Id
    private ObjectId id;
    private int borrowId;
    private int userId;
    private int bookId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private int overDueFine;
}

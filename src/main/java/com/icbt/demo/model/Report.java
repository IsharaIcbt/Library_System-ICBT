package com.icbt.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "report")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Report {
    @Id
    private ObjectId id;
    private int reportId;
    private String reportType;
    private int userId;
    private Date generatedDate;

}

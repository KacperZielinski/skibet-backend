package pl.kz.skibet.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "simpledocument")
public class SimpleDocument {

    @Id
    private String id;
    private String message;
}

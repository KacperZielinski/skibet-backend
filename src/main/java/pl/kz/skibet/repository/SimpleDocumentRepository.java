package pl.kz.skibet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.kz.skibet.model.SimpleDocument;

import java.util.List;

@Repository
public interface SimpleDocumentRepository extends MongoRepository<SimpleDocument, String> {
    List<SimpleDocument> findAll();
}

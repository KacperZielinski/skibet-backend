package pl.kz.skibet.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kz.skibet.model.SimpleDocument;
import pl.kz.skibet.repository.SimpleDocumentRepository;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private SimpleDocumentRepository sdr;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> hello() {
        return Collections.singletonMap("response", "NonDB - Elooo elo 320 !");
    }

    @GetMapping(path = "/dbtest", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> dbHello() {
        SimpleDocument document = new SimpleDocument();
        document.setMessage(String.valueOf(Instant.now().getNano()));
        sdr.save(document);

        List<SimpleDocument> dbResponse = sdr.findAll();
        return Collections.singletonMap("response", "Size: " + dbResponse.size());
    }
}

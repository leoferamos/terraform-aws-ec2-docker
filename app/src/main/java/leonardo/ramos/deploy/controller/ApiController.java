package leonardo.ramos.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> getHora() {
        return ResponseEntity.ok(Instant.now().toString());
    }
}

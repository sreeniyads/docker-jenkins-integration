package learn.sreeni.one.dockerjenkinsintegration.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class FirstController {
    @GetMapping("test") public ResponseEntity<String> firstMethod(){
        return ResponseEntity.ok("Hello world from frist controller :1");
    }
    @GetMapping("second") public ResponseEntity<String> secondMethod(){
        return ResponseEntity.ok("Hello world from second controller :1");
    }
}

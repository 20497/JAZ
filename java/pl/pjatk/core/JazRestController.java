package pl.pjatk.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JazRestController
{
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld()
    {
        return ResponseEntity.status(HttpStatus.OK).body("hello world");
    }

    @GetMapping("/abc")
    public ResponseEntity<String> getAbc()
    {
        return ResponseEntity.status(HttpStatus.OK).body("hello ABC");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCarModel(Car car)
    {
        return ResponseEntity.status(HttpStatus.OK).body(car);
    }
}

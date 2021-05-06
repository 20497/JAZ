package pl.pjatk.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class JazRestHomeworkController
{
    @GetMapping("/getPath/{value}")
    public ResponseEntity<String> getPathVariable(@PathVariable String value)
    {
        return ResponseEntity.ok(value);
    }

    @GetMapping("/getParam")
    public ResponseEntity<String> getRequestParam(@RequestParam String value)
    {
        return ResponseEntity.ok(value);
    }

    @PostMapping("/postBody")
    public ResponseEntity<Car> postBody(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @PutMapping("/putPath/{value}")
    public ResponseEntity<String> putPath(@PathVariable String value)
    {
        return ResponseEntity.ok(value);
    }

    @PutMapping("/putBody")
    public ResponseEntity<Car> putParam(@RequestBody Car car)
    {
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/deletePath/{value}")
    public ResponseEntity<Void> deletePath(@PathVariable String value)
    {
        return ResponseEntity.ok().build();
    }
}

package ru.svasilyev.swords.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.svasilyev.swords.models.TestEntity;
import ru.svasilyev.swords.services.TestService;

import java.util.List;

@RestController
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public ResponseEntity<List<TestEntity>> getTest() {
        return new ResponseEntity<>(testService.getTest(), HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity<TestEntity> postTest(
            @RequestBody TestEntity testEntity) {
        return new ResponseEntity<>(testService.saveTest(testEntity),
                HttpStatus.OK);
    }

    @DeleteMapping("/test/{id}")
    public ResponseEntity<HttpStatus> deleteTest(@PathVariable("id") long id) {
        testService.deleteTest(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

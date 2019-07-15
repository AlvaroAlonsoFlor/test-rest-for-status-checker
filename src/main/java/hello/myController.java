package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class myController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/somewhere")
    public String hello() {

        return "hello! There are this number of people: " + personRepository.count();
    }

}

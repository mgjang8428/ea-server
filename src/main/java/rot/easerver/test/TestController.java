package rot.easerver.test;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    @Autowired
    private TestServiceImpl testService;

    @GetMapping("/status")
    String stats() {
        return "online";
    }

    @GetMapping("/{userName}")
    List<TestEntity> testG(@PathVariable String userName) {
        return testService.testG(userName);
    }

    @PostMapping("/")
    String testC(@RequestBody TestEntity test) {
        testService.testS(test);
        return "OKOK";
    }
}

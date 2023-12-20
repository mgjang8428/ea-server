package rot.easerver.test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestRepository testRepository;
    public void testS(TestEntity test) {
        testRepository.save(test);
        System.out.println(test);
    }

    @Override
    public List<TestEntity> testG(String userName) {
        return testRepository.findByUserName(userName);
    }
}

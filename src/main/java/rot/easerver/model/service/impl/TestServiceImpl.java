package rot.easerver.model.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rot.easerver.model.entity.TestEntity;
import rot.easerver.model.repository.TestRepository;
import rot.easerver.model.service.TestService;

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

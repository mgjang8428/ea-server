package rot.easerver.model.service;

import java.util.List;
import rot.easerver.model.entity.TestEntity;

public interface TestService {
    public void testS(TestEntity test);
    public List<TestEntity> testG(String userName);
}

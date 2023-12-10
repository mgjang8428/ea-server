package rot.easerver.model.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rot.easerver.model.entity.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
    List<TestEntity> findByUserName(String userName);
}

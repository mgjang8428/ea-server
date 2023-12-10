package rot.easerver.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rot.easerver.model.entity.HospitalInfoEntity;
import rot.easerver.model.entity.TestEntity;
@Repository
public interface HospitalInfoRepository  extends JpaRepository<HospitalInfoEntity, Long> {
}

package rot.easerver.hospital;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalInfoRepository  extends JpaRepository<HospitalInfoEntity, Integer> {
    List<HospitalInfoEntity> findByStatusTrue();
}

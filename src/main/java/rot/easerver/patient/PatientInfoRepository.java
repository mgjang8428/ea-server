package rot.easerver.patient;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInfoRepository extends JpaRepository<PatientInfoEntity, Integer> {
    Optional<PatientInfoEntity> findByParamedicNumAndStatusTrue(int paramedicNum);

    Optional<PatientInfoEntity> findByNumberAndStatusTrue(int number);
}

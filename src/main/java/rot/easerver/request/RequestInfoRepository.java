package rot.easerver.request;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestInfoRepository extends JpaRepository<RequestInfoEntity, Integer> {

    Optional<RequestInfoEntity> findByParamedicNumAndStatusTrue(int paramedicNum);
    List<RequestInfoEntity> findByHospitalNumAndStatusTrue(int hospitalNum);
}

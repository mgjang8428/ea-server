package rot.easerver.paramedic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamedicRepository extends JpaRepository<ParamedicEntity, Integer> {
}

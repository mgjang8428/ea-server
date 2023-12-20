package rot.easerver.paramedic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParamedicService {
    @Autowired
    ParamedicRepository paramedicRepository;
}

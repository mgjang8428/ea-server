package rot.easerver.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rot.easerver.model.entity.HospitalInfoEntity;
import rot.easerver.model.repository.HospitalInfoRepository;
import rot.easerver.model.service.HospitalInfoService;
@Service
public class HospitalInfoServiceImpl implements HospitalInfoService {
    @Autowired
    HospitalInfoRepository hospitalInfoRepository;

    @Override
    public List<HospitalInfoEntity> sendAllInfo() {
        return hospitalInfoRepository.findAll();
    }
}

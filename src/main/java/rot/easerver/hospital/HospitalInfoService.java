package rot.easerver.hospital;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rot.easerver.hospital.dto.HospitalInfoSaveDto;

@Service
public class HospitalInfoService {
    @Autowired
    HospitalInfoRepository hospitalInfoRepository;

    public HospitalInfoEntity getOneInfo(int hospitalNum) {
        Optional<HospitalInfoEntity> info = hospitalInfoRepository.findById(hospitalNum);
        return info.get();
    }

    public List<HospitalInfoEntity> getAllInfo() {
        return hospitalInfoRepository.findByStatusTrue();
    }

    public void saveInfo(int hospitalNum, HospitalInfoSaveDto hospitalInfoSaveDto) {
        Optional<HospitalInfoEntity> info = hospitalInfoRepository.findById(hospitalNum);
        info.get().setName(hospitalInfoSaveDto.getName());
        info.get().setAdress(hospitalInfoSaveDto.getAdress());
        info.get().setAvailablePaitientCount(hospitalInfoSaveDto.getAvailablePaitientCount());
        info.get().setMaxPatientConut(hospitalInfoSaveDto.getMaxPatientConut());

        hospitalInfoRepository.save(info.get());
    }

    public void saveCount(int hospitalNum, int count) {
        Optional<HospitalInfoEntity> info = hospitalInfoRepository.findById(hospitalNum);
        info.get().setAvailablePaitientCount(count);
        hospitalInfoRepository.save(info.get());
    }
}

package rot.easerver.patient;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rot.easerver.patient.dto.PatientInfoGetDto;
import rot.easerver.patient.dto.PatientInfoSaveDto;

@Service
public class PatientInfoService {
    @Autowired
    PatientInfoRepository patientInfoRepository;

    public int saveInfo(PatientInfoSaveDto patientInfoSaveDto) {
        PatientInfoEntity patientInfo = new PatientInfoEntity(patientInfoSaveDto);
        patientInfoRepository.save(patientInfo);
        Optional<PatientInfoEntity> patientInfoEntity = patientInfoRepository.findByParamedicNumAndStatusTrue(
                patientInfoSaveDto.getParamedicNum());
        return patientInfoEntity.get().getNumber();
    }

    public PatientInfoGetDto getInfo(int patientNum) {
        Optional<PatientInfoEntity> Info = patientInfoRepository.findByNumberAndStatusTrue(patientNum);
        PatientInfoEntity patientInfo = Info.get();
        PatientInfoGetDto patientInfoGetDto = new PatientInfoGetDto(patientInfo);
        return patientInfoGetDto;
    }
}

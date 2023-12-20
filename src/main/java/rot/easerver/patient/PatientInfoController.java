package rot.easerver.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rot.easerver.patient.dto.PatientInfoGetDto;
import rot.easerver.patient.dto.PatientInfoSaveDto;

@RestController
@RequestMapping("/patient")
public class PatientInfoController {
    @Autowired
    PatientInfoService patientInfoService;

    @PostMapping("/info")
    public int savePatientInfo(@RequestBody PatientInfoSaveDto patientInfoSaveDto) {
        return patientInfoService.saveInfo(patientInfoSaveDto);
    }

    @GetMapping("/info/{patientNum}")
    public PatientInfoGetDto getPatientInfo(@PathVariable int patientNum) {
        return patientInfoService.getInfo(patientNum);
    }
}

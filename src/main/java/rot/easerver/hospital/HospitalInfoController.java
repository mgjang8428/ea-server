package rot.easerver.hospital;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rot.easerver.hospital.dto.HospitalInfoSaveDto;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class HospitalInfoController {
    @Autowired
    private HospitalInfoService hospitalInfoService;

    @GetMapping("/one/{hospitalNum}")
    public HospitalInfoEntity getOneHospitalInfo(@PathVariable int hospitalNum) {
        return hospitalInfoService.getOneInfo(hospitalNum);
    }

    @GetMapping("/list")
    public List<HospitalInfoEntity> getAllHospitalInfo() {
        return hospitalInfoService.getAllInfo();
    }

    @PostMapping("/save/{hospitalNum}")
    public String saveHospitalInfo(@PathVariable int hospitalNum, @RequestBody HospitalInfoSaveDto hospitalInfoSaveDto) {
        hospitalInfoService.saveInfo(hospitalNum, hospitalInfoSaveDto);
        return "OK";
    }

    @PostMapping("/count/{hospitalNum}")
    public String saveAvailablePaitientCount(@PathVariable int hospitalNum, @RequestBody int count) {
        hospitalInfoService.saveCount(hospitalNum, count);
        return "OK";
    }
}

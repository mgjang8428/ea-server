package rot.easerver.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rot.easerver.model.entity.HospitalInfoEntity;
import rot.easerver.model.service.HospitalInfoService;
import rot.easerver.model.service.impl.HospitalInfoServiceImpl;
import rot.easerver.model.service.impl.TestServiceImpl;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class HospitalInfoController {
    @Autowired
    private HospitalInfoService hospitalInfoService;

    @GetMapping("/all")
    public List<HospitalInfoEntity> getAllHospitalInfo() {
        return hospitalInfoService.sendAllInfo();
    }
}

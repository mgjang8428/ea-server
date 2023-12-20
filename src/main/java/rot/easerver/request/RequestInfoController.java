package rot.easerver.request;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rot.easerver.request.dto.RequestInfoGetDto;
import rot.easerver.request.dto.RequestInfoSaveDto;

@RestController
@RequestMapping("/request")
public class RequestInfoController {
    @Autowired
    RequestInfoService requestInfoService;

    @PostMapping("/save")
    public int saveRequestInfo(@RequestBody RequestInfoSaveDto requestInfoSaveDto) {
        return requestInfoService.saveInfo(requestInfoSaveDto);
    }

    @GetMapping("/list/{hospitalNum}")
    public List<RequestInfoGetDto> getRequestList(@PathVariable int hospitalNum) {
        return requestInfoService.listInfo(hospitalNum);
    }

    @GetMapping("/accept/{requestNum}")
    public int getAcceptState(@PathVariable int requestNum) {
        return requestInfoService.checkAccept(requestNum);
    }

    @PostMapping("/accept/{requestNum}")
    public String sendAcceptState(@PathVariable int requestNum, @RequestBody int acceptReject) {
        requestInfoService.saveAcceptRejectState(requestNum, acceptReject);
        return "OK";
    }

    @PostMapping("/status/{requestNum}")
    public String changeRequestState(@PathVariable int requestNum, @RequestBody boolean status) {
        requestInfoService.changeState(requestNum, status);
        return "OK";
    }
}

package rot.easerver.request;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rot.easerver.request.dto.RequestInfoGetDto;
import rot.easerver.request.dto.RequestInfoSaveDto;

@Service
public class RequestInfoService {
    @Autowired
    RequestInfoRepository requestInfoRepository;

    public int saveInfo(RequestInfoSaveDto requestInfoSaveDto) {
        RequestInfoEntity requestInfoEntity = new RequestInfoEntity(requestInfoSaveDto);
        requestInfoRepository.save(requestInfoEntity);
        return requestInfoRepository.findByParamedicNumAndStatusTrue(requestInfoSaveDto.getParamedicNum())
                .get()
                .getNumber();
    }

    public List<RequestInfoGetDto> listInfo(int hospitalNum) {
        List<RequestInfoEntity> requestInfoEntityList = requestInfoRepository.findByHospitalNumAndStatusTrue(
                hospitalNum);
        List<RequestInfoGetDto> infoDtoList = new ArrayList<>();

        for (RequestInfoEntity requestInfoEntity : requestInfoEntityList) {
            RequestInfoGetDto requestInfoGetDto = new RequestInfoGetDto(requestInfoEntity);
            infoDtoList.add(requestInfoGetDto);
        }
        return infoDtoList;
    }

    public int checkAccept(int requestNum) {
        Optional<RequestInfoEntity> info = requestInfoRepository.findById(requestNum);
        return info.get().getAcceptReject();
    }

    public void saveAcceptRejectState(int requestNum, int acceptReject) {
        Optional<RequestInfoEntity> info = requestInfoRepository.findById(requestNum);
        info.get().setAcceptReject(acceptReject);
        requestInfoRepository.save(info.get());
    }

    public void changeState(int requestNum, boolean status) {
        Optional<RequestInfoEntity> info = requestInfoRepository.findById(requestNum);
        info.get().setStatus(status);
        requestInfoRepository.save(info.get());
    }
}

package rot.easerver.request.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rot.easerver.request.RequestInfoEntity;

@Getter @Setter
@NoArgsConstructor
public class RequestInfoGetDto {
    private int number;
    private int hospitalNum;
    private int paitientNum;
    private int paramedicNum;
    private LocalDateTime requestDateTime;
    private int grade;//응급도

    public RequestInfoGetDto(RequestInfoEntity requestInfoEntity) {
        this.number = requestInfoEntity.getNumber();
        this.hospitalNum = requestInfoEntity.getHospitalNum();
        this.paitientNum = requestInfoEntity.getPaitientNum();
        this.paramedicNum = requestInfoEntity.getParamedicNum();
        this.requestDateTime = requestInfoEntity.getRequestDateTime();
        this.grade = requestInfoEntity.getGrade();
    }
}

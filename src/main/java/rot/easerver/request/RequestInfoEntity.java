package rot.easerver.request;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rot.easerver.request.dto.RequestInfoSaveDto;

@Entity
@Getter @Setter
@NoArgsConstructor
public class RequestInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private int hospitalNum;
    private int paitientNum;
    private int paramedicNum;
    private LocalDateTime requestDateTime;
    private int grade;//응급도
    private int acceptReject;//수락거절 0: empty, 1: accept, -1: reject
    private boolean status;

    public RequestInfoEntity(RequestInfoSaveDto requestInfoSaveDto) {
        this.hospitalNum = requestInfoSaveDto.getHospitalNum();
        this.paitientNum = requestInfoSaveDto.getPaitientNum();
        this.paramedicNum = requestInfoSaveDto.getParamedicNum();
        this.requestDateTime = LocalDateTime.now();
        this.grade = requestInfoSaveDto.getGrade();
        this.acceptReject = 0;
        this.status = true;
    }
}

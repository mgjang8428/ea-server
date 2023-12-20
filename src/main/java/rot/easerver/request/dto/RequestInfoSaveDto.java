package rot.easerver.request.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class RequestInfoSaveDto {
    private int hospitalNum;
    private int paitientNum;
    private int paramedicNum;
    private int grade;//응급도

    public RequestInfoSaveDto(int hospitalNum, int paitientNum, int paramedicNum, int grade) {
        this.hospitalNum = hospitalNum;
        this.paitientNum = paitientNum;
        this.paramedicNum = paramedicNum;
        this.grade = grade;
    }
}

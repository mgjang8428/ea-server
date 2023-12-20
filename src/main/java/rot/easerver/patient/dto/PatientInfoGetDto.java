package rot.easerver.patient.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rot.easerver.patient.PatientInfoEntity;

@Getter @Setter
@NoArgsConstructor
public class PatientInfoGetDto {
    private int number;
    private int paramedicNum;
    private String name;
    private String symptom;//증상
    private String disease;//병명
    private String chronicIllness;//지병
    private LocalDateTime transDateTime;//수송일시

    public PatientInfoGetDto(PatientInfoEntity patientInfo) {
        this.number = patientInfo.getNumber();
        this.paramedicNum = patientInfo.getParamedicNum();
        this.name = patientInfo.getName();
        this.symptom = patientInfo.getSymptom();
        this.disease = patientInfo.getDisease();
        this.chronicIllness = patientInfo.getChronicIllness();
        this.transDateTime = patientInfo.getTransDateTime();
    }
}

package rot.easerver.patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rot.easerver.patient.dto.PatientInfoSaveDto;

@Entity
@Getter @Setter
@NoArgsConstructor
public class PatientInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private int paramedicNum;
    private String name;
    private String symptom;//증상
    private String disease;//병명
    private String chronicIllness;//지병
    private LocalDateTime transDateTime;//수송일시
    private boolean status;

    public PatientInfoEntity(PatientInfoSaveDto patientInfoSaveDto) {
        this.paramedicNum = patientInfoSaveDto.getParamedicNum();
        this.name = patientInfoSaveDto.getName();
        this.symptom = patientInfoSaveDto.getSymptom();
        this.disease = patientInfoSaveDto.getDisease();
        this.chronicIllness = patientInfoSaveDto.getChronicIllness();
        this.transDateTime = LocalDateTime.now();
        this.status = true;
    }
}

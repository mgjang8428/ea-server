package rot.easerver.patient.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class PatientInfoSaveDto {
    private int paramedicNum;
    private String name;
    private String symptom;//증상
    private String disease;//병명
    private String chronicIllness;//지병
}

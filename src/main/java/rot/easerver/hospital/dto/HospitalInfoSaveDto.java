package rot.easerver.hospital.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class HospitalInfoSaveDto {
    private String name;
    private String adress;
    private int availablePaitientCount;
    private int maxPatientConut;
}

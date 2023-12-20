package rot.easerver.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
public class HospitalInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private String name;
    private String adress;
    private double lat;
    private double lng;
    private int availablePaitientCount;
    private int maxPatientConut;
    private boolean open;
    private boolean status;


}

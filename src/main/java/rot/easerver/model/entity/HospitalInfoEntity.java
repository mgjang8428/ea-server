package rot.easerver.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class HospitalInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalNum;
    private String hospitalName;
    private String hospitalAdress;
    private double hospitalLat;
    private double hospitalLng;
}

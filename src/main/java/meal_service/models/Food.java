package meal_service.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
//@Embeddable
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
//    private Long foodItemId;
    private Enum foodType;
    private String name;
    private Enum unit;
    private Double energyPer100g;
    private Double energyPer100ml;
    private Double proteinPer100g;
    private Double fatsPer100g;
    private Double carbsPer100g;
    private Double proteinPer100ml;
    private Double fatsPer100ml;
    private Double carbsPer100ml;
}

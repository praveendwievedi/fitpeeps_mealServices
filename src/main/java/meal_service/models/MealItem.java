package meal_service.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class MealItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long mealItemId;

    @ManyToOne
    private Meal meal;

    @ManyToOne
    private Food food;

    private Double quantity;

    @Enumerated(EnumType.STRING)
    private Unit foodType;
}

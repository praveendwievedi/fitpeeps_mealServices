package meal_service.dtos;

import java.util.List;

public record MealRequest(String mealType, List<FoodItem> foodItems, Float mealCalorie) {
}

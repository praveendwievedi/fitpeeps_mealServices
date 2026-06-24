package meal_service.dtos;

public record FoodRequest(String name,
                          String foodType,
                          Double energyPer100g,
                          Double energyPer100ml,
                          Double proteinPer100g,
                          Double fatsPer100g,
                          Double carbsPer100g,
                          Double proteinPer100ml,
                          Double fatsPer100ml,
                          Double carbsPer100ml
) {
}

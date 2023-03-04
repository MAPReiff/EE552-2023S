public class NutritionFactsMain {
  public static void main(String[] args) {
    // TODO use your NutritionFactsBuilder to build the nutrition facts for some of your favorite foods
    NutritionFacts friedRice = NutritionFacts.builder()
      .addServingSize("1 cup")
      .addCalories(283)
      .addTotalFat(4.1)
      .addSaturatedFat(0.7)
      .addTransFat(0.0)
      .addPolyunsaturatedFat(1.5)
      .addMonounsaturatedFat(0.9)
      .addCholesterol(25)
      .addSodium(530)
      .addTotalCarbohydrates(45)
      .addDietaryFiber(1.5)
      .addSugars(0.8)
      .addProtein(5.5)
      .build();
    NutritionFacts apple = NutritionFacts.builder()
      .addServingSize("1 serving")
      .addCalories(95)
      .addTotalFat(0)
      .addSugars(19)
      .addDietaryFiber(3.2)
      .build();
    System.out.println(apple);
    System.out.println(friedRice);
  }
}

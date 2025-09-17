class FoodRatings {
    HashMap<String,HashMap<String,Integer>> ls;
    HashMap<String,String> ls1;
    public FoodRatings(String[] f, String[] c, int[] r) {
        ls=new HashMap<>();
        ls1=new HashMap<>(); 
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            ls1.putIfAbsent(f[i],c[i]);
            ls.computeIfAbsent(c[i],k -> new HashMap<>()).put(f[i],r[i]);
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = ls1.get(food);   // find cuisine in O(1)
    
    // update maps
    // foodToRating.put(food, newRating);
    ls.get(cuisine).put(food, newRating);
    }
    
   public String highestRated(String cuisine) {
    HashMap<String, Integer> foods = ls.get(cuisine);
    
    String bestFood = "";
    int bestRating = -1;
    
    for (Map.Entry<String, Integer> entry : foods.entrySet()) {
        String food = entry.getKey();
        int rating = entry.getValue();
        
        if (rating > bestRating || (rating == bestRating && food.compareTo(bestFood) < 0)) {
            bestRating = rating;
            bestFood = food;
        }
    }
    return bestFood;
}
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
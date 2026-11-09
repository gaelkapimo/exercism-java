public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int couche){
        return couche * 2;
    }

    public int totalTimeInMinutes(int couche, int totalMin){
        return preparationTimeInMinutes(couche) + totalMin;
    }
}

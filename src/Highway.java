// Benjamin L

public class Highway {
    private int fromCity, toCity, distance;

    public Highway(int from, int to, int distance){
        fromCity = from;
        toCity = to;
        this.distance = distance;
    }

    public int getFromCity() {
        return fromCity;
    }

    public int getToCity() {
        return toCity;
    }

    public int getDistance() {
        return distance;
    }

    public int findTheCity(int search){
        if(fromCity == search){
            return toCity;
        }
        else
            return fromCity;
    }


}


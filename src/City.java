// Benjamin L

import java.util.ArrayList;


public class City {
    private int distance = 1000000;
    private boolean visited;
    private ArrayList<Highway> highway = new ArrayList<>();
    private int hotelCost;


    public int getHotelCost(){
        return hotelCost;
    }

    public void setHotelCost(int h){
        hotelCost = h;
    }

    public int getDistance(){
        return distance;
    }

    public void  setDistance(int d){
        distance = d;
    }

    public boolean getVisited(){
        return visited;
    }

    public boolean setVisited(boolean v){
        return visited = v;
    }

    public ArrayList<Highway> getHighway(){
        return highway;
    }
}

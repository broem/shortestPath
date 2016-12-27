// Benjamin L

import java.util.ArrayList;

public class Dijkstra {

    private City[] cities;
    private Highway[] highways;
    private int numCities;
    private int numHighways;

    public Dijkstra(Highway[] highways, int[] hotels){

        this.highways = highways;
        numCities = calc(highways);

        cities = new City[numCities];

        for(int i=0; i<numCities; i++){
            cities[i] = new City();
            cities[i].setHotelCost(hotels[i]);

        }
        numHighways = highways.length;

        for(int i=0; i<numHighways; i++){
            cities[highways[i].getFromCity()].getHighway().add(highways[i]);
            cities[highways[i].getToCity()].getHighway().add(highways[i]);
        }
    }

    private int calc(Highway[] highways){
        int num=0;
        for(Highway h: highways){
            if(h.getToCity() > num){
                num = h.getToCity();
            }
            if(h.getFromCity() > num){
                num = h.getFromCity();
            }
        }
        num++;
        return num;
    }

    public void shortestDistance(){
        //initialize
        cities[0].setDistance(0);
        //cities[0].setHotelCost(0);
        int nCity=0;

        for(int i=0; i<cities.length; i++){
            ArrayList<Highway> cityStreetz = cities[nCity].getHighway();
            for(int j=0; j<cityStreetz.size(); j++){
                int nextCity = cityStreetz.get(j).findTheCity(nCity);
                if(!cities[nextCity].getVisited()){
                    int temp = cities[nCity].getDistance() + cityStreetz.get(j).getDistance() + cities[nextCity].getHotelCost();

                    if(cities[nextCity].getDistance() == 1000000 || temp < (cities[nextCity].getDistance())){ //+ cities[nextCity].getHotelCost())){
                        cities[nextCity].setDistance(temp);
                        //cities[nextCity].setHotelCost();
                    }
                }
            }
            cities[nCity].setVisited(true);
            nCity = getShort();
        }
    }

    public void print(){
        System.out.println(cities[1].getDistance());
    }

    public int getShort(){
        int tempCity = 0;
        int tempDist = 1000000;
        for(int i=0; i<cities.length; i++){
            int cd = cities[i].getDistance();//+ cities[i].getHotelCost();
            if(cd < tempDist && !cities[i].getVisited()){
                tempDist = cd;
                tempCity = i;
            }
        }
        return tempCity;
    }



}

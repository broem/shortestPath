// Benjamin Leach

import java.util.Scanner;


public class SimpleDijkstra {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        int cities = in.nextInt();

        int highways = in.nextInt();

        int[] cityHotel = new int[cities];
        for(int i=2; i<cities; i++){
            in.nextInt();
            cityHotel[i] = in.nextInt();
        }



        Highway[] highway = new Highway[highways];
        for(int i=0; i<highways; i++){
            highway[i] = new Highway(in.nextInt()-1, in.nextInt()-1, in.nextInt());
        }

        Dijkstra some = new Dijkstra(highway, cityHotel);
        some.shortestDistance();
        some.print();

    }

}

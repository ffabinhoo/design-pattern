package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building());
        buildingList.add(new Building());
        //printBuildings(buildingList);

        List<Store> storeList = new ArrayList<>();
        storeList.add(new Store());
        storeList.add(new Store());
        //printBuildings(storeList);

        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House());

        //addHouseToList(houseList);
        addHouseToList(buildingList);

    }

    //public static void addHouseToList(List<House> houseList) {
    public static void addHouseToList(List<? super House> houseList) {
        houseList.add(new House());
        houseList.stream().forEach(System.out::println);
    }


    //public static void printBuildings(List<Building> buildingList){
    public static void printBuildings(List<? extends Building> buildingList){
        buildingList.stream().forEach(System.out::println);
    }
}

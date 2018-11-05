package models;

import java.util.ArrayList;
import java.util.List;

public class AllFares {

    private static List<Fare> allFares = new ArrayList<>();

    public static List<Fare> getAllFares() {
        return allFares;
    }

    public static void setAllFares(List<Fare> allFares) {
        AllFares.allFares = allFares;
    }
}

package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
Date todaysDate = new Date();

            ArrayList<MenuItem> items = new ArrayList<>();
        MenuItem burger = new MenuItem(2,"Burger","Entree",true);
            items.add(burger);
            System.out.println(burger);
            Menu menu = new Menu( todaysDate,items);
//        menu.add("Hot Dog");
//        menu.add("Pizza");
//        menu.add("Ice Cream");
//

        // write your code here
    }
}


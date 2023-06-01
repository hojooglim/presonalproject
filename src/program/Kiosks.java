package program;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosks {
    Kiosks(){}
    Scanner input = new Scanner(System.in);
    static int t; // waiting number
    static char start; //While start
    static int press; //mainFood button
    static String Burgers; //sub1 Burgers
    static double BurgersPrice; // sub1 BurgersPrice
    static String Drinks; //sub2 Drinks
    static double DrinksPrice; // sub2 DrinksPrice
    static String iceCreams; //sub2 Drinks
    static double iceCreamsPrice; // sub2 DrinksPrice
    static char add; // all while , order, cancel

    static double totalPrice;

    int mainMenu() {
        return press;
    }

    void Burgers() {}

    void Drinks() {}

    void iceCreams() {}

    static boolean adds;

    boolean addFood() {
        return adds;
    }

    char cancelFood() {
        return add;
    }

    char menuOrder() {
        return add;
    }

    void finish() {
    }


    static ArrayList Foods = new ArrayList();

    static String foodsname; //sub1 Burgers
    static double foodsPrice; // sub1 BurgersPrice

    void foodorderr(){}
    static String FoodsList(String menu, double Price) {
        return String.format(menu + Price);
    }


}
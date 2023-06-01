package program;

import java.util.Scanner;

public class addFood extends Kiosks {
    addFood(){}
    boolean addFood(){
        if (Kiosks.press == 1){
            System.out.println(Kiosks.Burgers +"    "+"| W "+ Kiosks.BurgersPrice+" |");
        } else if (Kiosks.press == 2) {
            System.out.println(Kiosks.Drinks +"    "+"| W "+ Kiosks.DrinksPrice+" |");
        } else if (Kiosks.press == 3) {
            System.out.println(Kiosks.iceCreams +"    "+"| W "+ Kiosks.iceCreamsPrice+" |");
        }

        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println(" 1. 확인      2. 취소 ");

        int button = input.nextInt();

        if (button == 1){
            adds=true;
            if (Kiosks.press == 1){
                System.out.println(Kiosks.Burgers +"가 장바구니에 추가되었습니다.");
                if (Kiosks.adds == true){
                    Kiosks.Foods.add(Kiosks.FoodsList(Kiosks.Burgers, Kiosks.BurgersPrice));
                    Kiosks.totalPrice = Kiosks.totalPrice + Kiosks.BurgersPrice;
                } else {
                    System.out.println("주문이 취소되었습니다.");
                }
            } else if (Kiosks.press == 2) {
                System.out.println(Kiosks.Drinks +"가 장바구니에 추가되었습니다.");
                if (Kiosks.adds == true){
                    Kiosks.Foods.add(Kiosks.FoodsList(Kiosks.Drinks, Kiosks.DrinksPrice));
                    Kiosks.totalPrice = Kiosks.totalPrice + Kiosks.DrinksPrice;
                } else {
                    System.out.println("주문이 취소되었습니다.");
                }
            } else if (Kiosks.press == 3) {
                System.out.println(Kiosks.iceCreams +"가 장바구니에 추가되었습니다.");
                if (Kiosks.adds == true){
                    Kiosks.Foods.add(Kiosks.FoodsList(Kiosks.iceCreams, Kiosks.iceCreamsPrice));
                    Kiosks.totalPrice = Kiosks.totalPrice + Kiosks.iceCreamsPrice;
                } else {
                    System.out.println("주문이 취소되었습니다.");
                }
            }
            System.out.println("");
            return adds;
        } else if (button == 2) {
            System.out.println("주문을 취소합니다.");
            adds=false;
            return adds;
        } else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
            return false;
        }

    }
}

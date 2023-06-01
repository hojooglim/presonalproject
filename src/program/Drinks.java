package program;

import java.util.Scanner;

public class Drinks extends Kiosks {
    Drinks(){}
    void Drinks(){
        System.out.println("안녕하세요 SHAKESHAKE BURGER에  오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 골라 입력해주세요");
        System.out.println("");

        System.out.println("[ Drinks MENU ]");
        System.out.println("1. Coke         | W 2.8 |");
        System.out.println("2. Water        | W 1.5 |");
        System.out.println("3. Lemonade     | W 4.1 |");
        System.out.println("4. Iced Tea     | W 3.4 |");



        int button = input.nextInt();

        if (button == 1){
            Drinks = "Coke";
            DrinksPrice = 2.8;
        } else if (button == 2) {
            Drinks = "Water";
            DrinksPrice = 1.5;
        } else if (button == 3) {
            Drinks = "Lemonade";
            DrinksPrice = 4.1;
        } else if (button == 4) {
            Drinks = "Iced Tea";
            DrinksPrice = 3.4;
        } else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
        }

    }
}

package program;

import java.util.Scanner;

public class iceCreams extends Kiosks {
    iceCreams(){}
    void iceCreams(){
        System.out.println("안녕하세요 SHAKESHAKE BURGER에  오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 골라 입력해주세요");
        System.out.println("");

        System.out.println("[ Custard MENU ]");
        System.out.println("1. Classic Shakes       | W 6.5 |");
        System.out.println("2. Floats               | W 6.5 |");
        System.out.println("3. Cup&Cones            | W 5.4 |");



        int button = input.nextInt();

        if (button == 1){
            iceCreams = "Classic Shakes";
            iceCreamsPrice = 6.5;
        } else if (button == 2) {
            iceCreams = "Floats";
            iceCreamsPrice = 6.5;
        } else if (button == 3) {
            iceCreams = "Cup&Cones";
            iceCreamsPrice = 5.4;
        }  else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
        }

    }
}

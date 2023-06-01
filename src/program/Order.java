package program;

import java.util.Scanner;

public class Order extends Kiosks {
    Order(){}
    char menuOrder(){
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("");

        System.out.println("[ Orders ]");
        for (int i = 0 ; i<Foods.size() ;i++ ){
            System.out.println(Foods.get(i));
        } // 전체 오더메뉴

        System.out.println("");

        System.out.println("[ Total ]");
        System.out.println("| W " + Kiosks.totalPrice + " |");
        System.out.println(" 1. 주문      2. 메뉴판 ");

        int button = input.nextInt();

        if (button==1){
            add = 'N';
        } else if (button==2) {
            add ='Y';
        } else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
        }

        return add;
    }
}

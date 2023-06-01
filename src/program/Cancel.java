package program;

import java.util.Scanner;

public class Cancel extends Kiosks {
    Cancel(){}
    char cancelFood(){

        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println(" 1. 확인      2. 취소 ");

        int button = input.nextInt();

        if (button == 1){
            add = 'N';
            System.out.println("진행하던 주문이 취소되었습니다.");
        } else if (button == 2) {
            add = 'Y';
        } else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
        }
        return add;
    }
}

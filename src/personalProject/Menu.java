package personalProject;

import personalProject.Kiosks;

public class Menu extends Kiosks {
    Menu(){}
    int mainMenu(){
        System.out.println("안녕하세요 SHAKESHAKE BURGER에  오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 골라 입력해주세요");
        System.out.println("");

        System.out.println("[SHAKESHAKE MENU]");
        System.out.println("1. Burgers          | 앵거스 비프 버거");
        System.out.println("2. Drinks           | 음료");
        System.out.println("3. Custard          | 아이스크림");
        System.out.println("");

        System.out.println("[ORDER MENU]");
        System.out.println("4. Order        | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");


        int button = input.nextInt();
        
        
        
        if (button == 1){
            press= 1;
        } else if (button == 2) {
            press= 2;
        } else if (button == 3) {
            press= 3;
        } else if (button == 4) {
            press= 4;
        } else if (button == 5) {
            press= 5;
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        return press;
    }
}

package personalProject;

public class Burgers extends Kiosks {
    Burgers(){}
    void Burgers(){
        System.out.println("안녕하세요 SHAKESHAKE BURGER에  오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 골라 입력해주세요");
        System.out.println("");

        System.out.println("[ Burgers MENU ]");
        System.out.println("1. ShackBurger      | W 6.9 |");
        System.out.println("2. SmokeShack       | W 8.9 |");
        System.out.println("3. ShrimpBurger     | W 9.4 |");
        System.out.println("4. CheeseBurger     | W 6.9 |");
        System.out.println("5. Hamburger        | W 5.4 |");


        int button = input.nextInt();

        if (button == 1){
            Burgers = "ShackBurger";
            BurgersPrice = 6.9;
        } else if (button == 2) {
            Burgers = "SmokeShack";
            BurgersPrice = 8.9;
        } else if (button == 3) {
            Burgers = "ShrimpBurger";
            BurgersPrice = 9.4;
        } else if (button == 4) {
            Burgers = "CheeseBurger";
            BurgersPrice = 6.9;
        } else if (button == 5) {
            Burgers = "Hamburger";
            BurgersPrice = 5.4;
        } else {
            System.out.println("잘못 입력하셨습니다. 메뉴선택으로 돌아갑니다.");
        }

    }
}

package personalProject;

public class Main {
    public static void main(String[] args) {
        Menu first = new Menu();
        Kiosks second = new Burgers();
        Kiosks third = new Drinks();
        Kiosks four = new iceCreams();
        Kiosks add = new addFood();
        Kiosks order = new Order();
        Kiosks cancel = new Cancel();
        Kiosks finish = new finish();

        Menu test = new Menu();
        Kiosks.start = 'S';
        Kiosks.t = 1;



        while (Kiosks.start == 'S'){
            Kiosks.add = 'Y';
            Kiosks.totalPrice = 0.00;
            Kiosks.Foods.clear();

            while (Kiosks.add == 'Y'){
                first.mainMenu();
                if (Kiosks.press == 1){
                    second.Burgers();
                    add.addFood();
                } else if (Kiosks.press == 2) {
                    third.Drinks();
                    add.addFood();
                } else if (Kiosks.press == 3) {
                    four.iceCreams();
                    add.addFood();
                } else if (Kiosks.press == 4) {
                    order.menuOrder();
                    if(Kiosks.add == 'N'){
                        finish.finish();
                    }
                } else if (Kiosks.press == 5) {
                    cancel.cancelFood();
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }

            }

        }

    }
}

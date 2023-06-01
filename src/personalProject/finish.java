package personalProject;

public class finish extends Kiosks {
    finish(){}
    void finish(){
        System.out.println("주문이 완료되었습니다.");
        System.out.println("대기번호는 " + t + " 번 입니다.");
        t++;
        System.out.println("3초후 메뉴판으로 돌아갑니다. \n");

        try {
        Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

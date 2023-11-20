package day01;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        Player player1 = new Player();
        player1.name = "player01";
        Player player2 = new Player();
        player2.name = "player02";

        while(true){
            player1.weapon = (int)(Math.random()*3)+1;
            player2.weapon = (int)(Math.random()*3)+1;

            if(player1.weapon == player2.weapon){
                continue;
            }
            else if((player1.weapon==1 && player2.weapon==3) || (player1.weapon == 2 && player2.weapon == 1) || (player1.weapon == 3 && player2.weapon ==2)){
                System.out.println("player1 win");
                break;
            } else {
                System.out.println("player2 win");
                break;
            }
        }

        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.

        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택

        // player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        
        // 둘 중에 이긴 사람 출력, 무승부면 계속 반복


    }
}

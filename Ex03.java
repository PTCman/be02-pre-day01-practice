package day01;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for(int i=0;i<5;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *   1
            ***  3
           ***** 5
          ******* 7
         ********* 9
         ----------
         */
        System.out.println();


        int a = 1;
        int k = 5;
        for(int i=0;i<5;i++){
            for(int z = k;z>0;z--){
                System.out.print(" ");
            }
            for(int j=0;j<i+a;j=j+2){
                System.out.print("*");
            }
            a = a+3;
            k--;
            System.out.println();
        }
    }
}

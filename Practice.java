package day01;

public class Practice {
    public static void main(String[] args) {
        // 강지흔 학생의 객체를 생성해서 저장한다.
        // 강지흔 학생의 객체의 나이에 26을 저장한다.
        // 강지흔 학생의 객체의 이름에 "강지흔"을 저장한다.

        Student kjh = new Student();
        kjh.age = 26;
        kjh.name = "강지흔";

        // 한경훈 학생의 객체를 생성해서 저장한다.
        // 한경훈 학생의 객체의 나이에 25을 저장한다.
        // 한경훈 학생의 객체의 이름에 "한경훈"을 저장한다.

        Student hkh = new Student();
        hkh.age = 25;
        hkh.name = "한경훈";

        // 임태우 학생의 객체를 생성해서 저장한다.
        // 임태우 학생의 객체의 나이에 27을 저장한다.
        // 임태우 학생의 객체의 이름에 "임태우"을 저장한다.

        Student ltw = new Student();
        ltw.age = 27;
        ltw.name = "임태우";

        // 이주현 학생의 객체를 생성해서 저장한다.
        // 이주현 학생의 객체의 나이에 23을 저장한다.
        // 이주현 학생의 객체의 이름에 "이주현"을 저장한다.

        Student ljh = new Student();
        ljh.age = 23;
        ljh.name = "이주현";

        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한다.
        Integer result = kjh.age + hkh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한다.
        Integer result2 = ltw.age + ljh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한다.
        result2 = result2 * kjh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈다.
        result2 = result2 / hkh.age;

        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한 값이
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈 값보다
        // 큰지 비교한다.


        // 결과를 화면에 출력한다.
        System.out.println(result > result2);
    }
}

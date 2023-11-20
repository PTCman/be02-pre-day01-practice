package day01;

public class School {
    public static void main(String[] args) {
        Subject linux = new Subject();
        Subject db = new Subject();
        Subject sw = new Subject();

        linux.name = "리눅스";
        linux.time = 2;

        db.name = "DB";
        db.time = 8;

        sw.name = "SW공학";
        sw.time = 3;
    }
}

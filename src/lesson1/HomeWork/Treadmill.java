package lesson1.HomeWork;

public class Treadmill implements Obstacle {
    Integer howLongisTreadmill;
    void treadmillRun(Runner member, Integer howLongCanRun) {
        System.out.println(member.run(howLongCanRun,howLongisTreadmill) + " over treadmill");
    }
}

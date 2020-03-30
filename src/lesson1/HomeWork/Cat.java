package lesson1.HomeWork;

public class Cat implements Member {

    Integer howHighCanJump;
    Integer howLongCanRun;

    @Override
    public String jump(Integer howHighCanJump,Integer howHighIsWall) {
        if (howHighCanJump > howHighIsWall) {
            return "Cat jump successfully";
        } else {
            return "Cat jump unsuccessful";
        }
    }

    @Override
    public String run(Integer howLongCanRun, Integer howLongisTreadmill) {
        if (howLongisTreadmill > howLongCanRun) {
            return "Cat run successfully";
        } else {
            return "Cat could not run successfully";
        }
    }
}

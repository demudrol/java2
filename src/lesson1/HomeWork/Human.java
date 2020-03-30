package lesson1.HomeWork;

public class Human implements Member {

    Integer howHighCanJump;
    Integer howLongCanRun;

    @Override
    public String jump(Integer howHighCanJump,Integer howHighIsWall) {
        if (howHighCanJump > howHighIsWall) {
            return "Human jump successfully";
        } else {
            return "Human jump unsuccessful";
        }
    }

    @Override
    public String run(Integer howLongCanRun, Integer howLongisTreadmill) {
        if (howLongisTreadmill > howLongCanRun) {
            return "Human run successfully";
        } else {
            return "Human could not run successfully";
        }
    }
}

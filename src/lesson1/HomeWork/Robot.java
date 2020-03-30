package lesson1.HomeWork;

import org.omg.PortableInterceptor.INACTIVE;

public class Robot implements Member {

    Integer howHighCanJump;
    Integer howLongCanRun;

    @Override
    public String jump(Integer howHighCanJump,Integer howHighIsWall) {
        if (howHighCanJump > howHighIsWall) {
            return "Robot jump successfully";
        } else {
            return "Robot jump unsuccessful";
        }
    }

    @Override
    public String run(Integer howLongCanRun, Integer howLongisTreadmill) {
        if (howLongisTreadmill > howLongCanRun) {
            return "Robot run successfully";
        } else {
            return "Robot could not run successfully";
        }
    }
}

package lesson1.HomeWork;

public class Main {
    public static void main(String[] args) {
//        Member[] membersList = new Member[3];
//        Member cat = new Cat();
//        Member human = new Human();
//        Member robot = new Robot();
//        membersList[0] = cat;
//        membersList[0].howHighCanJump(6);
//        membersList[0].howLongCanRun(50);
//        membersList[1] = human;
//        membersList[1].howHighCanJump(2);
//        membersList[1].howLongCanRun(100);
//        membersList[2] = robot;
//        membersList[2].howHighCanJump(5);
//        membersList[2].howLongCanRun(500);
//
//        Obstacle[] obstaclesList = new Obstacle[4];
//        Obstacle treadmill = new Treadmill();
//        Obstacle wall = new Wall();
//        obstaclesList[0] = wall;
//        obstaclesList[0].howHighIsWall = 10;
//        obstaclesList[1] = treadmill;
//        obstaclesList[1].howLongisTreadmill = 100;
//        obstaclesList[2] = wall;
//        obstaclesList[2].howHighIsWall = 3;
//        obstaclesList[3] = treadmill;
//        obstaclesList[3].howLongisTreadmill = 50;

//        Wall mywall = new Wall();
//        mywall.wallJump(membersList[0],obstaclesList[0].howHighIsWall);

        Cat cat = new Cat();
        cat.howHighCanJump = 5;
        cat.howLongCanRun = 110;
        Human human = new Human();
        human.howHighCanJump = 1;
        human.howLongCanRun = 50;
        Robot robot = new Robot();
        robot.howHighCanJump = 10;
        robot.howLongCanRun = 200;
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        treadmill.howLongisTreadmill = 100;
        wall.howHighIsWall = 5;
        wall.wallJump(cat,cat.howHighCanJump);
        treadmill.treadmillRun(robot, robot.howLongCanRun);
    }
}

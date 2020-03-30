package lesson1.HomeWork;

public class Wall implements Obstacle {
    Integer howHighIsWall;
    void wallJump(Jumper member, Integer howHighCanJump) {
        System.out.println(member.jump(howHighCanJump,howHighIsWall) + " over wall");
    }

}

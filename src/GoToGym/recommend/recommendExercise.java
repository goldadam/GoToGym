package GoToGym.recommend;


import GoToGym.IOMethod.IoView;

import java.util.Scanner;
/*
Exercise중 하고싶은 운동을 골라줌
 */
public class recommendExercise {
    private static IoView io = new IoView();
    private static Scanner sc = new Scanner(System.in);
    public static void recommendExercises(){
        int select = 0;
        io.output("초심자를 위한 운동추천입니다.");
        io.output("하고싶은 운동을 골라주세요");
        io.output("======================================");
        io.output("<가슴> : (1) , <등> : (2) , <하체> : (3), <종료> : (4)");
        select = sc.nextInt();
        selectRecommendExercise(select);
    }

    public static void selectRecommendExercise(int num){
        switch(num){
            case 1:
                io.output("가슴 오마카세입니다.");
                recommendChest.chestExercise();
                break;
            case 2:
                io.output("등 오마카세입니다.");
                recommendBack.backExercise();
                break;
            case 3:
                io.output("하체 오마카세입니다.");
                recommendLeg.legExercise();
                break;
            case 4:
                io.output("프로그램을 종료합니다.");
                System.exit(1);
            default:
                io.output("잘못된 숫자를 입력하셨습니다.");
                break;
        }
    }
}

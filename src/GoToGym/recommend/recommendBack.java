package GoToGym.recommend;

import GoToGym.IOMethod.IoView;

import java.util.Scanner;

public class recommendBack {
    private static IoView io = new IoView();
    private static Scanner sc = new Scanner(System.in);
    public static void backExercise(){
        int selectBack = 0;
        io.output("등오마카세를 선택하셨습니다.");
        io.output("30분(1), 1시간(2), 1시간반(3) 코스중 골라주세요.");
        io.output("운동시간은 준비운동을 제외한 시간입니다.");
        selectBack = sc.nextInt();
        switch(selectBack){
            case 1:
                io.output("랫풀다운 6세트, 턱걸이 6세트, 원암덤벨로우 6세트");
                break;
            case 2:
                io.output("랫풀다운 8세트, 턱걸이 8세트 , 원암덤벨로우 5세트, 펜들레이로우 6세트");
                break;
            case 3:
                io.output("프론트 랫풀다운 8세트, 백 랫풀다운 5세트, 원암덤벨로우 6세트, 팬들레이로우 6세트, 시티드로우 4세트");
                break;
            default:
                io.output("잘못된 숫자입니다. 돌아갑니다.");
                break;
        }
        return;


    }
}

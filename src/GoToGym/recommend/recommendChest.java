package GoToGym.recommend;
import GoToGym.IOMethod.IoView;

import java.util.Scanner;
public class recommendChest {
    private static IoView io = new IoView();
    private static Scanner sc = new Scanner(System.in);

    public static void chestExercise() {
        int selectChest = 0;
        io.output("가슴운동 추천을 선택하셨습니다.");
        io.output("30분(1), 1시간(2), 1시간반(3) 코스중 골라주세요.");
        io.output("운동시간은 준비운동을 제외한 시간입니다.");
        selectChest = sc.nextInt();
        switch(selectChest){
            case 1:
                io.output("벤치프레스 6세트, 체스트 플라이머신 6세트, 푸쉬업 6세트");
                break;
            case 2:
                io.output("벤치프레스 5세트, 덤벨프레스 5세트, 체스트플라이머신 5세트, 푸쉬업 5세트");
                break;
            case 3:
                io.output("벤치프레스 6세트, 덤벨프레스 6세트, 체스트플라이머신 6세트, 체스트 크로스오버 4세트, 클로즈그립 벤치프레스 5세트");
                break;
            default:
                io.output("잘못된 숫자입니다. 돌아갑니다.");
                break;
        }
        return;

    }


}

package GoToGym.recommend;

import GoToGym.IOMethod.IoView;

import java.util.Scanner;

public class recommendLeg {
    private static IoView io = new IoView();
    private static Scanner sc = new Scanner(System.in);
    public static void legExercise(){
        int selectLeg = 0;
        io.output("하체 오마카세를 선택하셨습니다.");
        io.output("30분(1), 1시간(2), 1시간반(3) 코스중 골라주세요.");
        io.output("운동시간은 준비운동을 제외한 시간입니다.");
        selectLeg = sc.nextInt();
        switch(selectLeg){
            case 1:
                io.output("프리스쿼트 6세트, 런지 6세트, 점프스쿼트 6세트");
                break;
            case 2:
                io.output("프리스쿼트 8세트, 런지 4세트, 점프스쿼트 6세트, 레그프레스 8세트");
                break;
            case 3:
                io.output("하체운동 한시간반을 택한 당신은 사람이 아닙니다.");
                io.output("프리스쿼트 피라미드 세트 12세트, 레그프레스 8세트, 레그컬 최대실패지점 4세트, 레그 익스텐션 최대실패지점 5세트");

                break;
            default:
                io.output("잘못된 숫자입니다. 돌아갑니다.");
                break;
        }
        return;

    }
}

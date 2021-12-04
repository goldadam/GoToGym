package GoToGym;
import java.util.*;

public class mainProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int checkNum = 0;
        System.out.println("운동 프로그램에 오신 것을 환영합니다. ");
        System.out.println("이름을 입력해주세요");
        System.out.println("원하시는 번호를 선택해주세요.");


        while(true){
            // 케이스의 종류에 따라 운동 종류 분류하기...
            System.out.println("1번에서 5번까지 선택해주세요");
            System.out.println("1. 운동 추가하기");
            System.out.println("2. 운동할 세트수, 반복수, 무게를 입력해주세요");
            System.out.println("3. 운동을 제거합니다.");
            System.out.println("4. 전체 운동 보기");
            System.out.println("5. 프로그램 종료");
            checkNum = sc.nextInt();

            switch(checkNum){
                case 1:
                    addExercise(workout);
                    break;
                case 2:
                    addWeight(workout);
                    break;
                case 3:
                    removeExercise(workout);
                    break;
                case 4:
                    printExercise(workout);
                    break;
                case 5:
                    System.out.println("시스템이 종료됩니다.");
                    System.exit(0); //정상적으로 시스템 종료함..
            }
        }
    }
    public static addExercise(workout){

    }
}

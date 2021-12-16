package GoToGym.IOMethod;

import GoToGym.IOMethod.IoInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

//input 할 값들이 너무 많아서 인터페이스 하나로 만들어서 값 부여하기
    public class IoView implements IoInterface {
        private final int DEFAULT_INT = 0;
        private final double DEFAULT_DOUBLE = 0;
        Scanner sc = new Scanner(System.in);

    @Override
    public void output(String text) {
        System.out.println(text);
    }

    @Override
    public void output(double num) {
        System.out.println(num);
    }

    @Override
    public void output(Object object) {
        System.out.println(object);
    }

    @Override
    public String inputText() {
        String text = "";
        do{
            text = sc.nextLine();
            if(!text.equals("")){
                return text;
            }
            this.output("텍스트를 입력하세요.");
        }while(true);
    }

    @Override
    public double inputDouble() {
        double num = DEFAULT_DOUBLE;
        do{
            try{
                num = sc.nextDouble();

            }catch(InputMismatchException e){
                this.output("double타입의 수가 들어오지 않았습니다.");
            }
            sc.nextLine();
        }while(num == DEFAULT_DOUBLE);
        return num;


    }

    @Override
    public int inputInt() {
        int num = DEFAULT_INT;
        do{
            try{
                num = sc.nextInt();
            }catch(InputMismatchException e){
                this.output("int타입의 수가 들어오지 않았습니다.");
            }
            sc.nextLine();
        }while(num == DEFAULT_INT);
        return num;
    }

}

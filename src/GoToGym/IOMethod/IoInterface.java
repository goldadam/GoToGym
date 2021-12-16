package GoToGym.IOMethod;
import java.util.*;

/*
i/o 에서 필요한 함수들을 오버로딩 해서 우리가 필요한 함수들을 인터페이스를 이용해 구현함.
 */
public interface IoInterface {
    public void output(String text);
    public void output(double num);
    public void output(Object object);

    public String inputText();
    public double inputDouble();
    public int inputInt();
}

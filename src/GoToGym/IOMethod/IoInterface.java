package GoToGym.IOMethod;
import java.util.*;
public interface IoInterface {
    public void output(String text);
    public void output(double num);
    public void output(Object object);

    public String inputText();
    public double inputDouble();
    public int inputInt();
}

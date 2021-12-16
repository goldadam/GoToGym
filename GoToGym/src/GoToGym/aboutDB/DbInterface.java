package GoToGym.aboutDB;

public interface DbInterface {
    public int getWLength(); //맨몸운동 length 가져오는 메서드 인터페이스.
    public int getWELength(); //중량운동 length 가져오는 메서드 인터페이스

    public String[] getWName();

    public String[] getWEName();
    public String getWName(int index); //몇번째 운동을 가져와야 하는지..
    public String getWEName(int index);
    public String getWExplanation(int index); //설명 가져오는 메서드 인터페이스
    public String getWHExplanation(int index);

}

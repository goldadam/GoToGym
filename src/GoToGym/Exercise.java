package GoToGym;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.io.*;
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Exercise {
    private String userName;
    private String name;
    private String explanation;
    private int sets;
    private int reps;


}

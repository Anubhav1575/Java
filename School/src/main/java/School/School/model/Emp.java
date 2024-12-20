package School.School.model;
import lombok.Getter;
import lombok.Setter;


import java.util.List;
import java.util.Map;

@Setter
@Getter
public class Emp {
    private String empid;
    private String name;
    private Map<String,String> awards;
    private int no;


}

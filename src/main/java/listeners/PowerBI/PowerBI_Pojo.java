package listeners.PowerBI;

import lombok.Builder;

import java.util.List;
@Builder
public class PowerBI_Pojo {
    private String Suitename;
    private String Classname;
    private String Methodname;
    private String MethodDescription;
    private String Host;
    private String Result;
    private long Duration;

}

import lombok.*;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor


public class User extends Account {

    private int UserId;
    private String name;
    private String familyName;
    private String birth;

    private String university;
    private String reshte ;
    private String location;

    List<String > Takhasos ;

}

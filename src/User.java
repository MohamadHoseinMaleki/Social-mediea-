import lombok.*;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
@Builder

public class User extends Account {

    private int UserId;
    private String name;
    private String familyName;
    private String birth;

    private String university;
    private String reshte ;
    private String locationHime;

    List<String > Takhasos ;

}

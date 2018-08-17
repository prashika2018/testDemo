package myproj;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HomePage {

    private String username;
    private  String password;
    private  String role;

    public HomePage(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


}

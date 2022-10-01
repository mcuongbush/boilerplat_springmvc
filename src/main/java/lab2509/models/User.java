package lab2509.models;


import javax.persistence.*;
import java.io.Serializable;


@Entity()
public class User implements Serializable {
    @Id
    @Column(name="username")
    //private Integer id;
    private String username;

    @Column(name="name")
    private String name;

    @Column(name="pass")
    private String pass;

    public User() {
    }

    public User(String username ,String pass, String name){
        this.username=username;
        this.name=name;
        this.pass=pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

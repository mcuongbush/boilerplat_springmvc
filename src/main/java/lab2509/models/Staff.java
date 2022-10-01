package lab2509.models;
import javax.persistence.*;

@Entity
@Table(name="Staff")
public class Staff {
    @Id
    @Column(name="id")
    private String id;
    private String name;
}

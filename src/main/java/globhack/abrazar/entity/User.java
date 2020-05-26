package globhack.abrazar.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "appuser")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotBlank
    private String firstName;
    @Column(name = "last_name", nullable = false)
    @NotBlank
    private String lastName;
    @Column(name = "email", nullable = false, unique = true)
    @NotBlank
    @Email
    private String email;
    @Column(name = "password", nullable = false)
    @NotBlank
    private String password;
    @Column(name = "type", nullable = false)
    @NotBlank
    private int type;

    //#region
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    //#endregion

    public User() {
    }

    

    public User(int id, @NotBlank String firstName, @NotBlank String lastName, @NotBlank @Email String email,
            @NotBlank int type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.type = type;
    }

    public User(int id, @NotBlank String firstName, @NotBlank String lastName, @NotBlank @Email String email,
            @NotBlank String password, @NotBlank int type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
    
    
}
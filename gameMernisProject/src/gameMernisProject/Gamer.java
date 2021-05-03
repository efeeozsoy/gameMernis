package gameMernisProject;

import java.util.Date;

public class Gamer implements Entity {
    private int id;
    private String firstName;
    private String nationalityId;
    private String lastName;
    private Date birthday;

    public Gamer(){
    };

    public Gamer(int id, String firstName, String nationalityId, String lastName, Date birthday) {
        this.id = id;
        this.firstName = firstName;
        this.nationalityId = nationalityId;
        this.lastName = lastName;
        this.birthday = birthday;
    }

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

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

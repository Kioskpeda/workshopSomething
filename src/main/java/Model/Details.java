package Model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity

public class Details {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int detailsId;
   @Column(unique = true)
   private String email;
   private String name;
   private LocalDate birthDate;


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Details(int detailsId, String email, String name, LocalDate birthDate){
        this.detailsId =detailsId;
        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Details() {

    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

}

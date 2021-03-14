package Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.Objects;

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;
    @Column(unique = true)
    private String isbn;
    private String title;
    private LocalDate loanDate;
    private Long id;



    public int getDetailsId() {
        return detailsId;
    }

    public Book() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String email) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return detailsId == book.detailsId && Objects.equals(isbn, book.isbn) && Objects.equals(isbn, book.isbn) && Objects.equals(loanDate, book.loanDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsId, isbn, title, loanDate);
    }

    public Book(int detailsId, String email, String name, LocalDate birthDate){
        this.detailsId =detailsId;
        this.isbn = isbn;
        this.title =title;
        this.loanDate = loanDate;


    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public TemporalAmount getMaxLoanDays() {
        return null;
    }
}

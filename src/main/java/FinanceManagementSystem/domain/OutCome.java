package FinanceManagementSystem.domain;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class OutCome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private LocalDate outcomeDate;

    @ManyToOne
    private User user;

    public OutCome() {
    }

    public OutCome(String description, Double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getOutcomeDate() {
        return outcomeDate;
    }

    public void setOutcomeDate(LocalDate outcomeDate) {
        this.outcomeDate = outcomeDate;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "OutCome{" +
                "amount=" + amount +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", outcomeDate=" + outcomeDate +
                ", user=" + user +
                '}';
    }
}

package FinanceManagementSystem.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class InCame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   @Column(nullable = false)
    private String description;
   @Column(nullable = false)
    private Double amount;
   @Column(nullable = false)
    private LocalDate creatDate;

    public InCame() {
    }

    public InCame(Long id, String description, Double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDate creatDate) {
        this.creatDate = creatDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "InCame{" +
                "amount=" + amount +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", creatDate=" + creatDate +
                '}';
    }
}

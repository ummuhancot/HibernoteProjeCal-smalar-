package FinanceManagementSystem.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<InCame> incomes = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<OutCome> outComes = new ArrayList<>();

    @Embedded
    private Adress adress;

    public User() {
    }

    public User(String name, String email, Adress adress) {
        this.name = name;
        this.email = email;
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InCame> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<InCame> incomes) {
        this.incomes = incomes;
    }

    public List<OutCome> getOutComes() {
        return outComes;
    }

    public void setOutComes(List<OutCome> outComes) {
        this.outComes = outComes;
    }

    @Override
    public String toString() {
        return "User{" +
                "adress=" + adress +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

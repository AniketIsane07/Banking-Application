package net.javaguides.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NamedEntityGraph
@AllArgsConstructor
@Entity
@Table(name="accounts")
public class Account {
    @Id
    private long id;
    private String accountholderName;
    private double balance;

    public Account() {

    }
}

package ru.practic16;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bank_id")
  private Long id;
  private String name;
  private String address;
  @OneToMany(mappedBy = "bank")
  private List<Card> cards;

  @Override
  public String toString() {
    return "Bank{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}

package ru.practic24;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Card {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer cardNumber;
  private Integer code;
  @ManyToOne
  @JoinColumn(name = "bank_id", nullable = false)
  private Bank bank;

  @Override
  public String toString() {
    return "Card{" +
        "id=" + id +
        ", cardNumber=" + cardNumber +
        ", code=" + code +
        ", bank=" + bank +
        '}';
  }
}

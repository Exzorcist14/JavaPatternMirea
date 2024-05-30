package ru.practic17;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {
  @Query("select b from Bank b where b.name=?1")
  Optional<Bank> getBankByName(String name);
}

package ru.practic16;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practic16.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
}

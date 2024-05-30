package ru.practic15;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practic15.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}


package ru.practic17;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practic17.Card;


@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}


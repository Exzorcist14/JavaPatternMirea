package ru.practic24;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CardService {
  private final CardRepository cardRepository;
  private final BankRepository bankRepository;

  public String saveCard(Card card, Long bankId) {
    var bank = bankRepository.findById(bankId).orElseThrow();
    card.setBank(bank);
    cardRepository.save(card);
    return card.toString();
  }

  public List<Card> getCards() {
    return cardRepository.findAll();
  }

  public void deleteById(Long cardId) {
    cardRepository.deleteById(cardId);
  }
}

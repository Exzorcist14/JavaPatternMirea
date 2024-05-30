package ru.practic17;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cards")
@RequiredArgsConstructor
public class CardController {
  private final CardRepository cardRepository;
  private final BankRepository bankRepository;

  @PostMapping("/{bankId}")
  @ResponseBody
  public String createCard(@RequestBody Card card, @PathVariable("bankId") Long bankId) {
    var bank = bankRepository.findById(bankId).orElseThrow();
    card.setBank(bank);
    cardRepository.save(card);
    return card.toString();
  }

  @GetMapping("/")
  @ResponseBody
  public List<String> getAllCards() {
    return cardRepository.findAll().stream().map(Card::toString).collect(Collectors.toList());
  }

  @DeleteMapping("/{id}")
  @ResponseBody
  public void deleteCard(@PathVariable long id) {
    cardRepository.deleteById(id);
  }
}

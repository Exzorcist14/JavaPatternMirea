package ru.practic19;

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
  private final CardService cardService;

  @PostMapping("/{bankId}")
  @ResponseBody
  public String createCard(@RequestBody Card card, @PathVariable("bankId") Long bankId) {
    return cardService.saveCard(card, bankId);
  }

  @GetMapping("/")
  @ResponseBody
  public List<String> getAllCards() {
    return cardService.getCards().stream().map(Card::toString).collect(Collectors.toList());
  }

  @DeleteMapping("/{id}")
  @ResponseBody
  public void deleteCard(@PathVariable long id) {
    cardService.deleteById(id);
  }
}

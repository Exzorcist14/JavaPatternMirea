package ru.practic14;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cards")
public class CardController {
  private List<Card> cards = new ArrayList<>();

  @PostMapping("/add")
  @ResponseBody
  public Card createCard(@RequestBody Card card) {
    cards.add(card);
    return card;
  }

  @GetMapping("/")
  @ResponseBody
  public List<Card> getAllCards() {
    return cards;
  }

  @DeleteMapping("/{index}")
  @ResponseBody
  public Card deleteCard(@PathVariable int index) {
    if (index >= 0 && index < cards.size()) {
      return cards.remove(index);
    } else {
      return null;
    }
  }
}

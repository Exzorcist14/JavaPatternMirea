package ru.practic15;

import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class CardController {
  private final CardRepository cardRepository;

  @PostMapping("/")
  @ResponseBody
  public Card createCard(@RequestBody Card card) {
    cardRepository.save(card);
    return card;
  }

  @GetMapping("/")
  @ResponseBody
  public List<Card> getAllCards() {
    return cardRepository.findAll();
  }

  @DeleteMapping("/{id}")
  @ResponseBody
  public void deleteCard(@PathVariable long id) {
    cardRepository.deleteById(id);
  }
}

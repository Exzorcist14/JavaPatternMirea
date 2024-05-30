package ru.practic17;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banks")
@RequiredArgsConstructor
public class BankController {
  private final BankRepository bankRepository;

  @PostMapping("/")
  public Bank createBank(@RequestBody Bank bank) {
    return bankRepository.save(bank);
  }

  @GetMapping("/{name}")
  public Bank getByName(@PathVariable("name") String name){
    return bankRepository.getBankByName(name).orElseThrow();
  }
  @GetMapping("/")
  public List<Bank> getAllBanks() {
    return bankRepository.findAll();
  }

  @DeleteMapping("/{id}")
  public void deleteBank(@PathVariable long id) {
    bankRepository.deleteById(id);
  }

}

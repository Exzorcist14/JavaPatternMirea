package ru.practic24;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class BankController {
  private final BankService bankService;

  @PostMapping("/")
  public Bank createBank(@RequestBody Bank bank) {
    return bankService.saveBank(bank);
  }


  @GetMapping("/{name}")
  public Bank getByName(@PathVariable("name") String name) {
    return bankService.findByName(name);
  }

  @GetMapping("/")
  public List<Bank> getAllBanks() {
    return bankService.getBanks();
  }

  @DeleteMapping("/{id}")
  public void deleteBank(@PathVariable long id) {
    bankService.deleteById(id);
  }

}

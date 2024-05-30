package ru.practic24;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class BankService {
  private final BankRepository bankRepository;
  public List<Bank> getBanks() {
    log.info("finding all banks");
    return bankRepository.findAll();
  }

  public Bank findByName(String name) {
    log.info("finding bank by name");
    return bankRepository.getBankByName(name).orElseThrow();
  }

  public Bank findById(Long id) {
    log.info("finding bank by id");
    return bankRepository.findById(id).orElseThrow();
  }

  public Bank saveBank(Bank bank) {
    log.info("saving bank");
    return bankRepository.save(bank);
  }

  public void deleteById(Long id) {
    log.info("deleting bank");
    bankRepository.deleteById(id);
  }
}

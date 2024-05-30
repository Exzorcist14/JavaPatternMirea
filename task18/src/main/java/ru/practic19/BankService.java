package ru.practic19;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {
  private final BankRepository bankRepository;
  public List<Bank> getBanks(){
    return bankRepository.findAll();
  }
  public Bank findByName(String name){
    return bankRepository.getBankByName(name).orElseThrow();
  }
  public Bank findById(Long id){
    return bankRepository.findById(id).orElseThrow();
  }
  public Bank saveBank(Bank bank){
    return bankRepository.save(bank);
  }
  public void deleteById(Long id){
    bankRepository.deleteById(id);
  }
}

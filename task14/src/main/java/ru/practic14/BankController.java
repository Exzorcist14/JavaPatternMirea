package ru.practic14;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/banks")
public class BankController {
    private List<Bank> bankList = new ArrayList<>();

    @PostMapping("/")
    public Bank createBank(@RequestBody Bank bank) {
        bankList.add(bank);
        return bank;
    }

    @GetMapping("/")
    public List<Bank> getAllBanks() {
        return bankList;
    }

    @DeleteMapping("/{index}")
    public Bank deleteBank(@PathVariable int index) {
        if (index >= 0 && index < bankList.size()) {
            return bankList.remove(index);
        } else {
            return null;
        }
    }
}

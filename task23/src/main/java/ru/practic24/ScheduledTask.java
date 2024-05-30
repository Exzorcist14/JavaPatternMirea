package ru.practic24;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
@EnableScheduling
@AllArgsConstructor
@Slf4j
public class ScheduledTask implements TaskMXBean {
  private final BankService bankService;
  private final CardService cardService;

  @PostConstruct
  private void init() throws Exception {
    MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
    ObjectName name = new ObjectName("ru.practic22:type=ScheduledTask");
//    if (!mbs.isRegistered(name)) {
//      mbs.registerMBean(this, name);
//    } else {
//      log.info("MBean with name {} is already registered.", name);
//    }
  }


  @Scheduled(fixedRateString = "PT1M")
  public void remadeFiles() throws IOException {
    Files.walk(Path.of("C:/study/jaba/practic22/src/main/resources/entities")).filter(Files::isRegularFile).forEach(p -> {
      try {
        log.info("deleting file in scheduled");
        Files.delete(p);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    });

    FileWriter banksFile = new FileWriter("C:/study/jaba/practic22/src/main/resources/entities/banks.txt");
    banksFile.write(bankService.getBanks().toString());

    FileWriter cardsFile = new FileWriter("C:/study/jaba/practic22/src/main/resources/entities/cards.txt");
    cardsFile.write(cardService.getCards().toString());
    log.info("written to files in scheduled");
    banksFile.close();
    cardsFile.close();
  }

  @Override
  public void runRemadeFiles() throws IOException {
    remadeFiles();
  }
}

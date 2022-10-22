package it.fabioformosa.labs.legacyspring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/local-scheduler")
public class LocalQuartzController {

    @Autowired
    private List<Scheduler> schedulers;

    @GetMapping
    public List<String> getLocalQuartzSchedulerInstance() throws SchedulerException {
        List<String> schedulerNames = new ArrayList<>();
        for (Scheduler scheduler : schedulers) {
            String schedulerName = scheduler.getSchedulerName();
            schedulerNames.add(schedulerName);
        }
        log.info("Scheduler Instance Name is {}", schedulerNames);
        return schedulerNames;
    }

}

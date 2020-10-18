package com.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author mustafa
 */
//@EnableScheduling
@Component
public class SchedulerFixedRate {

    // @Scheduled(fixedRate = 1000,initialDelay = 10000)
    @Scheduled(fixedRate = 1000)
    public void fixedRateSch() {

        System.out.println("This is a fixed rate");
    }
}

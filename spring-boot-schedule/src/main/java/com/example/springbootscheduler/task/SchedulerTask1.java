package com.example.springbootscheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask1 {
    private int count = 0;

    @Scheduled(cron="*/6 * * * * ?")
    public void run() {
        System.out.println("启动服务后，定时执行任务,次数="+count++);
    }
}

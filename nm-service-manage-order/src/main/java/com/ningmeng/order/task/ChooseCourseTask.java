package com.ningmeng.order.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
public class ChooseCourseTask {
    @Scheduled(cron="0/3 * * * * *")//每隔3秒执行一次
    public void task1(){
        System.out.println(new Date());
    }
}

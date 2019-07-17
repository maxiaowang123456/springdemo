package com.wy.demo.springsenior.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurreentTime(){
        System.out.println("每隔5秒执行一次:"+dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 57 16 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定的时间"+dateFormat.format(new Date())+"执行");
    }
}

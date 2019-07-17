package com.wy.demo.springsenior.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.wy.demo.springsenior.schedule")
@EnableScheduling
public class TaskScheduleConfig {
}

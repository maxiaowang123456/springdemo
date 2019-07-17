package com.wy.demo.springsenior.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class TestMain {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expectId="from product profile";
        String actual=testBean.getContent();
        Assert.assertEquals(expectId,actual);
    }
}

package com.wy.demo.springmvc.build.test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.wy.demo.springmvc.build.WebMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
//WebMvcConfig.class支持springBean管理和springMVC的处理
@ContextConfiguration(classes = {WebMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {
    private MockMvc mockMvc;
    @Autowired
    private DemoServiceTest demoServiceTest;
   @Autowired
   private WebApplicationContext wac;
   @Autowired
   private MockHttpSession session;
   @Autowired
   private MockHttpServletRequest request;
   @Before
    public void setup(){
       this.mockMvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
   }
   @Test
    public void testNoramlController()throws Exception{
       mockMvc.perform(get("/normal"))//MockMvcRequestBuilders.get()静态方法
               .andExpect(status().isOk())//MockMvcResultMatchers.status()静态方法
                .andExpect(view().name("page"))
                    .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
               .andExpect(model().attribute("msg", demoServiceTest.saySomething()));
   }
   @Test
    public void testRestController()throws Exception{
       mockMvc.perform(get("/testRest"))
               .andExpect(status().isOk())
               .andExpect(content().contentType("text/plain;charset=UTF-8"))
               .andExpect(content().string(demoServiceTest.saySomething()));
   }

}

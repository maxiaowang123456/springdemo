package com.wy.demo.springmvc.build.converter;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter(){
        super(new MediaType("application","x-wy", Charset.forName("UTF-8")));
    }


    @Override
    protected boolean supports(Class clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String tmp=StreamUtils.copyToString(inputMessage.getBody(),Charset.forName("UTF-8"));
        String[] tmpArr=tmp.split("-");
        return new DemoObj(new Long(tmpArr[0]),tmpArr[1]);
    }

    @Override
    protected void writeInternal(DemoObj o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String out="hello:"+o.getId()+"-"+o.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}

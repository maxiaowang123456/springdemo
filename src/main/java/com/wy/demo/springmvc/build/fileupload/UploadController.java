package com.wy.demo.springmvc.build.fileupload;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public @ResponseBody String upload(MultipartFile[]files){
            try {
                for(MultipartFile file:files){
                    FileUtils.writeByteArrayToFile(new File("e:/uploads/"
                            +file.getOriginalFilename()),file.getBytes());
                }
                return "ok";
            } catch (IOException e) {
                e.printStackTrace();
                return "wrong";
            }
    }
}

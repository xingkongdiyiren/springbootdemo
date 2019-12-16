package com.hr.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author 周恒哲
 * 文件上传
 * @date 2019/12/11
 **/
@RestController
public class FileUploadController {
    /**
     * 上传文件
     */
    @PostMapping("/fileUploadController")
    public String fileUpload(MultipartFile file) throws IOException {
        //获取文件真实名字
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("f:/"+file.getOriginalFilename()));
        return  "OK";
    }
}

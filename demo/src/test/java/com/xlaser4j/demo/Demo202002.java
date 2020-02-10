package com.xlaser4j.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

/**
 * @package: com.xlaser4j.demo
 * @author: Elijah.D
 * @time: 2020/2/10 19:25
 * @description: 202002
 * @modified: Elijah.D
 */
public class Demo202002 {
    /**
     * File 转 MultipartFile
     *
     * @throws IOException
     */
    @Test
    public void case1() throws IOException {
        File file = ResourceUtils.getFile("classpath:picture");
        List<File> files = FileUtil.loopFiles(file);

        File picture = files.get(0);
        String fileName = picture.getName();
        String contentType = MediaType.IMAGE_PNG_VALUE;

        MultipartFile multipartFile = new MockMultipartFile(fileName, fileName, contentType, IoUtil.toStream(picture));
        System.out.println(multipartFile.getContentType() + ": size:" + multipartFile.getSize() + " name:" + multipartFile.getOriginalFilename());
    }
}

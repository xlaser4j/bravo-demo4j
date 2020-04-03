package com.xlaser4j.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xlaser4j.demo.model.PersonType;
import org.apache.commons.text.WordUtils;
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
public class Demo_00020 {
    /**
     * 获取当前module的resources绝对路径;main方法和web获取的module不相同
     *
     * @see CaseEnum#FILE
     */
    @Test
    public void case0() {
        System.out.println(System.getProperty("user.dir") + "/src/main/resources");

        String directory = System.getProperty("user.dir") + "/src/test/resources";
        System.out.println(directory);

        File touch = FileUtil.touch(directory + "/temp/abc.txt");
        System.out.println(touch);
    }

    /**
     * <p>
     * File 转 MultipartFile
     *
     * @throws IOException
     * @see CaseEnum#FILE
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

    /**
     * 字符串,单词大小写处理
     * <p>
     * {@link WordUtils#capitalizeFully(String)}
     *
     * @see CaseEnum#STRING
     */
    @Test
    public void case3() {
        String str = "EliJah t dU";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(StrUtil.upperFirst(str));
        System.out.println(StrUtil.lowerFirst(str));

        Stream<String> stream = Arrays.stream(StrUtil.split(str, " ")).map(StrUtil::upperFirst);
        System.out.println(stream.collect(Collectors.joining()));

        System.out.println(WordUtils.capitalize(str));
        System.out.println(WordUtils.capitalizeFully(str));
    }

    /**
     * json字符串解析成对象,泛型处理
     * <p>
     * {@link TypeReference}
     *
     * @throws Exception
     * @see CaseEnum#JSON
     */
    @Test
    public void case4() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(PersonType.init());
        List<PersonType> reference = mapper.readValue(jsonStr, new TypeReference<List<PersonType>>() {
        });
        System.out.println("数据内容-通过泛型: " + reference);
        System.out.println("数据类型-通过泛型: " + reference.get(0).getClass());

        // 只能解析成k-v无法转换成PersonType
        List<?> noReference = mapper.readValue(jsonStr, List.class);
        System.out.println("\n数据内容-没有泛型: " + reference);
        System.out.println("数据类型-没有泛型: " + noReference.get(0).getClass());

        // 可以先解析成数组,再转成list
        PersonType[] personTypes = mapper.readValue(jsonStr, PersonType[].class);
        System.out.println("\n数据内容-通过数组: " + Arrays.asList(personTypes));
        System.out.println("数据类型-通过数组: " + Arrays.asList(personTypes).get(0).getClass());
    }

    /**
     * 输出流转输入流
     *
     * @see CaseEnum#IO
     */
    @Test
    public void case5() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    }

    @Test
    public void case6() {

    }
}

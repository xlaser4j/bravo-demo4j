package excel;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.xlasers.excel.excel.model.ReadModel;
import com.xlasers.excel.excel.model.ReadModel2;
import com.xlasers.excel.listener.ExcelListener;
import com.xlasers.excel.util.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static cn.hutool.core.lang.Console.print;

/**
 * <p>
 *
 * </p>
 *
 * @package: excel
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:25
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class AliExcelTest {

    /**
     * 测试大批量数据读取
     */
    @Test
    public void testSax() {
    }
    /**
     * 07版本excel读数据量少于1千行数据，内部采用回调方法.
     *
     * @throws IOException 简单抛出异常，真实环境需要catch异常,同时在finally中关闭流
     */
    @Test
    public void simpleReadListStringV2007() throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("2007.xlsx");

        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 0));
        inputStream.close();
        log.info("【data】:{}",data);
    }


    /**
     * 07版本excel读数据量少于1千行数据自动转成javamodel，内部采用回调方法.
     *
     * @throws IOException 简单抛出异常，真实环境需要catch异常,同时在finally中关闭流
     */
    @Test
    public void simpleReadJavaModelV2007() throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("2007.xlsx");
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(2, 1, ReadModel.class));
        inputStream.close();
        log.info("【data】:{}",data);
    }

    /**
     * 07版本excel读数据量大于1千行，内部采用回调方法.
     *
     * @throws IOException 简单抛出异常，真实环境需要catch异常,同时在finally中关闭流
     */
    @Test
    public void saxReadListStringV2007() throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("2007.xlsx");
        ExcelListener excelListener = new ExcelListener();
        EasyExcelFactory.readBySax(inputStream, new Sheet(1, 1), excelListener);
        inputStream.close();

    }
    /**
     * 07版本excel读数据量大于1千行，内部采用回调方法.
     *
     * @throws IOException 简单抛出异常，真实环境需要catch异常,同时在finally中关闭流
     */
    @Test
    public void saxReadJavaModelV2007() throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("2007.xlsx");
        ExcelListener excelListener = new ExcelListener();
        EasyExcelFactory.readBySax(inputStream, new Sheet(2, 1, ReadModel.class), excelListener);
        inputStream.close();
    }

    /**
     * 07版本excel读取sheet
     *
     * @throws IOException 简单抛出异常，真实环境需要catch异常,同时在finally中关闭流
     */
    @Test
    public void saxReadSheetsV2007() throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("2007.xlsx");
        ExcelListener excelListener = new ExcelListener();
        ExcelReader excelReader = EasyExcelFactory.getReader(inputStream,excelListener);
        List<Sheet> sheets = excelReader.getSheets();
        System.out.println("llll****"+sheets);
        System.out.println();
        for (Sheet sheet:sheets) {
            if(sheet.getSheetNo() ==1) {
                excelReader.read(sheet);
            }else if(sheet.getSheetNo() ==2){
                sheet.setHeadLineMun(1);
                sheet.setClazz(ReadModel.class);
                excelReader.read(sheet);
            }else if(sheet.getSheetNo() ==3){
                sheet.setHeadLineMun(1);
                sheet.setClazz(ReadModel2.class);
                excelReader.read(sheet);
            }
        }
        inputStream.close();
    }
}

package excel;

import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import cn.hutool.poi.excel.sax.Excel07SaxReader;
import cn.hutool.poi.excel.sax.handler.RowHandler;
import com.xlasers.excel.excel.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * test: 测试hutool-excel相关api
 * </p>
 *
 * @package: excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/16 && 13:33
 * @description: excel单元测试
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class HutoolExcelTest {
    /**
     * <p>1.sax读取excel数据 {@link HutoolExcelTest#testSax()}
     *
     * <p>2.lambada表达式变形 {@link HutoolExcelTest#testTotalCount()} (o1, o2, o3) -> count.getAndIncrement()
     *
     * @return RowHandler
     */
    private static RowHandler createRowHandler() {
        AtomicInteger count = new AtomicInteger();
        return (o1, o2, o3) -> Console.log("[{}], [{}], [{}], {}", count.getAndIncrement(), o1, o2, o3);
    }

    /**
     * 测试,读取beans写入excel
     */
    @Test
    public void testWriter() {

        ExcelWriter writer = ExcelUtil.getWriter("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/demo" + System.currentTimeMillis() + ".xlsx");

        writer.setSheet("Db");
        writer.write(CollUtil.newArrayList(new DbInfoDTO())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setSheet("Table");
        writer.resetRow().write(CollUtil.newArrayList(new TableInfoDTO())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setSheet("View");
        writer.resetRow().write(CollUtil.newArrayList(new ViewInfoDTO())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setSheet("Column");
        writer.resetRow().write(CollUtil.newArrayList(new ColumnInfoDTO())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.close();
    }

    /**
     * <p>测试,解析excel到bean
     *
     * <p>注意多线程操作不可以传入的同一个reader,必须是不同的对象,否则读取混乱{@code ExcelUtil.getReader(path)}
     */
    @Test
    public void testReader() throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(40);

        List<BaseNeoDTO> data = CollUtil.newArrayList();

        String path = "C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/Import_Model.xlsx";
        executor.execute(() -> {
            ExcelReader reader = ExcelUtil.getReader(path);
            List<DbInfoDTO> dbs = reader.setSheet("Db").read(0, 1, DbInfoDTO.class);
            log.info("【dbs】:{}", dbs);
            (data).addAll(dbs);
        });

        executor.execute(() -> {
            ExcelReader reader = ExcelUtil.getReader(path);
            List<TableInfoDTO> tables = reader.setSheet("Table").read(0, 1, TableInfoDTO.class);
            log.info("【tables】:{}", tables);
            (data).addAll(tables);
        });

        executor.execute(() -> {
            ExcelReader reader = ExcelUtil.getReader(path);
            List<ViewInfoDTO> views = reader.setSheet("View").read(0, 1, ViewInfoDTO.class);
            log.info("【views】:{}", views);
            (data).addAll(views);
        });

        executor.execute(() -> {
            ExcelReader reader = ExcelUtil.getReader(path);
            List<ColumnInfoDTO> columns = reader.setSheet("Column").read(0, 1, ColumnInfoDTO.class);
            log.info("【columns】:{}", columns);
            (data).addAll(columns);
        });

        // 防止主线程执行完,线程池关闭
        Thread.sleep(5000);

        log.info("【解析成JavaBean】:{}", data);

        log.info("【解析成Json】:{}", JSONUtil.parseArray(data));
    }

    /**
     * 测试大批量数据读取
     */
    @Test
    public void testSax() {
        Excel07SaxReader reader2 = new Excel07SaxReader(createRowHandler());
        reader2.read("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/Import_Model.xlsx", -1);
    }

    /**
     * 获取excel总条数
     */
    @Test
    public void testTotalCount() {
        log.info("【begin】:{}", DateUtil.formatTime(DateUtil.date()));
        AtomicLong count = new AtomicLong();
        Excel07SaxReader reader2 = new Excel07SaxReader((o1, o2, o3) -> count.getAndIncrement());
        reader2.read("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/max.xlsx", -1);
        log.info("【获取excel总条数】: {}", count.get() - 4);
        log.info("【end】:{}", DateUtil.formatTime(DateUtil.date()));

        reader2.read("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/max.xlsx", 0);
        log.info("【获取excel总条数】: {}", count.get() - 1);

        reader2.read("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/max.xlsx", 3);
        log.info("【获取excel总条数】: {}", count.get() - 1);
    }

    /**
     * 获取excel总条数: 文件大于10M会内存溢出,推荐大数据量sax方法,但是功能简单,建议alibaba: easyexcel
     */
    @Test
    public void testSheetCount() {
        log.info("【begin】:{}", DateUtil.formatTime(DateUtil.date()));
        String path = "C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/Import_Model.xlsx";
        ExcelReader reader = ExcelUtil.getReader(path);
        int countDb = reader.setSheet("Db").getSheet().getLastRowNum();
        log.info("【countDb】:{}", countDb);

        int countTable = reader.setSheet("Table").getSheet().getLastRowNum();
        log.info("【countTable】:{}", countTable);

        int countView = reader.setSheet("View").getSheet().getLastRowNum();
        log.info("【countView】:{}", countView);

        int countColumn = reader.setSheet("Column").getSheet().getLastRowNum();
        log.info("【countColumn】:{}", countColumn);

        int countAll = countDb + countTable + countView + countColumn;
        log.info("【countAll】:{}", countAll);
        log.info("【end】:{}", DateUtil.formatTime(DateUtil.date()));
    }

    /**
     * 解析excel成javabean
     */
    @Test
    public void testToBean() {
        String path = "C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/Import_Model.xlsx";
        ExcelReader reader = ExcelUtil.getReader(path);
        List<DbInfoDTO> dbs = reader.setSheet("Db").read(0, 1, DbInfoDTO.class);
        log.info("【dbs】:{}", dbs);
    }
}

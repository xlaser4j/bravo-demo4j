package excel;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.xlasers.hutool.excel.ColumnInfo;
import com.xlasers.hutool.excel.DbInfo;
import com.xlasers.hutool.excel.TableInfo;
import com.xlasers.hutool.excel.ViewInfo;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * test: 测试excel相关api
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
public class CaseTest {
    /**
     * 测试,读取beans写入excel
     */
    @Test
    public void testWriter() {

        ExcelWriter writer = ExcelUtil.getWriter("C:/Users/Solor/Desktop/Code/future/bravo-demos/hutool/demo" + System.currentTimeMillis() + ".xlsx");

        writer.setOrCreateSheet("Db");
        writer.write(CollUtil.newArrayList(new DbInfo())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setOrCreateSheet("Table");
        writer.resetRow().write(CollUtil.newArrayList(new TableInfo())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setOrCreateSheet("View");
        writer.resetRow().write(CollUtil.newArrayList(new ViewInfo())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.setOrCreateSheet("Column");
        writer.resetRow().write(CollUtil.newArrayList(new ColumnInfo())).setRowHeight(-1, 20).setColumnWidth(-1, 15);

        writer.close();
    }
}

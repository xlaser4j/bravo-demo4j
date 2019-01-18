package com.xlasers.excel.listener;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.json.JSONUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:31
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class ExcelListener extends AnalysisEventListener {
    private List<Object> data = new ArrayList<>();

    @Override
    public void invoke(Object object, AnalysisContext context) {
        log.info("【object】:{}", JSONUtil.toJsonStr(object));
        System.out.println(context.getCurrentSheet());
        data.add(object);
        if (data.size() >= 100) {
            doSomething("start");
            data = new ArrayList<>();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        doSomething("end");
    }

    public static void doSomething(String s) {
        log.info("【data】:{}", s);
    }
}
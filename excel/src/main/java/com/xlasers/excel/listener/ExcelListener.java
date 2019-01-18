package com.xlasers.excel.listener;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

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
public class ExcelListener extends AnalysisEventListener {


    private List<Object> data = new ArrayList<Object>();

    @Override
    public void invoke(Object object, AnalysisContext context) {
        System.out.println(context.getCurrentSheet());
        data.add(object);
        if(data.size()>=100){
            doSomething();
            data = new ArrayList<Object>();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        doSomething();
    }
    public void doSomething(){
        for (Object o:data) {
            System.out.println(o);
        }
    }
}
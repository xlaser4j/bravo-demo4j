package com.xlasers.demo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.json.JSONUtil;
import com.xlasers.demo.model.DbInfo;
import com.xlasers.demo.model.EsDbInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

/**
 * <p>
 * Bean工具类
 * </p>
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/12/28 && 10:06
 * @description: bean工具类
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class BeanCollection {
    /**
     * <p> 测试modelMapper,beanUtil属性复制
     *
     * <p> 1.beanUtil复制时,集合复制时,强制复制
     *
     * <p> 2.modelMapper复制时,集合内类型,按照toString方法复制
     */
    @Test
    public void testCopy() {
        String json = "{\"dbChineseName\":\"batj\",\"userNum\":72,\"caseWrite\":0,\"dbName\":\"orcl\",\"updateAt\":1545903702279,\"dbComment\":\"\",\"configType\":0,\"createAt\":1545903702279,\"metaName\":\"BATJ(orcl)\",\"isDeleted\":false,\"updateBy\":\"admin\",\"host\":\"192.168.226.27\",\"id\":\"db-oracle@192.168.226.27@1521@orcl@BATJ\",\"jobName\":\"batj\",\"dbVersion\":\"Oracle Database 11g Enterprise Edition Release 11.2.0.4.0 - 64bit Production\",\"contextPath\":\"db-oracle@192.168.226.27@1521@orcl@BATJ\",\"dbType\":\"oracle\",\"version\":1,\"jobId\":5,\"createBy\":\"wuhongming\",\"port\":\"1521\",\"tableNum\":8438,\"sortN\":700948676608,\"businessType\":[{\"createBy\":\"admin\",\"dictCode\":\"businessType-cw\",\"updateBy\":\"admin\",\"typeName\":\"业务属性\",\"updateAt\":1545909778700,\"dictName\":\"财务\",\"remark\":\"\",\"typeId\":\"businessType\",\"id\":\"businessType-cw\",\"type\":{\"createBy\":\"admin\",\"updateBy\":\"admin\",\"typeName\":\"业务属性\",\"updateAt\":1545909776824,\"remark\":\"\",\"id\":\"businessType\",\"createAt\":1545909776824,\"typeCode\":\"businessType\"},\"createAt\":1545909778700,\"typeCode\":\"businessType\"},{\"createBy\":\"admin\",\"dictCode\":\"businessType-rl\",\"updateBy\":\"admin\",\"typeName\":\"业务属性\",\"updateAt\":1545909778700,\"dictName\":\"人力\",\"remark\":\"\",\"typeId\":\"businessType\",\"id\":\"businessType-rl\",\"type\":{\"createBy\":\"admin\",\"updateBy\":\"admin\",\"typeName\":\"业务属性\",\"updateAt\":1545909776824,\"remark\":\"\",\"id\":\"businessType\",\"createAt\":1545909776824,\"typeCode\":\"businessType\"},\"createAt\":1545909778700,\"typeCode\":\"businessType\"}],\"username\":\"BATJ\"}";

        DbInfo dbInfo = JSONUtil.toBean(json, DbInfo.class);
        log.info("【dbInfo】:{}", dbInfo);

        // 字典类型dict,强制复制
        EsDbInfo esDbInfo = new EsDbInfo();
        BeanUtil.copyProperties(dbInfo, esDbInfo, CopyOptions.create().setIgnoreError(true).setIgnoreNullValue(true));
        log.info("【esDbInfo】:{}", esDbInfo);

        // 字典类型转换成toString复制
        ModelMapper mapper = new ModelMapper();
        EsDbInfo esDbInfo2 = mapper.map(dbInfo, EsDbInfo.class);
        log.info("【esDbInfo2】:{}", esDbInfo2);
    }
}

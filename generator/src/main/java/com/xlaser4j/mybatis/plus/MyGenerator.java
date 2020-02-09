package com.xlaser4j.mybatis.plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * @package: com.xlaser4j.mybatis.plus
 * @author: Elijah.D
 * @time: 2018/9/26 9:16
 * @description: mybatis-plus generator
 * @modified: Elijah.D
 */
@Slf4j
public class MyGenerator {
    /**
     * <p>
     * MySQL 生成演示
     * </p>
     *
     *
     * <p>策略配置 {@link StrategyConfig}
     * <p>生成策略 {@link NamingStrategy}
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AutoGenerator generator = new AutoGenerator();

        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "/generator/src/main/resources");
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(false);

        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setAuthor("Elijah.D");
        gc.setEntityName("%sDO");

        DataSourceConfig dataConfig = new DataSourceConfig();
        dataConfig.setDbType(DbType.MYSQL);

        dataConfig.setDriverName("com.mysql.jdbc.Driver");
        dataConfig.setUsername("root");
        dataConfig.setPassword("1234");
        dataConfig.setUrl("jdbc:mysql://127.0.0.1:3306/vhr?characterEncoding=utf8");
        generator.setDataSource(dataConfig);

        StrategyConfig strategy = new StrategyConfig();
        strategy.setExclude("test", "demo");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);

        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.xlaser4j.hr");

        generator.setGlobalConfig(gc);
        generator.setStrategy(strategy);
        generator.setPackageInfo(packageConfig);

        generator.execute();
    }
}
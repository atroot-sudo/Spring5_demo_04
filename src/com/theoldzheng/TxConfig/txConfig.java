//package com.theoldzheng.TxConfig;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
///**
// * Description:
// *
// * @author theoldzheng@163.com  @ZYD
// * @create 2021.3.27 9:28
// */
//@Configuration
//@ComponentScan(basePackages = "com.theoldzheng")
//@EnableTransactionManagement
//public class txConfig {
//    /**
//     * 配置数据库连接池
//     * @return 数据库连接池对象dataSource
//     */
//    @Bean
//    public DruidDataSource getDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        return dataSource;
//    }
//
//    /**
//     * 配置JdbcTemplate
//     * @param dataSource 注入dataSource对象
//     * @return 返回一个JdbcTemplate对象
//     */
//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
//
//    /**
//     * 创建事务管理器
//     * @param dataSource 注入dataSource对象
//     * @return 返回一个事务管理器对象
//     */
//    @Bean
//    public DataSourceTransactionManager getDateSourceTransactionManager(DataSource dataSource){
//        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
//        dataSourceTransactionManager.setDataSource(dataSource);
//        return dataSourceTransactionManager;
//    }
//
//
//}

package com.bank.credit.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.bank.credit.dao")
@Import(value = {
        DataSourceConfiguration.class
        ,HibernateConfiguration.class
        ,JdbcInitialCharge.class
})
public class DaoConfiguration {
}

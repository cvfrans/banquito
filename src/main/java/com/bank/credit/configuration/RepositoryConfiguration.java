package com.bank.credit.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Spring repositories configuration.
 * 
 * @author Vector ITC Group
 */
@Configuration
@ComponentScan(basePackages = "com.bank.credit.dao")
@EnableJpaRepositories(basePackages = "com.bank.credit.repository")
@Import(value = {
		DataSourceConfiguration.class,
		JpaDataBaseConfiguration.class,
		JdbcInitialCharge.class
})
public class RepositoryConfiguration {

}

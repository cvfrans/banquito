package com.bank.credit.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Datasource configuration.
 * 
 * @author fjvaldivia
 *
 */
@Configuration
public class DataSourceConfiguration {

    @Value("${app.db.inmemory:true}")
    private boolean useInMemoryDb;
    
    /**
     * DataSource bean.
     * 
     * @return {@link DataSourceFactoryBean}
     */
    @Bean
    public DataSource  dataSource(){

    	if (useInMemoryDb) {
			return dataSourceH2();
		}else{
			return dataSourcePG();
		}
    }
	private DriverManagerDataSource dataSourcePG(){
    	DriverManagerDataSource dmd = new DriverManagerDataSource();
    	dmd.setDriverClassName("org.h2.Driver");
    	dmd.setUrl("jdbc:h2:mem:bank;");
    	dmd.setUsername("sa");
    	dmd.setPassword("");
    	
    	return dmd;
	}
	private DriverManagerDataSource dataSourceH2(){
    	DriverManagerDataSource dmd = new DriverManagerDataSource();
    	dmd.setDriverClassName("org.h2.Driver");
    	dmd.setUrl("jdbc:h2:mem:bank;DB_CLOSE_DELAY=-1");
    	dmd.setUsername("sa");
    	dmd.setPassword("");
    	
    	return dmd;
	}
}

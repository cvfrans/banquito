package com.bank.credit.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Root configuration.
 * 
 * @author fjvaldivia
 *
 */
@Configuration
@Import(value = {
		PropertiesConfiguration.class
        ,ServicesConfiguration.class
        ,RepositoryConfiguration.class
        ,DaoConfiguration.class
})
public class RootConfiguration {

}

package com.bank.credit.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Initializes the application.
 * 
 * @author fjvaldivia
 *
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	static final Logger LOGGER = LoggerFactory.getLogger(WebAppInitializer.class);

	/**
	 * Constructor
	 */
	public WebAppInitializer(){
		LOGGER.info("Starting.... {}", this.getClass().getName());
	}
	
    /**
     * Contest load.
     * 
     * @return {@link Class}[]
     */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfiguration.class };
	}

    /**
     * Context load before servlet initialization.
     * 
     * @return {@link Class}[]
     */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebMvcConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}

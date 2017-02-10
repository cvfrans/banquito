package com.bank.credit.common;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import com.bank.credit.configuration.RootRepositoryConfigTest;

/**
 * Abstract Integration Repository tests with common features.
 * 
 * @author fjvaldivia
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional(transactionManager = "transactionManager")
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
@ContextConfiguration(classes = { RootRepositoryConfigTest.class }, loader = AnnotationConfigContextLoader.class)
public abstract class AbstractRepositoryIntregrationTest  extends AbstractTransactionalJUnit4SpringContextTests {
	
	

}

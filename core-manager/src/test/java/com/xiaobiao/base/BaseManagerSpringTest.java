package com.xiaobiao.base;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: LeonWong
 * Date: 2016-04-11
 * Time: 15:39
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
//指定测试用例的运行器 这里是指定了Junit4
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/core-manager.xml")
public class BaseManagerSpringTest extends TestCase {
    protected Logger logger = LoggerFactory.getLogger(BaseManagerSpringTest.class);
}

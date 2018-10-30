package test.com.charles.junit;

import com.charles.junit.Person;
import org.junit.*;

/**
 * Person Tester.
 *
 * @author CharlesDong
 * @version 1.0
 * @since 2017-12-17
 */
public class PersonTest {

    static Person p;

    @BeforeClass
    public static void beforeClass(){
        //运行整个Junit测试类时，添加了BeforeClass注解的方法，必须声明为静态方法，
        // 且添加了BeforeClass注解的方法，会在所有测试方法运行前运行
        System.out.println("beforeClass...");
        p = new Person();
    }

    @AfterClass
    public static void afterClass(){
        //添加了AfterClass注解的方法，会在所有测试方法运行结束后运行
        System.out.println("afterClass...");
    }

    @Before
    public void before() throws Exception {
        //每一个测试方法开始时都会运行
        System.out.println("before...");
    }

    @After
    public void after() throws Exception {
        //每一个测试方法结束时都会运行
        System.out.println("after...");
    }

    /**
     * Method: run()
     */
    @Test
    public void testRun() throws Exception {
        //断言，测试run方法返回的结果是否为期望的值1
        Assert.assertEquals(1,p.run());
        //测试数组类型的期望值和返回值是否相同
        Assert.assertArrayEquals(new int[]{1,2,},new int[]{1,2});
        Assert.assertFalse(false);
    }

    /**
     * Method: eat()
     */
    @Test
    public void testEat() throws Exception {
        //TODO: Test goes here...
        p.eat();
    }
}

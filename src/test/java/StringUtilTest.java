

import Utils.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

/**
 * @version Test.java, v 0.1 2021年09月13日 12:04 下午
 */
public class StringUtilTest {
    @Test
    public void rmBlankTest(){
        String testString ="  不会拓扑的猫";
        Assert.assertEquals("不会拓扑的猫", StringUtil.rmBlank(testString));
    }

    @Test
    public void isABATest(){
        String string = "   ABCBBCBA  ";
        Assert.assertEquals(true,StringUtil.isABA(string));
        string = " a ";
        Assert.assertEquals(true,StringUtil.isABA(string));
    }

}
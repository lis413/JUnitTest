
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class StringUtilsParametriseTest {
    private Boolean boo;
    private String arg;

    public StringUtilsParametriseTest(Boolean boo, String arg) {
        this.boo = boo;
        this.arg = arg;
    }

    @Parameterized.Parameters
    public static Collection<Object []> getTestParameters(){
        return Arrays.asList(new Object[][]{
                {Boolean.FALSE,"1234"},
                {Boolean.TRUE,"1212"},
                {Boolean.TRUE,"12"},
                {Boolean.FALSE,"1"}
        });
    }

    // "1234"-->false, "1212" --> true, "12" --> true, "1"-->false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllDifferentFalse(){
        StringUtils su = new StringUtils();
        assertEquals(boo, StringUtils.are2CharsAtHeadAndTailEqual(arg)  );
    }
}

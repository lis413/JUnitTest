import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringUtilsTest {

    // "   **" ---> "**". " **" ---> "**", "*****" ---> "*****",  "**   " ---> "**  "
    @Test
    public void testChopOffStarsAtHead(){
        assertEquals("**", StringUtils.chopOffStarsAtHead("  **"));
    }

    @Test
    public void testChopOffStarsAtHead_Single(){
        assertEquals("**", StringUtils.chopOffStarsAtHead(" **"));
    }

    @Test
    public void testChopOffStarsAtHead_None(){
        assertEquals("*****", StringUtils.chopOffStarsAtHead("*****"));
    }

    @Test
    public void testChopOffStarsAtHead_Single_BothAtRight(){
        assertEquals("**  ", StringUtils.chopOffStarsAtHead("**  "));
    }

    // "1234"-->false, "1212" --> true, "12" --> true, "1"-->false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllDifferentFalse(){
            assertFalse( StringUtils.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllSameFalse(){
        assertTrue( StringUtils.are2CharsAtHeadAndTailEqual("1212"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyTwo(){
        assertTrue( StringUtils.are2CharsAtHeadAndTailEqual("12"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne(){
        assertFalse( StringUtils.are2CharsAtHeadAndTailEqual("1"));
    }


    @Test
    public void testBubbleSort(){
        int[] arr = {4, 12, -17, 3};
        int[] expected = {-17, 3, 4, 12};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);

      //  assertEquals(new User ("Koly", 24), new User ("Koly", 24));

      }
}
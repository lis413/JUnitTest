import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Before.*;
import static org.junit.After.*;


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

    static User kolya = new User("Koly", 24);


    @BeforeClass
    public static void beforeClassSetUp(){
        kolya.setAge(25);
    }


//    @Before
//    public void setUp(){
//        kolya.setAge(25);
//    }

    @Test
    public void testUserUsingBefore1(){
        System.out.println(kolya.getAge());
    }

    @Test
    public void testUserUsingBefore2(){
        System.out.println(kolya.getAge());
    }

//    @After
//    public void setDown(){
//        kolya.setAge(24);
//    }

    @AfterClass
    public static void afterClassSetDown(){
        kolya.setAge(24);
    }

    @Test(expected = NullPointerException.class)
    public void testBubbleSort2(){
        int[] arr = null;
        int[] expected = {-17, 3, 4, 12};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);

        //  assertEquals(new User ("Koly", 24), new User ("Koly", 24));
    }



}
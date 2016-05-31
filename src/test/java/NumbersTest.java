import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumbersTest {
    @Test
    public void testRussianEndingsSmallNumbers() {
        RussianEnding re = new RussianEnding();
        assertEquals("0 спичек", re.text(0));
        assertEquals("1 спичка", re.text(1));
        assertEquals("2 спички", re.text(2));
        assertEquals("3 спички", re.text(3));
        assertEquals("4 спички", re.text(4));
        assertEquals("5 спичек", re.text(5));
        assertEquals("6 спичек", re.text(6));
        assertEquals("10 спичек", re.text(10));
        assertEquals("11 спичек", re.text(11));
        assertEquals("12 спичек", re.text(12));
    }

    @Test
    public void testRussianEndingsBigNumbers() {
        RussianEnding re = new RussianEnding();
        assertEquals("21 спичка", re.text(21));
        assertEquals("22 спички", re.text(22));
        assertEquals("31 спичка", re.text(31));
        assertEquals("32 спички", re.text(32));
        assertEquals("100 спичек", re.text(100));
        assertEquals("101 спичка", re.text(101));
        assertEquals("111 спичек", re.text(111));
        assertEquals("1000 спичек", re.text(1000));
    }
}

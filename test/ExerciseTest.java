import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseTest {

    @Test
    public void testValidatorLowercase() {
        assertTrue(Exercise.isValidCharacter('a'));
    }

    @Test
    public void testValidatorUppercase() {
        assertTrue(Exercise.isValidCharacter('A'));
    }

    @Test
    public void testValidatorSpecialChar() {
        assertFalse(Exercise.isValidCharacter('+'));
    }

    @Test
    public void testTextSortSimpleString(){
        String inputStr = "Hello World!";
        String expected = "dehllloorw";
        String result = Exercise.getSortedText(inputStr);
        assertEquals(result, expected);
    }

    @Test
    public void testTextSortMultilineString(){
        String inputStr = "When not studying nuclear physics, Bambi likes to play\n" +
                "beach volleyball.\n";
        String expected = "aaaaabbbbcccdeeeeeghhhiiiiklllllllmnnnnooopprsssstttuuvwyyyy";
        String result = Exercise.getSortedText(inputStr);
        assertEquals(result, expected);
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class  {
    @Test
    void testBasicMatch() {
        List<Integer> matches = RabinKarp.search("hello world", "world");
        assertEquals(List.of(6), matches);
    }

    @Test
    void testNoMatch() {
        List<Integer> matches = RabinKarp.search("abcdef", "gh");
        assertTrue(matches.isEmpty());
    }
}

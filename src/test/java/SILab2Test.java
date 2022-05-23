import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    public void testEveryStatement() {
        IllegalArgumentException illegalArgumentException;

        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertEquals("List length should be greater than 0", illegalArgumentException.getMessage());

        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0")));
        assertEquals("List length should be a perfect square", illegalArgumentException.getMessage());

        assertEquals(List.of("#", "2", "#", "#", "1", "2", "#", "2", "#"), SILab2.function(List.of("#", "0", "#", "#", "0", "0", "#", "0", "#")));
    }

    @Test
    public void testEveryBranch() {
        IllegalArgumentException illegalArgumentException;

        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));
        assertEquals("List length should be greater than 0", illegalArgumentException.getMessage());

        illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "0", "0")));
        assertEquals("List length should be a perfect square", illegalArgumentException.getMessage());

        assertEquals(List.of("#", "2", "#", "#", "1", "2", "#", "2", "#"), SILab2.function(List.of("#", "0", "#", "#", "0", "0", "#", "0", "#")));
    }
}